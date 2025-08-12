create database university;
use university;

create table student(name varchar(30),student_number int primary key,class int,major varchar(20));

create table course (course_name varchar(30), course_number varchar(19) primary key,credit_hours int,department varchar(30));

create table section (section_identifier int primary key,course_number varchar(19), foreign key(course_number) references course(course_number),
semester varchar(20),year int,instructor varchar(20));

create table grade_report ( student_number int, foreign key(student_number) references student(student_number), section_identifier int,grade varchar(2),
foreign key (section_identifier) references section(section_identifier));

CREATE TABLE prerequisite(COURSE_NUMBER VARCHAR(20),PREREQUISITE_NUMBER VARCHAR(20) PRIMARY KEY,FOREIGN KEY(COURSE_NUMBER) REFERENCES COURSE(COURSE_NUMBER));

INSERT INTO STUDENT VALUES("SMITH",17,1,"CS"),("BROWN",8,2,"CS");

INSERT INTO COURSE VALUES("INTRO TO COMPUTER SCIENCE","CS1310",4,"CS"),("DATA STRUCTURES","CS3320",4,"CS"),
("DISCRETE MATHEMATICS","MATH2410",3,"MATH"),("DATABASE","CS3380",3,"CS");

INSERT INTO PREREQUISITE VALUES("CS3380","CS3320"),("CS3380","MATH2410"),("CS3320","CS1310");

INSERT INTO SECTION VALUES (85,"MATH2410","FALL","07","KING"),(92,"CS1310","FALL","07","ANDERSON"),
(102,"CS3320","SPRING","08","KNUTH");

INSERT INTO SECTION VALUES(112,"MATH2410","FALL","08","CHANG"),
(119,"CS1310","FALL","08","ANDERSON"),
(135,"CS3380","FALL","08","STONE");

INSERT INTO GRADE_REPORT VALUES
(17,112,"B"),
(17,119,"C"),
(8,85,"A"),
(8,92,"A"),
(8,102,"B"),
(8,135,"A");


-- Select all the courses and grades of student SMITH
select student.name,grade_report.grade,course.course_name
from student 
inner join grade_report on student.student_number=grade_report.student_number
inner join section on grade_report.section_identifier=section.section_identifier
inner join course on section.course_number=course.course_number
where student.name='Smith';

-- list the names of students who took the section of 'Database' course offered in fall 2008 and their grades in the section
select student.name,course.course_name,section.semester,section.year,grade_report.grade
from student
inner join grade_report on student.student_number=grade_report.student_number
inner join section on section.section_identifier=grade_report.section_identifier
inner join course on course.course_number=section.course_number
where course_name='Database' and section.year='08' and section.semester='Fall';

-- list the prerequistics of the 'Database' course
-- select course.course_name as Course_Name,course.course_number
-- from course
-- inner join prerequisite on course.course_number=prerequisite.course_number
-- where course.course_name="Database";

-- View to retrieve the names of all senior students majoring in ‘CS’ (computer science).
create view cs_senior as select from student where major='CS';


