CREATE TABLE Employee(
	employee_id SERIAL PRIMARY KEY, 
	name VARCHAR(100) NOT NULL, 
	position VARCHAR(50),
	department VARCHAR(50),
	hire_date DATE,
	salary NUMERIC(10,2)
);
SELECT * FROM Employee;

--Inserting data into the table
INSERT INTO Employee(name, position, department ,hire_date, salary)
	VALUES('Akanksha Meshram', 'ML Engineer', 'Data science','2025-04-14',30000),
	('Tanvi Meshram','Video Editor','Graphics','2024-11-20',15000),
	('Krupali Shivankar','Social Media Manager','Marketing','2024-06-11',25000),
	('Tina Derker','Front-end developer','IT','2025-3-25',30000),
	('Akriti Sharma','SQL Developer','DataBase','2025-01-10',25000);

-- this removes all record but keeps the structure
TRUNCATE TABLE Employee RESTART IDENTITY;

--removing the row from table
DELETE FROM Employee where employee_id = 2;

--dropping the column
ALTER TABLE Employee DROP COLUMN hire_date;

-- deletion of table
DROP TABLE IF EXISTS Employee;

--updating the information in table
UPDATE Employee set salary = 45000 WHERE
name = 'Akanksha Meshram';


--for accessing the data in order
SELECT * FROM Employee ORDER BY employee_id ASC;

--updating multiple columns in a row
UPDATE Employee set position = 'Blockchain Developer',department='IT' 
	WHERE Employee_id=3

--To rename the name column to Fullname column
ALTER TABLE Employee RENAME COLUMN name to Fullname;


--T0 change the datatype of position column to char
ALTER TABLE Employee ALTER COLUMN position TYPE char(25);

--To add a not null Constraint to salary column
ALTER TABLE Employee ALTER COLUMN Salary SET NOT NULL;





