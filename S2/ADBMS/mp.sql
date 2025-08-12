use l1;
create table department(deptid int primary key,dname varchar(20) not null);
create table employee(eid int primary key,ename varchar(20),deptid int,foreign key(deptid) references department(deptid),designation varchar(30),salary int check (salary>=10000),doj date);

INSERT INTO department (deptid, dname) VALUES
(1, 'Sales'),
(2, 'Marketing'),
(3, 'Finance');

INSERT INTO employee (eid, ename, deptid, designation, salary, doj) VALUES
(101, 'Sudha', 2, 'Clerk', 20000, '2010-04-01'),
(102, 'David', 1, 'Manager', 50000, '2018-02-18'),
(103, 'Preethi',3, 'Clerk', 35000, '2011-06-13'),
(104, 'Kiran', 1, 'Salesman', 30000, '2011-03-07'),
(105, 'Meenal', 2, 'Clerk', 50000, '2011-12-09'),
(106, 'Sunitha',1, 'Manager', 25000, '2018-09-25'),
(107, 'Akhil', 3, 'Clerk', 25000, '2014-02-26'),
(108, 'Sushma',2, 'Manager', 45000, '2012-01-31');

-- to display all the employees who earn more than avg salary of all the employees in the company
select ename from employee where salary>=avg(salary);

-- to sort the employee table in the descending order of their salaries
select * from employee order by salary desc;

select distinct(designation) from employee;

select employee.eid,employee.designation,department.dname
from employee
inner join department on
employee.deptid=department.deptid
order by salary asc;

-- to display all the clerks in deptid 02
select * from employee where designation="clerk" and deptid=2;

-- to display all the employees who joined in the year 2011
select * from employee where doj between '2011-01-01' and '2011-12-31';

-- to display all the employees who joined in the month of february
select * from employee where monthname(doj)="February";

-- to display all the employees whose salary is between 30000 and 45000
select * from employee where salary between 30000 and 40000;

-- to display all the employee details along with their work experience in the 