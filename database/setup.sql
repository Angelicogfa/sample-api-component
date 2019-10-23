CREATE DATABASE sample_database
GO
USE sample_database
GO
create table TODO (
Id uniqueidentifier not null primary key,
Titulo varchar(20) not null,
Descricao varchar(100) not null,
DataCriacao date not null)
GO
