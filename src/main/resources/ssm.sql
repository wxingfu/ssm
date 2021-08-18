DROP DATABASE IF EXISTS ssm;
CREATE DATABASE ssm CHARSET=utf8;

USE ssm;

DROP TABLE IF EXISTS books;
CREATE TABLE books (
  bookID int(10) NOT NULL AUTO_INCREMENT,
  bookName varchar(100) NOT NULL,
  bookCounts int(11) NOT NULL,
  detail varchar(200) NOT NULL,
  PRIMARY KEY(bookID)
);

TRUNCATE TABLE books;

INSERT INTO books(bookID,bookName,bookCounts,detail) VALUES (1, 'Java', 1, '从入门到放弃'),(2, 'MySQL', 10, '从删库到跑路'),(3, 'Linux', 5, '从进门到进牢');
