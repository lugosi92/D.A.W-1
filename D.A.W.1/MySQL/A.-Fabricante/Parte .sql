USE 1_Fabricante;

SELECT * FROM fabricante;
SELECT * FROM producto;

SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- DUDAS
-- Pide dos formas diferentes: 1. Con inner join, otra con join implicito
-- Ejercicio 30 ni idea de hacerlo sin union

-- ---------------------------------
-- Parte III: Consultas complejas.---
-- ---------------------------------

-- 25- Cuenta el número de productos que tiene cada fabricante, mostrando el nombre del fabricante.

SELECT count(*) AS numero_productos, f.nombre AS nombre_fabricante
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
GROUP BY f.nombre;

-- Correcion
SELECT count(*) AS numero_producto, f.nombre AS nombre_fabricante
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
GROUP BY f.nombre;

-- 26- Muestra el nombre, precio y fabricante de todos los productos, ordenado por el nombre en forma ascendente. 
-- Hazlo de dos formas diferentes.

SELECT p.nombre AS nombre_producto, concat(p.precio, '€') AS nombre_precio, f.nombre as nombre_fabricante
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
ORDER BY p.nombre ASC;

-- Utilizando JOIN implicito
SELECT p.nombre AS nombre_producto, concat(p.precio, '€') AS nombre_precio, f.nombre as nombre_fabricante
FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo
order by p.nombre ASC;

-- 27- Calcula el precio medio de los productos de cada fabricante, mostrando el nombre de cada fabricante y su símbolo en €.
-- Hazlo de dos formas diferentes

SELECT concat(avg(p.precio),'€') AS precio_medio , f.nombre as nombre_fabricante
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
GROUP BY f.nombre;

SELECT concat(avg(p.precio),'€') AS precio_medio , f.nombre as nombre_fabricante
FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo
GROUP BY f.nombre;

-- Tabla empotrada 
SELECT CONCAT((SELECT AVG(p.precio) FROM producto p 
WHERE p.codigo_fabricante = f.codigo), 2) AS precio_medio,
    f.nombre AS nombre_fabricante
    FROM fabricante f;
    
    
-- 28- Selecciona los nombres de los fabricantes cuya media del precio de productos supera los 150€.
-- Mostrar el nombre fabricante y su media,
-- ordenado por su media de forma descendente.
-- Hazlo de dos formas diferentes.

SELECT avg(p.precio) as precio_medio, f.nombre AS nombre_fabricante 
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
GROUP BY f.nombre
HAVING precio_medio > 150
ORDER BY precio_medio DESC;

SELECT concat(format((SELECT avg(precio) FROM producto P WHERE p.codigo_fabricante = f.codigo), 2), '€') AS precio_medio,
 f.nombre AS nombre_fabricante
FROM fabricante f
HAVING precio_medio > 150
ORDER BY precio_medio DESC;

-- Correcion 
SELECT CONCAT(FORMAT((SELECT AVG(precio) FROM producto P WHERE p.codigo_fabricante = f.codigo), 2), '€') AS precio_medio, 
f.nombre AS nombre_fabricante
FROM fabricante f
ORDER BY precio_medio DESC;

-- 29- Obtén el producto más barato de todos los productos.
-- Muestra el nombre del producto, precio en euros y el nombre del fabricante

SELECT  concat(min(p.precio), '€') AS precio_mas_barato, f.nombre AS nombre_fabricante, p.nombre AS nombre_producto
FROM producto p, fabricante f
where p.codigo_fabricante = f.codigo;

-- Correccion
SELECT p.nombre AS nombre_producto, CONCAT(p.precio, '€') AS precio_en_euros, f.nombre AS nombre_fabricante
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
WHERE p.precio = (SELECT MIN(precio) FROM producto);

-- 30- Obtén el producto más caro y más barato, mostrando el nombre, el precio en Euros y el nombre del fabricante.

SELECT concat(p.precio, '€') AS min_precio , p.nombre AS nombre_producto, f.nombre as nombre_fabricante
 FROM producto P
 INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
 WHERE p.precio = (SELECT MIN(precio) FROM producto)
 UNION
 SELECT concat(p.precio, '€') AS max_precio , p.nombre AS nombre_producto, f.nombre as nombre_fabricante
 FROM producto P
 INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
 WHERE p.precio = (SELECT max(precio) FROM producto);
 
 -- Nose como hacerla sin el union
 
 

