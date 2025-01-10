-- A) Crear base de datos y tabla Cliente y CCC
CREATE DATABASE Banco;

USE Banco;

CREATE TABLE if not exists Cliente(
idCliente int(9) PRIMARY KEY NOT NULL,
Nombre varchar(20) not null
);
SET GLOBAL AUTO_INCREMENT_INCREMENT = 50;

CREATE TABLE if not exists CCC(
codCuenta BIGINT PRIMARY KEY NOT NULL,
propietario varchar(100) not null,
saldo DECIMAL (15,2) UNSIGNED CHECK (saldo >= 0)
);

-- D) Tabla operaciones 
CREATE TABLE if not exists Operaciones(
numero INT AUTO_INCREMENT PRIMARY KEY not null,
fechaOperacion DATE not null,
horaOperacion TIME not null,
descripcion varchar(100) not null,
cuentaOrigen BIGINT,
cuentaDestino BIGINT,
importe DECIMAL (15,2) 
);
ALTER TABLE Operaciones
ADD CONSTRAINT fk_01
FOREIGN KEY (cuentaOrigen) REFERENCES CCC(codCuenta);

ALTER table Operaciones
ADD CONSTRAINT fk_02
FOREIGN KEY (cuentaDestino) REFERENCES CCC(codCuenta);

-- D) Guardar operaciones realizadas
INSERT INTO Operaciones VALUES
(current_date, current_time, 'Alquiler de Casa', 123456789101112131415, 222324252627282930313, 600.00);

INSERT INTO Operaciones VALUES
(current_date, current_time, 'Alquiler habitacion', 123456789161718192021, 222324252627282930313, 500.00);

INSERT INTO Operaciones VALUES
(current_date, current_time, 'Deuda Viaje',123456789101112131415, 222324252627282930313, 500.00);

INSERT INTO Operaciones VALUES 
(current_date, current_time, 'Cena Amigos', 123456789101112131415, 222324252627282930313, 300.00);

-- B) INSERTAR DATOS CON UNA TRANSACCION
-- Empezar transaccion
BEGIN WORK;
-- INSERTAR DATOS
INSERT INTO CCC VALUES(123456789101112131415, 'Juan Lopez', 1000,00);
INSERT INTO CCC VALUES(123456789161718192021, 'Sara Gonzales', 500,00);
INSERT INTO CCC VALUES(222324252627282930313, 'Elena Gomez', 0,00);
-- Terminar una transaccion
COMMIT WORK;

-- C) Transferencias
-- Transferencias
BEGIN WORK;

--  Juan a Elena 600€ por Alquiler de casa
UPDATE CCC SET Saldo = saldo - 600 WHERE propietario = 'Juan Lopez';
UPDATE CCC SET Saldo = saldo + 600 WHERE propietario = 'Elena Gomez';

-- Sara a Elena 500€ por Alquiler habitacion
UPDATE CCC SET Saldo = saldo - 500 WHERE propietario = 'Sara Gonzalez';
UPDATE CCC SET Saldo = saldo + 500 WHERE propietario = 'Elena Gomez';

-- Juan a Elena 500€ por Deuda viaje
UPDATE CCC SET Saldo = saldo - 500 WHERE propietario = 'Juan Lopez ';
UPDATE CCC SET Saldo = saldo + 500 where propietario = 'Elena Gomez';

-- Juan a Elena 300€ por Cena de amigos
UPDATE CCC SET Saldo = saldo - 300 WHERE propietario = 'Juan Lopez';
UPDATE CCC SET Saldo = saldo + 300 WHERE propietario = 'Elena Gomez';



