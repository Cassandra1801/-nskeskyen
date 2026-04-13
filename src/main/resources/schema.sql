CREATE DATABASE IF NOT EXISTS wishlist;
USE wishlist;

-- Drop i omvendt rækkefølge pga. foreign key constraints
DROP TABLE IF EXISTS wishes;
DROP TABLE IF EXISTS wishlists;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(
    user_Id  INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50)  NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    mail     VARCHAR(50)  NOT NULL,
    name     VARCHAR(50)  NOT NULL
);

CREATE TABLE IF NOT EXISTS flexibleserverdb(
    wishlist_Id INT PRIMARY KEY AUTO_INCREMENT,
    user_Id     INT         NOT NULL,           -- kolonnen skal defineres!
    name        VARCHAR(50) NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_Id) REFERENCES users (user_Id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS wishes(
    wish_Id     INT PRIMARY KEY AUTO_INCREMENT,
    wishlist_Id INT         NOT NULL,           -- kolonnen skal defineres!
    name        VARCHAR(50) NOT NULL,
    brand       VARCHAR(50),
    description VARCHAR(255),
    type        VARCHAR(50),
    price       DECIMAL(10, 2),
    link        VARCHAR(255),                   -- URLs kan være lange
    is_favorite BOOLEAN DEFAULT FALSE,
    is_reserved BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (wishlist_Id) REFERENCES flexibleserverdb (wishlist_Id) ON DELETE CASCADE
);