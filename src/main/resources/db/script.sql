CREATE TABLE product (
    id VARCHAR(10) NOT NULL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    description VARCHAR(20) NOT NULL,
    model VARCHAR(10) NOT NULL,
    price decimal(8,2) NOT NULL,
    active BOOLEAN NOT NULL
);