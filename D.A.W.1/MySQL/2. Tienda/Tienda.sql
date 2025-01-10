drop database if exists Tienda;

-- No se puede tabla ordenes tambien auto_increment
-- Crear la base de datos

-- Cliente AUTO_INCREMENT de 5 en 5 
-- 
CREATE DATABASE IF NOT EXISTS Tienda;
USE deporte;

-- Crear la tabla Cliente
CREATE TABLE IF NOT EXISTS Cliente (
    idCliente INT AUTO_INCREMENT,
    nombreCliente VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255),
    PRIMARY KEY (idCliente)
);
SET @@auto_increment_increment =5;
SET @@auto_increment_offset = 5;

-- Crear la tabla Ordenes
CREATE TABLE IF NOT EXISTS Ordenes (
    idOrdenes INT AUTO_INCREMENT,
    idCliente INT ,
    fecha DATEtime DEFAULT current_timestamp,
    PRIMARY KEY (idOrdenes),
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
);


-- Crear la tabla Articulo
CREATE TABLE IF NOT EXISTS Articulo (
    numArticulo INT AUTO_INCREMENT,
    nombreArticulo VARCHAR(255),
    precio DECIMAL(10, 2) CHECK (precio >= 0),
    PRIMARY KEY (numArticulo)
);

-- Crear la tabla Pedidos
CREATE TABLE IF NOT EXISTS Pedidos (
    idOrdenes INT,
    numArticulo INT,
    cantidad INT,
    PRIMARY KEY (idOrdenes, numArticulo),
    FOREIGN KEY (idOrdenes) REFERENCES Ordenes(idOrdenes),
    FOREIGN KEY (numArticulo) REFERENCES Articulo(numArticulo)
);
-- Insertar datos en la tabla Cliente
INSERT INTO Cliente (nombreCliente, ciudad) VALUES
('Juan Pérez', 'Ciudad A'),
('María López', 'Ciudad B'),
('Carlos Martínez', 'Ciudad A');

-- Insertar datos en la tabla Ordenes
INSERT INTO Ordenes (idOrdenes) VALUES (101), (102), (103);

-- Insertar datos en la tabla Articulo
INSERT INTO Articulo (numArticulo, nombreArticulo, precio) VALUES
(1, 'Producto X', 10.50),
(2, 'Producto Y', 20.25),
(3, 'Producto Z', 15.75);

-- Insertar datos en la tabla Pedidos
INSERT INTO Pedidos (idOrdenes, numArticulo, cantidad) VALUES
(101, 1, 2),
(101, 2, 1),
(102, 3, 3),
(103, 1, 1),
(103, 2, 2);

