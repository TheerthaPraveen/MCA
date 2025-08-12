create database l1;
use l1;
create table student(student_id int primary key,name varchar(20),age int,department varchar(20));
create table marks(mark_id int primary key,student_id int, foreign key (student_id) references student(student_id),subject varchar(30),marks int);
INSERT INTO Student (student_id, name, age, department) VALUES
(1, 'Amit', 20, 'CSE'),
(2, 'Bhavna', 21, 'ECE'),
(3, 'Chetan', 22, 'EEE'),
(4, 'Divya', 20, 'CSE'),
(5, 'Eshan', 23, 'ECE');

INSERT INTO Marks (mark_id, student_id, subject, marks) VALUES
(101, 1, 'DBMS', 85),
(102, 1, 'OS', 78),
(103, 2, 'DBMS', 66),
(104, 2, 'OS', 91),
(105, 3, 'DBMS', 45),
(106, 3, 'OS', 59),
(107, 4, 'DBMS', 92),
(108, 4, 'OS', 87),
(109, 5, 'DBMS', 35),
(110, 5, 'OS', 50);

-- display all the student details
select * from student;

-- list of all students who are from cse department
select * from student where department='cse';

-- display the names of students who have scored more than 80
select student.name from student
inner join marks on
student.student_id=marks.student_id
where marks>80;

-- show student name,subject,marks using join on both tables
select student.name,marks.subject,marks.marks
from marks
inner join student on
student.student_id=marks.student_id;

-- find the average marks for each subject
select subject ,avg(marks) as Average_marks from marks group by subject;
select subject , count(*) as count from marks group by subject;

-- update the marks of student with student id=1 in dbms to 90
update marks set marks=90 where student_id=1;
select * from marks;

-- count how many students are in each department
select department ,count(*) as dept_count from student group by department;

-- display the highest mark obtained in dbms
select max(marks) as highest_mark from marks where subject='DBMS';

-- find students who have not scored any marks in dbms
select student.name from student
inner join marks on 
student.student_id=marks.student_id
where marks.marks not='DBMS';

-- show the total marks scored by each student
select student.name ,sum(marks) as total_marks
from student
inner join marks on 
student.student_id=marks.student_id
group by student.name;


