create database Form;
Show databases;
use form;

create table register(name varchar(25), registration varchar(25),mobile varchar(10), gender varchar(15), Course varchar(25),Email varchar(40), Event varchar(40), time varchar(40), Year varchar(20));

select * from register;

create table event(eventname varchar(50),eventdate varchar(20),eventtime varchar(20),eventvenue varchar(50),eventtype varchar(50),eventmotive varchar(50),specialguest varchar(20),eventlanguage varchar(10),creatorname varchar(20),creatormob varchar(10),createremail varchar(20));

select * from event;