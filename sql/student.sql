USE javalabs;

CREATE TABLE Student (
    id int NOT NULL AUTO_INCREMENT,
    firstName varchar(255) NOT NULL,
    lastName varchar(255) NOT NULL,
    Age int,
    PRIMARY KEY (id)
); 

INSERT INTO Student VALUES(
	1,
    "Student 1 Name",
    "Student 1 Surname",
    18
);

SELECT * FROM Student;
DELETE FROM Student;