-- 31- Obtén el nombre de cada fabricante con el nombre y precio de su producto más caro.
-- ddr2 memory, 50€, Winchester
-- Bluetooth Speakers, 230€, bose
-- Multimedia Speakers, 140€, bose
-- Multimedia White Speakers, 80€, bose
-- b) Idem con el Producto más barato.
-- c) Idem con el Producto más caro y barato.

-- INSERTAR
INSERT INTO producto VALUES (11,'ddr2 memory',50,5);
DELETE FROM producto WHERE codigo = 11;

INSERT INTO producto VALUES (11,'ddr2 memory',50,6), (12,'Bluetooth Speakers',230,7),
(13,'Multimedia Speakers', 140,7), (14,'Multimedia White Speakers', 80,7);

-- O buscando direcamnetne el codigo
INSERT INTO productos (nombre, precio, codigo_fabricante)VALUES 
('Bluetooth Speakers', 230, (SELECT codigo FROM fabricante WHERE nombre = 'Bose')),
('Multimedia Speakers', 140, (SELECT codigo FROM fabricante WHERE nombre = 'Bose')),
('Multimedia White Speakers', 80, (SELECT codigo FROM fabricante WHERE nombre = 'Bose'));

-- A
SELECT p.nombre AS nombre_producto, f.nombre AS nombre_fabricante, max(p.precio) precio_MAX
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
GROUP BY nombre_fabricante
order by  nombre_fabricante, precio;

-- B
SELECT p.nombre AS nombre_producto, f.nombre AS nombre_fabricante, min(p.precio) precio_MIN
FROM producto p
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
GROUP BY nombre_fabricante
order by  nombre_fabricante, precio;

-- C
SELECT p.nombre as nombre, max(precio) AS precio , f.nombre AS nombreF 
FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo
GROUP BY f.nombre
UNION
SELECT p.nombre as nombre, min(precio) AS precio , f.nombre AS nombreF 
FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo
GROUP BY f.nombre
order by  nombreF, precio;

-- Correcion
SELECT P.nombre, MAX(precio) AS PRECIO, F.nombre AS nombreF FROM producto P, fabricante F
WHERE P.codigo_fabricante = F.codigo GROUP BY F.nombre
UNION
SELECT P.nombre, MIN(precio) AS PRECIO, F.nombre AS nombreF FROM producto P, fabricante F
WHERE P.codigo_fabricante = F.codigo GROUP BY F.nombre 
ORDER BY nombreF, PRECIO;


-- 32- Computa el precio medio de todos los productos cuyo fabricante sea 'Creative Labs'.

SELECT concat(format(avg(precio),2), '€') as precio_medio, f.nombre AS nombreP
 from producto p 
 INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
WHERE f.nombre = 'Creative Labs';

-- 33- Selecciona el nombre de cada fabricante cuya media de productos sea superior a 140€ y
--  al menos contenga 2 o más productos diferentes.

-- Precio medio
SELECT concat(format(avg(precio),2), '€')  as precio_medio, f.nombre AS nombreP
from producto p 
INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo;
 
 -- AGRUPAR Y CONDICION (superior a 140 y contenga 2 o mas productos)

SELECT concat(format(avg(precio),2), '€')  as precio_medio, f.nombre AS nombreP
 from producto p 
 INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
 GROUP BY f.nombre
 HAVING precio_medio > 140;
 
 SELECT concat(format(avg(precio),2), '€')  as precio_medio, count(precio) as numero_producto, f.nombre AS nombreP
 from producto p 
 INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo
 GROUP BY f.nombre
 HAVING precio_medio > 140 and numero_producto > 1;

-- 34- Por campaña de ABRIL, actualiza los precios aplicando un descuento del 10%. 
-- Además, los precios que superen los 200 € se les añadirá un 5% adicional

-- 34  solo el 10% corrección Leo

select * from producto;

-- Ver los precios de los productos. La consulta anterior para poder realizar la 34

SET SQL_SAFE_UPDATES =0; -- desactivar
UPDATE producto SET precio = precio * 0.9 WHERE precio <= 200;
UPDATE producto SET precio = precio * 0.85 WHERE precio > 200; 
SET SQL_SAFE_UPDATES =1; -- activar

SELECT * FROM producto;