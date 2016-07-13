--创建数据库
create database ssh ;

--使用数据库
use ssh ;

--丢掉数据表
drop table user ;

--创建数据表
create table user(
	id 	int primary key auto_increment,
	username varchar(30),
	age varchar(4)
) ;


insert into user(id,username,age) values(1,"杨昌奎","34");
insert into user(id,username,age) values(2,"杨昌奎","34");
insert into user(id,username,age) values(3,"杨昌奎","34");
insert into user(id,username,age) values(4,"杨昌奎","34");
insert into user(id,username,age) values(5,"杨昌奎","34");
insert into user(id,username,age) values(6,"杨昌奎","34");
insert into user(id,username,age) values(7,"杨昌奎","34");
insert into user(id,username,age) values(8,"杨昌奎","34");
insert into user(id,username,age) values(9,"杨昌奎","34");