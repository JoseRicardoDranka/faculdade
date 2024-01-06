drop database if exists Concessionaria;
create database Concessionaria;
use Concessionaria;

create table carro(
	descricao varchar(50)
);

alter table carro
rename to veiculo;

alter table veiculo 
add column (cor varchar(30) not null default 'branco');

alter table veiculo
 add column idveiculo int primary key auto_increment first ;

alter table veiculo
 add column placa varchar(7) after descricao;
 
 
 