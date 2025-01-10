USE 1_Fabricante;

SELECT * FROM fabricante;
SELECT * FROM producto;

SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


-- -------------------------------------------------------------
-- ---- PARTE I- Realiza las siguientes consultas sencillas:----
-- -------------------------------------------------------------


-- 1- Selecciona todos los productos que hay en la tabla añadiendo un campo después de precio que muestre la unidad de €.
SELECT codigo, nombre, precio, '€' as Moneda
FROM producto;

-- 2- Nombre y precio de productos con precio menor de 120€ en formato descendente, mostrando la moneda.
SELECT nombre, precio, '€' AS Moneda 
FROM producto
WHERE precio < 120 
ORDER BY precio DESC;

-- 3a- Nombre y precio de productos con precio mayor o igual a 180€ de forma Ascendente, mostrando la moneda
SELECT nombre, precio, '€' AS Moneda
FROM producto
WHERE precio >= 180 
ORDER BY precio ASC;

-- 3b- Nombre y precio de productos que no tienen un precio mayor o igual a 180€, mostrando la moneda.
SELECT nombre, precio, '€' AS Moneda
FROM producto 
WHERE precio < 180;

-- 3c- Nombre y precio de productos que tienen un precio entre 100€ y 200€ en formato ascendente, mostrando la moneda.

SELECT nombre, precio,'€' AS Moneda 
FROM producto
WHERE precio between '100' and '200'
ORDER BY precio ASC;

-- Correccion
SELECT nombre, concat(precio,'€') AS MONEDA FROM producto WHERE precio BETWEEN 100 AND 200 ORDER BY PRECIO ASC;

-- 4- Mostrar el nombre y el precio de los productos en dólares. 
-- Para ello tendrás que buscar el cambio actual del euro a dólar y recalcular sus
-- precios. Se mostrará la moneda de Dólar con el símbolo $

-- Define una variable que se llame dólar para realizar los cálculos.

SET @dolar = 1.19;
SELECT nombre, concat(format(precio * @dolar, 2),'$') AS Precio
FROM producto;

-- 4b- Redondear el valor anterior a dos decimales con la función
-- matemática ROUND:
-- ROUND(campo, nºdecimales)

SELECT nombre, round(precio * @dolar, 2) AS Precio, '$' AS Moneda
FROM producto;

-- 5- Muestra todos los productos que tengan un precio mayor de 150€ cuyo fabricante sea Fujitsu. 
-- Fija el código del fabricante mediante una variable en un SELECT.

set @codigoFiujitsu = (SELECT codigo FROM fabricante WHERE nombre = 'Fujitsu');

SELECT nombre, precio FROM producto 
where precio > 150 and codigo = @codigoFiujitsu;

-- Correccion
SET @fujitsu = (SELECT codigo FROM fabricante WHERE nombre ='fujitsu');
SELECT precio, nombre FROM producto WHERE precio > 150 and codigo = @fujitsu;


-- 6- Listar todos los productos donde el código del fabricante sea 1,3 ó 5.

SELECT codigo, nombre 
FROM producto 
WHERE codigo IN(1,3,5);

-- 7- Listar todos los productos que sean DVD.

SELECT codigo, nombre
FROM producto 
WHERE nombre LIKE '%DVD%';

-- 8- Listar todos los productos que sean CD o DVD.

SELECT codigo, nombre
FROM producto 
WHERE nombre LIKE '%DVD%' or nombre like '%CD%';

-- 9- Listar todos los productos que sean drive o disk.

SELECT codigo, nombre
FROM producto 
WHERE nombre LIKE '%drive%' or nombre like '%disk%';

-- 10- Listar los productos que acaben con la letra “e”.

SELECT codigo, nombre
FROM producto 
WHERE nombre LIKE '%e';

-- 11- Listar los fabricantes que comiencen por la letra S.

SELECT nombre 
FROM fabricante
WHERE nombre LIKE 'S%';

-- 12- Listar los fabricantes que contengan la letra S y la letra E.

SELECT codigo, nombre FROM fabricante 
WHERE nombre LIKE '%e%' or nombre LIKE '%s%';

-- 13- Listar los productos que comiencen por la letra C ó la letra D y acaben por la letra E.

SELECT codigo, nombre FROM producto
WHERE nombre LIKE 'c%e' or nombre LIKE 'd%e';

-- Correccion
SELECT nombre FROM producto WHERE nombre LIKE  'c%e'OR nombre like 'd%e'; 

-- 14- Listar los productos que no contengan ni CD ni DVD.

SELECT nombre, codigo FROM producto 
WHERE nombre NOT LIKE '%CD%' or nombre NOT LIKE '%DVD%'; 

-- Correcion
SELECT nombre, codigo FROM producto 
WHERE nombre NOT LIKE '%CD%' and nombre NOT LIKE '%DVD%'; 

-- 15- Seleccionar productos que contengan la palabra drive y no sean ni CD ni DVD.

SELECT nombre, codigo FROM producto
WHERE nombre LIKE '%drive%' and 
nombre NOT LIKE '%CD%' and 
nombre NOT LIKE '%DVD%'; 

-- 16- Muestra la información completa de los productos con código 1,5,8 sin
-- utilizar la palabra reservada OR y AND. Ordénalos por precio de mayor a
-- menor.

SELECT codigo, nombre, precio, codigo_fabricante FROM producto
WHERE codigo IN(1,5,8)
ORDER BY precio DESC;

-- 17- Muestra todos los productos cuyo precio sea a partir de 100€ y no sea ni 180 ni 240.
--  Utiliza un solo operador de comparación.

SELECT codigo, nombre, precio FROM producto
WHERE precio > 100 and precio NOT LIKE 180 AND precio NOT LIKE 240;

-- 18a- Selecciona los primeros 5 fabricantes
SELECT codigo , nombre FROM fabricante LIMIT 5;

-- 18b- Selecciona 2 fabricantes a partir del 4º.

SELECT codigo, nombre FROM fabricante
LIMIT 2
OFFSET 3;
