DROP TABLE IF EXISTS wishes;
DROP TABLE IF EXISTS wishlist;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
    user_id  INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50)  NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    mail     VARCHAR(50)  NOT NULL,
    name     VARCHAR(50)  NOT NULL
);

CREATE TABLE IF NOT EXISTS wishlist (
    wishlist_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id     INT         NOT NULL,
    name        VARCHAR(50) NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS wishes (
    wish_id     INT PRIMARY KEY AUTO_INCREMENT,
    wishlist_id INT         NOT NULL,
    name        VARCHAR(50) NOT NULL,
    brand       VARCHAR(50),
    description VARCHAR(255),
    type        VARCHAR(50),
    price       DECIMAL(10, 2),
    link        VARCHAR(255),
    is_favorite BOOLEAN DEFAULT FALSE,
    is_reserved BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (wishlist_id) REFERENCES wishlist(wishlist_id) ON DELETE CASCADE
);
