CREATE DATABASE IF NOT EXISTS residencia1;

use residencia1;

CREATE TABLE IF NOT EXISTS residencia(
codHabitacion INT (3) NOT NULL,
telefono INT(3) NOT NULL,
numCamasLibres int(1) NOT NULL,
PRIMARY KEY(codHabitacion),
CONSTRAINT ch_01 CHECK (numCamasLibres BETWEEN 0 AND 2)
);

CREATE TABLE IF NOT EXISTS alumnos(
codigo INT(4) NOT NULL,
nombre varchar(30) NOT NULL,
codHabitacion INT(3) NOT NULL,
primary key (codigo),
CONSTRAINT FK_01 foreign key alumnos(codHabitacion) REFERENCES residencia 
(codHabitacion)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS notas_asignaturas(
codigo INT(4) NOT NULL,
asignatura ENUM('electronica', 'estadistica', 'telematica') NOT NULL,
convocatoria ENUM('Jun-19', 'Feb-19') NOT NULL,
nota DECIMAL (3,2) NOT NULL,
primary key(codigo, asignatura),
CONSTRAINT fk_02 foreign key notas_asignaturas(codigo)
REFERENCES alumnos(codigo)
ON DELETE NO ACTION
ON UPDATE CASCADE
);

START TRANSACTION;
INSERT INTO residencia VALUES (120, 450, 0);
INSERT INTO residencia VALUES (100, 442, 1), (90,440,2);

INSERT INTO alumnos VALUES (1024, 'Juan García', 120), (2010, 'Sara Gómez', 100),
(3010, 'Belén Torres', 120);

INSERT INTO notas_asignaturas VALUES
(1024, 'electronica', 'Jun-19', 5.50),
(1024, 'estadistica', 'Feb-19', 6.00),
(1024, 'telematica', 'Jun-19', 7.00),
(2010, 'electronica', 'Jun-19', 8.50),
(2010, 'estadistica', 'Feb-19', 6.50),
(2010, 'telematica', 'Feb-19', 7.00),
(3010, 'electronica', 'Feb-19', 5.30),
(3010, 'estadistica', 'Feb-19', 7.20),
(3010, 'telematica', 'Jun-19', 6.50);

COMMIT;

SET SQL_SAFE_UPDATES = 0;
UPDATE alumnos SET nombre='Juan Torres' WHERE nombre LIKE 'Juan García';

ALTER TABLE notas_asignaturas DROP constraint fk_02;
ALTER TABLE alumnos MODIFY COLUMN codigo varchar(9);
ALTER TABLE notas_asignaturas MODIFY COLUMN codigo varchar(9);

ALTER TABLE notas_asignaturas ADD CONSTRAINT fk_02 FOREIGN KEY (codigo) 
REFERENCES alumnos(codigo) ON UPDATE CASCADE
ON DELETE NO ACTION;

UPDATE alumnos SET codigo='00000000A' WHERE codigo="1024";
UPDATE alumnos SET codigo='11111111B' WHERE codigo="2010";
UPDATE alumnos SET codigo='22222222C' WHERE codigo="3010";

ALTER TABLE alumnos RENAME COLUMN codigo TO DNI;
ALTER TABLE notas_asignaturas RENAME COLUMN codigo TO DNI;
SET SQL_SAFE_UPDATES = 1;

-- 1 
SELECT codHabitacion, count(codHabitacion) AS NUMERO_ALUMOS 
FROM alumnos GROUP BY codHabitacion;

-- 2
SELECT DNI FROM alumnos WHERE nombre='Juan Torres';
SELECT asignatura, convocatoria, nota FROM notas_asignaturas
WHERE DNI=(SELECT DNI FROM alumnos WHERE nombre='Juan Torres');

-- 3

-- Paso 1: Obtener maxima nota
-- Paso 2: Obtener el DNI
-- Paso 3: Crear la subconsulta
SELECT distinct alumnos.DNI, nombre FROM alumnos, notas_asignaturas
WHERE alumnos.DNI = notas_asignaturas.DNI AND 
notas_asignaturas.DNI IN(SELECT DNI FROM notas_asignaturas 
WHERE nota =(SELECT max(nota) FROM notas_asignaturas WHERE asignatura = "Electronica"));


-- 4 Obtener la media de las notas de los alumnos

SELECT avg(nota) AS MEDIA_ALUMNO, dni FROM notas_asignaturas
GROUP BY dni;

select avg(nota) AS MEDIA_ALUMNO , nombre
FROM alumnos, notas_asignaturas
WHERE alumnos.DNI = notas_asignaturas.DNI
GROUP BY nombre HAVING nombre= "Juan Torres";

-- 5 Obten la media de las nota del alumno juan torres
select avg(nota) AS MEDIA_ALUMNO , nombre
FROM alumnos, notas_asignaturas
WHERE alumnos.DNI = notas_asignaturas.DNI
GROUP BY nombre HAVING nombre= "Juan Torres";