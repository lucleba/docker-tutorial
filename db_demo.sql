--SQL Server
CREATE DATABASE TestDB;
USE TestDB;
CREATE TABLE tblStudent(
    studentId INT IDENTITY(1, 1),
    studentName NVARCHAR(100),
    age int CHECK(age > 0),
	email varchar(100)
);
SELECT * FROM tblStudent;
INSERT INTO tblStudent(studentName, age)
VALUES('Le Ba Luc', 30);

--MySQL
CREATE DATABASE TodoDB;
USE TodoDB;
CREATE TABLE TodoDB.tbl_student (
	studentId INT primary key auto_increment,
	studentName varchar(100) NOT NULL,
	age INT check(age > 0),
	email varchar(100)
);
SELECT * FROM tbl_Student;
INSERT INTO tblStudent(studentName, age)
VALUES('Le Ba Luc', 30);