create database if not exists revisao ;
use revisao;


create table user(
id int(11) NOT NULL auto_increment,
nome varchar(45)  not null,
endereco varchar(45) not null,
profisssao varchar(45) not null,
cidade varchar(45) not null,
primary key(id)
);
