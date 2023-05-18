
CREATE DATABASE MyApp;
USE MyApp;
CREATE TABLE user_tbl (
    user_id INT PRIMARY KEY,
    user_firstname VARCHAR(40) NOT NULL,
    user_lastname VARCHAR(40) NOT NULL,
    user_email VARCHAR(60) NOT NULL,
    user_password  VARBINARY(255) NOT NULL
);


select*from user_tbl

