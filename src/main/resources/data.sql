INSERT INTO users (username, password, email, name)
SELECT 'testuser', '1234', 'testuser@mail.com', 'Test User'
    WHERE NOT EXISTS (
    SELECT 1 FROM Users WHERE username = 'testuser'
);