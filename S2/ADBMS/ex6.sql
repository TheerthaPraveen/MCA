create database store;

use store;

create table product(pdtid int primary key,pname varchar(30),price decimal(6,2),qtyinstock int);
create table sales(saleid int primary key,deliveryaddress varchar(30));
create table saleitem(saleid int,foreign key(saleid) references sales(saleid),pdtid int,foreign key(pdtid) references product(pdtid) ,qty int);

insert into product(pdtid,pname,price,qtyinstock) values (101,'pencil',5,10),(102,'pen',3,10);

insert into sales(saleid,deliveryaddress) values (001,'home123'),(002,'home345');

select * from product;
insert into saleitem (saleid,pdtid,qty) values (001,101,2);
insert into saleitem (saleid,pdtid,qty) values (001,101,10);