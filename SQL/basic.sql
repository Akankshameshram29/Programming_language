--Assignment sheet by Gpt


--Assignment1
--creating student table
CREATE TABLE Students
(id INT,age INT,name VARCHAR(100), Department VARCHAR(50),dateofbirth DATE);

--inserting into the table
INSERT INTO Students (id, age, name, department, dateofbirth) VALUES 
(101, 21, 'Akanksha Meshram', 'Artificial Intelligence & Data Science', '2004-01-01'),
(102, 20, 'Anchal Legala', 'Artificial Intelligence & Data Science', '2005-01-01'),
(117, 20, 'John Doe', 'Information Technology', '2005-01-01'),
(201, 19, 'Ritika Khanna', 'Computer Science & Engineering', '2006-01-01'),
(120, 21, 'Bhayva Paul', 'Electronics', '2004-01-01'),
(104, 20, 'Rohan Sharma', 'Information Technology', '2005-01-01'),
(111, 22, 'Sneha Patil', 'Computer Science & Engineering', '2003-01-01'),
(240, 21, 'Priya Deshmukh', 'Artificial Intelligence & Data Science', '2004-01-01'),
(132, 23, 'Amit Verma', 'Information Technology', '2002-01-01'),
(125, 19, 'Karan Joshi', 'Computer Science & Engineering', '2006-01-01');


--updating age where id = 102
UPDATE Students SET age = 22 WHERE id = 102;

--Delete row with name John
DELETE FROM Students WHERE name = 'John Doe';

--viewing the table
SELECT * FROM Students;

DROP TABLE Students;


--Assignment2
--Retrieve student with age greater than 21
SELECT * FROM Students WHERE age>21;

--List student from IT OR CS department 
SELECT * FROM Students WHERE Department = 'Information Technology' OR  Department = 'Computer Science & Engineering';

--select name starting with 'A'
SELECT * FROM Students WHERE name LIKE 'A%';

--youngest 3 students in department
SELECT * FROM Students ORDER BY age ASC LIMIT 3;

--students between 20 and 25
SELECT * FROM Students WHERE age BETWEEN 20 AND 25 ORDER BY name ASC;


--Assignment 3
--number of students in each students
SELECT Department, COUNT(*) AS student_count 
FROM Students GROUP BY Department;

--Average age of students
SELECT AVG(age) AS Average_age FROM Students ;

--Show maximum age of students;
SELECT MAX(age) AS Max_age FROM Students;

--get the first three letter of student name
SELECT SUBSTRING(name,1,3) FROM Students;

--current date and extract year from dateofbirth Column
SELECT CURRENT_DATE AS current_date;

SELECT  EXTRACT (YEAR FROM dateofbirth) AS Birth_year FROM Students;


--Assignment 4
--Count number of students in each department.
SELECT Department, COUNT(*) AS student_count 
FROM Students GROUP BY Department;

--Show departments with more than 5 students.
SELECT Department, COUNT(*) AS student_count 
FROM Students GROUP BY Department HAVING COUNT(*) > 5;

--Find average age per department.
SELECT Department, AVG(age) AS average_age 
FROM Students GROUP BY Department;

--List departments where the average student age is above 22.
SELECT Department, AVG(age) AS average_age 
FROM Students GROUP BY Department HAVING AVG(age) > 22;

--Assignment 5
--Join students and courses on department and list course names for each student.
SELECT S.name, S.department, C.course_name 
FROM Students S 
INNER JOIN Courses C ON S.department = C.dept;

--Get all students and their course names (even if they don’t have a course).
SELECT S.name, S.department, C.course_name 
FROM Students S 
 LEFT JOIN Courses C ON S.department = C.dept;

--Find courses with no students.
SELECT C.course_name, C.dept 
FROM Courses C 
LEFT JOIN Students S ON C.dept = S.department 
WHERE S.department IS NULL;

--List all departments and number of students per course.
SELECT C.dept, C.course_name, COUNT(S.id) AS student_count 
FROM Courses C 
LEFT JOIN Students S ON C.dept = S.department 
GROUP BY C.dept, C.course_name;


--Assignment 6
--Find students older than the average age.

SELECT * FROM Students WHERE age > (SELECT AVG(age) FROM Students);

--Get names of students in the department with the most students.
SELECT name FROM Students 
WHERE department = (
    SELECT department 
    FROM Students 
    GROUP BY department 
    ORDER BY COUNT(*) DESC 
    LIMIT 1
);

--List students who are in the same department as the youngest student.
SELECT name, department 
FROM Students 
WHERE department IN (
    SELECT DISTINCT department 
    FROM Students 
    WHERE age = (SELECT MIN(age) FROM Students)
);


--Assignment 7
--List names from table A and table B using UNION.
SELECT student_id, name, age, department 
FROM SecA UNION SELECT student_id, name, age, department 
FROM SecB;


--Find common students enrolled in both Math and Physics using INTERSECT.
SELECT name FROM Math INTERSECT SELECT name from Physics;

--Find students who enrolled in Math but not Physics.
SELECT name FROM Math EXCEPT SELECT name FROM Physics;


--Assignment 8
--Assign ranks to students based on age within each department.
SELECT 
    name, 
    department, 
    age,
    RANK() OVER (PARTITION BY department ORDER BY age ASC) AS rank_no 
FROM Students;


--Show the oldest student in each department.
SELECT name, department, age 
FROM Students 
WHERE (department, age) IN (
    SELECT department, MAX(age) 
    FROM Students 
    GROUP BY department
);

--Assign row numbers to students sorted by name.
SELECT name,age,department, ROW_NUMBER() OVER (ORDER BY name) as row_num from Students;

--Find second youngest student per department using window functions.
SELECT name, department, age 
FROM (
    SELECT 
        name, 
        department, 
        age,
        RANK() OVER (PARTITION BY department ORDER BY age ASC) AS rank_no 
    FROM Students
) AS ranked_students
WHERE rank_no = 2;


--Assignment 9
--Create a view of all CS department students.
CREATE VIEW view1 AS SELECT * FROM Students WHERE department= 'Computer Science & Engineering';

SELECT * FROM view1;

--Create a view that shows each department's student count.
CREATE VIEW view2 AS SELECT COUNT(	Students.departmemt) FROM Students GROUP BY department;