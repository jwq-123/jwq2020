create database exam_system;
use exam_system;
Create table t_user(
name varchar(15) primary key,
Password varchar(50) not null,
	tel char(11),
	school varchar(20),
	position char(8));

Create table apply(
id varchar(8) primary key,
cname varchar(50) not null,
Name varchar(20) not null,
	sex char(2),
	school varchar(50),
	tel char(11));

Create table info(
cname varchar(50) primary key,
Time datetime,
Name varchar(20) not null,
	sex char(2),
	school varchar(50));

Create table num(
cname varchar(50) primary key,
sum char(8));

create table Stair_course(
    SCNo char(5) primary key,
    SCName varchar(225) not null

);
create table Second_course(
    SCNo char(5) not null,
    CNo char(5) not null,
    CName varchar(30) not null unique,
    Primary key(SCNo,CNo),
    CTime decimal(3,0),
    CCredits int default 4,
    CTerm char(1) not null,
    Foreign key (SCNo) references Stair_course(SCNo)

);