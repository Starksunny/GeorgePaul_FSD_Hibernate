create database hibernate_crud;
use hibernate_crud;
drop table if exists `teacher`;
create table `teacher`(id int not null auto_increment primary key, f_Name varchar(50), l_Name varchar(50), email varchar(50));
select * from teacher;