USE employees;

-- -------------------------------------------------
-- EJECUTAR VARIABLE ANTES DE COMPROBAR CONSULTAS---
-- -------------------------------------------------
SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


-- 1.- Cantidad de titulaciones de trabajadores que han pasado por la empresa. 
-- Mostrar el número y la titulación ordenados de mayor a menor.
SELECT 
	count(*) AS Cantidad_Titulos,
    title AS Nombre_Titulo
FROM 
	titles
GROUP BY 
	title
ORDER BY 
	Cantidad_Titulos DESC;

-- 2. Contar el número de empleados de cada género en la empresa.
SELECT
	count(*) AS Numero_empleados,
    gender AS Genero
FROM 
	employees
GROUP BY
	gender;

-- 3. Número de empleados que se contrataron el primer día de apertura de la empresa.
SELECT 
	count(emp_no) AS Numero_Empleados,
    date_format(hire_date, '%d/%m/%Y') AS Dia_apertura
FROM
	employees
WHERE
	hire_date IN (SELECT MIN(hire_date) FROM employees)
ORDER BY 
	hire_Date ASC;


-- 4.- Indica el número de hombres y de mujeres que se contrataron en el primer día en la empresa.
-- Contratos primer dia
SELECT 
	count(emp_no) AS Numero_Empleados,
    date_format(hire_date, '%d/%m/%Y') AS Dia_apertura
FROM
	employees
WHERE
	hire_date IN (SELECT MIN(hire_date) FROM employees)
ORDER BY 
	hire_Date ASC;

-- Contar hombres y mujeres
SELECT
	count(*) AS Numero_empleados,
    gender AS Genero
FROM 
	employees
GROUP BY
	gender;
    
-- Hombres y mujeres el primer dia
SELECT 
	count(emp_no) AS Numero_Empleados,
    date_format(hire_date, '%d/%m/%Y') AS Dia_apertura,
	gender AS Genero
FROM
	employees
WHERE
	hire_date IN (SELECT MIN(hire_date) FROM employees)
GROUP BY
	gender
ORDER BY 
	hire_Date ASC;

-- 5.- Indica las fechas en la que más personal se contrato en la empresa y el número de personal contratado.
SELECT 
	count(*) AS Numero_empleados,
	hire_date AS Fecha_Contratacion
FROM 
	employees
GROUP BY 
	hire_date
ORDER BY 
	Numero_empleados DESC
LIMIT 1;
 
-- --------------------
-- Repasar esta -------
-- --------------------
SELECT 
	CONTRATACIONES, FECHA
FROM 
	(SELECT COUNT(emp_no) AS CONTRATACIONES,
				hire_date AS FECHA
FROM employees
GROUP BY FECHA
ORDER BY CONTRATACIONES) AS tabla1

WHERE 
	CONTRATACIONES IN(SELECT MAX(CONTRATACIONES) 
FROM
	(SELECT COUNT(emp_no) AS CONTRATACIONES,
				hire_date AS FECHA
FROM employees
GROUP BY FECHA
ORDER BY CONTRATACIONES) AS tabla2);


-- 6.- Indicar el tiempo de contratación que lleva el empleado “Sumant Peac” en la empresa hasta hoy.


-- 7. Diferentes salarios que ha tenido el empleado “Sumant Peac“ durante su etapa en la empresa. 
-- Mostrar las fechas, salarios y categoría.


-- 8.- Diferencia entre el primer y último salario que ha tenido el empleado “Sumant Peac”.


-- 9.-Mostrar el empleado más joven de la empresa, indicando su edad real que tiene (años, meses y días).


-- 10.- Empleado más joven contratado durante el año 2000. Indica nombre completo, edad y fecha de contratación