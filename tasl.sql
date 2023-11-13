create database task_management;
use task_management;
create table task_table( id int not null primary key auto_increment, title varchar(255), description varchar(255), completed boolean);
insert into task_table (title, description, completed) values ('waiters', 'clean table', 0);