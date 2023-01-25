--SQL Server
CREATE DATABASE TestDB;
USE TestDB;
CREATE TABLE tblStudent(
    studentId INT IDENTITY(1, 1),
    studentName NVARCHAR(100),
    age int CHECK(age > 0)
);
SELECT * FROM tblStudent;
INSERT INTO tblStudent(studentName, age)
VALUES('Nguyen Duc Hoang', 44);

--MySQL
CREATE DATABASE TestDB;
USE TestDB;
CREATE TABLE TestDB.tblStudent (
	studentId INT primary key auto_increment,
	studentName varchar(100) NULL,
	age INT check(age > 0)
);
SELECT * FROM tblStudent;
INSERT INTO tblStudent(studentName, age)
VALUES('Nguyen Duc Hoang', 44);