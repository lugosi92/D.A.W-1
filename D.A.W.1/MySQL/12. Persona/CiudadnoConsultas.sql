use Ciudadano;

-- 1.- Mostrar las personas con sus telefonos
SELECT dni, nombre, apellidos, ciudad, telefono
FROM Persona 
INNER JOIN telefonos ON Persona.dni = telefonos.dni_persona;

-- B) solo a Juan
SELECT dni, nombre, apellidos, ciudad, telefono
FROM Persona 
INNER JOIN telefonos ON Persona.dni = telefonos.dni_persona
WHERE Persona.nombre = 'Juan';

-- 2.- Todas las personas con sus telefonos lo tengan o no
SELECT dni, nombre, apellidos, ciudad, telefono
FROM Persona p
LEFT JOIN telefonos t ON p.dni = t.dni_persona;

-- Personas que tienen telefonos, con sus telefonos
SELECT nombre, apellidos, telefono 
FROM Persona p
RIGHT JOIN telefonos t ON p.dni = t.dni_persona;

-- Personas que tiene telefonos, solo los datos de la persona
SELECT DISTINCT nombre, apellidos
FROM Persona p
RIGHT JOIN telefonos t ON p.dni = t.dni_persona;

--
