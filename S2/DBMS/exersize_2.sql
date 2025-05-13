create database student;
use student;

create table student(name varchar(20),
student_number smallint(10) primary key,
class smallint(10),
major varchar(10));

create table course(course_name varchar(50),
course_number varchar(10) primary key,
credit_hours smallint(10),
department varchar(10));

create table section(section_identifier smallint(10) primary key,
course_number varchar(10),
semester varchar(10),
year_year smallint(10),
instructor varchar(10),
foreign key (course_number) references course(course_number));

create table grade_report(student_number smallint(10),
section_identifier smallint(10),
grade varchar(5),
foreign key (student_number) references student(student_number),
foreign key (section_identifier) references section(section_identifier));

create table prerequisite(course_number varchar(10),
prerequisite_number varchar(10),
foreign key (course_number) references course(course_number),
foreign key (prerequisite_number) references course(course_number));