USE 1_Fabricante;

SELECT * FROM fabricante;
SELECT * FROM producto;

SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- ----------------------------------------
-- -- Parte II: Consultas con funciones.---
-- ----------------------------------------

-- 20-Cuenta el número de fabricantes.
SELECT count(*) AS Numero_de_Fabricantes 
FROM fabricante;

-- 21- Cuenta los fabricantes que contienen la letra e.

SELECT count(*) AS Numero_de_Fabricantes
FROM fabricante
WHERE nombre LIKE '%E%';

-- 21- Muestra los códigos de fabricante distintos que aparecen en la tabla productos. No se pueden repetir

SELECT DISTINCT codigo_fabricante 
FROM producto;

-- 23- Calcula la media del precio de los productos mostrando el valor de €. 
--  Utiliza la función concat().

SELECT concat(format(AVG(precio), 2), '€') AS precio_medio
FROM producto;


-- 24- Calcula el precio medio de los productos en el valor monetario de Dólares mostrando su símbolo $.

set @dolar = 1.19;

SELECT concat(avg(format(precio*@dolar, 2)),'$') AS precio_medio
from producto;

