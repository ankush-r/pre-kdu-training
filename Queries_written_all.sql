show databases;
create database employee;
use employee;
create table department(department_id varchar(20),department_name varchar(20));

alter table department 
add constraint departmentid_primarykey primary key (department_id);

create table employee(employee_id varchar(10),employee_name varchar(30),salary int(6),department_id varchar(20));

alter table employee
add constraint employeeid_primarykey primary key (employee_id);

alter table employee
add constraint departmentid_foreignkey foreign key (department_id) references department (department_id);

insert into department values('S1','sales');
insert into department values('I2','IT');
insert into department values('A3','Analytics');
insert into department values('M4','Marketing');

insert into employee values('E101','John Wick',25000,'S1');
insert into employee values('E102','Abhram lincoln',30000,'S1');
insert into employee values('E103','John Terry',45000,'I2');
insert into employee values('E104', 'Julie wilson',42000,'I2');
insert into employee values('E105','Ram shrestha',60000,'A3');
insert into employee values('E106','Tisa Gurung',47000,'A3');
insert into employee values('E107','Salman Khan',51000,'M4');
insert into employee values('E108','Katrina Kaif',32000,'M4');

select e.employee_id,e.employee_name,d.department_name
from employee e
inner join department d on e.department_id = d.department_id;

select e.employee_name,e.salary
from employee e
order by salary desc;

select d.department_name, avg(e.salary) average_salary
from employee e
join department d on d.department_id = e.department_id
group by d.department_id;




