-------------------------------------------------------------------------------------
-- Version 1.0
-- run this code to set up database for the universitydb
-------------------------------------------------------------------------------------

/*==============================================================*/
/* Table: students                                                */
/*==============================================================*/
DROP TABLE IF EXISTS "students";
CREATE TABLE students
(
    student_id VARCHAR(6) PRIMARY KEY not null,
    first_name VARCHAR(255) null,
    last_name VARCHAR(255) null,
    dob DATE null,
    department VARCHAR(255) null,
    entrance_date DATE null,
    graduation_date DATE null,
    credits INT4 not null default 0,
    score DEC(10,2) default 0.00
);


COPY students(student_id,first_name,last_name,dob,department,entrance_date,graduation_date,credits,score
)
FROM '/myfolder/students.csv' -- update your working folder
DELIMITER ','
CSV HEADER;


/*==============================================================*/
/* Insert data                                         */
/*==============================================================*/
INSERT INTO students (	
					student_id, 
					first_name, 
					last_name, 
					dob, 
					department, 
					entrance_date, 
					graduation_date,
					credits, 
					score) 
				VALUES 
					('K30000','Jack','Thompson','2001-09-30','Software Engineering','2022-09-30',NULL,60,7.15);
commit;



