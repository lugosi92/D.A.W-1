CREATE DATABASE Ciudadano;

USE Ciudadano;

CREATE TABLE if not exists Persona(
dni varchar(9) primary key,
nombre varchar(30),
apellidos varchar(50),
ciudad varchar(15),
fecha_n DATE

);

CREATE TABLE if not exists passwords(
dni varchar(9) primary key,
password BLOB
);

CREATE TABLE if not exists telefono(
dni_persona varchar(9),
telefono int(9)
);

ALTER TABLE telefono 
ADD CONSTRAINT fk_01
FOREIGN KEY(dni_persona) REFERENCES Persona(dni)
ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE passwords 
ADD CONSTRAINT fk_02
FOREIGN KEY(dni) REFERENCES Persona(dni)
ON DELETE CASCADE ON UPDATE CASCADE;
