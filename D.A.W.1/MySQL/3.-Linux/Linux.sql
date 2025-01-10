CREATE DATABASE IF NOT EXISTS carpeta;
use carpeta;

CREATE TABLE IF NOT EXISTS carpetas(
id INT (4) PRIMARY KEY NOT NULL,
nombre varchar(128) NOT NULL,
descripcion varchar(256) NOT NULL,
fechaCreacion datetime default current_timestamp,
idSuperior int (4),
CONSTRAINT fk_01 FOREIGN KEY (idSuperior)
REFERENCES carpetas(id)
ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO carpetas (id, nombre, descripcion)VALUES
(1, "/Raiz", "Carpeta superior");

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(2, "/Home", "Carpeta personal", 1);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(3, "/Home/elena", "Carpeta personalizada", 2);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(4, "/Home/elena/documents", "Carpeta documentos", 3);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(5, "/Home/elena/descargas", "Carpeta descargas", 3);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(6, "/Home/elena/music", "Carpeta música", 3);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(7, "/Home/elena/image", "Carpeta imágenes", 3);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(8, "/Home/elena/public", "Carpeta public", 3);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(9, "/Home/elena/snap", "Carpeta snap", 3);

INSERT INTO carpetas (id, nombre, descripcion, idSuperior)VALUES
(10, "/Home/elena/templates", "Carpeta plantillas", 3);