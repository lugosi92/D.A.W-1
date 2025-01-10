Drop database if exists fabricante;
create database if not exists fabricante;
use fabricante;


create table if not exists fabricante(
codigo int (10) primary key,
nombre varchar(100)
);

create table if not exists producto (
codigo int(10) primary key,
nombre varchar(100),
precio double,
codigo_fabricante int(10),
constraint fk_01 FOREIGN KEY (codigo_fabricante) references fabricante(codigo) on delete cascade on update cascade
);


INSERT INTO fabricante VALUES (1, 'Sony'),
(2, 'Creative Labs'),
(3, 'Hewlett-Packard'),
(4, 'Iomega'),
(5, 'Fujitsu'),
(6, 'Winchester'),
(7, 'Bose');

INSERT INTO producto VALUES (1,'Hard drive',240 , 5 ),
(2,'Memory',120 , 6 ),
(3,'Zip Drive', 150,4 ),
(4,'Floppy disk',150 ,4 ),
(5,'Monitor',240 ,1 ),
(6,'DVD drive', 180 ,2 ),
(7,'CD drive', 90 ,2 ),
(8,'Printer',270 ,3 ),
(9,'Toner cartridge', 66  , 3 ),
(10, 'DVD burner', 180, 2 );