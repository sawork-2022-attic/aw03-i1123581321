CREATE TABLE product (
    id VARCHAR(32),
    name VARCHAR(64) NOT NULL,
    price DECIMAL(8,2) NOT NULL,
    image VARCHAR(64) NOT NULL,
    PRIMARY KEY(id)
);