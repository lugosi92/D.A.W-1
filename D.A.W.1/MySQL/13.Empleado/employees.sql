use employees;
SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- 1.- Cantidad de titulaciones de trabajadores que han pasado por la empresa. Mostrar el
-- número y la titulación ordenados de mayor a menor.
SELECT count(title) AS Numero_Titulaciones, title AS Titulo  
FROM titles
GROUP BY title 
ORDER BY title ASC;

-- 2.- Contar el número de empleados de cada género en la empresa.
SELECT count(gender) AS Empleados_F,
(SELECT count(gender)FROM employees WHERE gender = 'M') AS Empleados_M 
FROM employees WHERE gender = 'F';

SELECT count(gender) AS Empleados_F, count(gender) AS Empleados_M 
FROM employees 
WHERE gender = 'F' and gender = 'M';

-- 3.- Número de empleados que se contrataron el primer día de apertura de la empresa.
SELECT count(emp_no) AS Numero_Empleados, from_date AS Fecha_Apertura 
FROM dept_emp_latest_date 
WHERE from_date = '1985-01-01';

-- 4.- Indica el número de hombres y de mujeres que se contrataron en el primer día en la empresa.
SELECT count(e.emp_no) AS Numero_Empleados, from_date AS Fecha_Apertura,
(SELECT count(gender)FROM employees WHERE gender = 'M') AS Empleados_M ,
(SELECT count(gender)FROM employees WHERE gender = 'F') AS Empleados_F 
FROM employees e
JOIN dept_emp_latest_date d ON e.emp_on = d.emp_on
WHERE d.from_date = '1985-01-01';


-- 5.- Indica las fechas en la que más personal se contrato en la empresa y el número de personal
-- contratado.

-- 6.- Indicar el tiempo de contratación que lleva el empleado “Sumant Peac” en la empresa hasta
-- hoy.

-- 7.- Diferentes salarios que ha tenido el empleado “Sumant Peac“ durante su etapa en la
-- empresa. Mostrar las fechas, salarios y categoría.

-- 8.- Diferencia entre el primer y último salario que ha tenido el empleado “Sumant Peac”.

-- 9.-Mostrar el empleado más joven de la empresa, indicando su edad real que tiene (años,
-- meses y días).

-- 10.- Empleado más joven contratado durante el año 2000. Indica nombre completo, edad y
-- fecha de contratación.


-- Correcion 


-- La primera consulta será la que he trabajado, la segunda la corrección
-- CONSULTAS SENCILLAS:

-- 1 Cantidad de titulaciones de trabajadores 
-- que han pasado por la empresa. 
-- Mostrar el número y la titulación ordenados de mayor a menor.

SELECT COUNT(title) AS NUMERO, title AS TITULO 
FROM titles GROUP BY TITULO ORDER BY TITULO ASC;

-- correción
SELECT COUNT(emp_no)AS NUMERO_EMPLEADOS, title AS CATEGORIA FROM titles GROUP BY title ORDER BY NUMERO_EMPLEADO DESC;


-- 2 Contar el número de empleados de cada género en la empresa.
SELECT COUNT(emp_no) AS EMPLEADOS, gender AS GÉNERO 
FROM employees GROUP BY GÉNERO;

-- correción
SELECT gender AS GENERO, count(emp_no) AS EMPLEADOS
FROM employees GROUP BY GENERO ORDER BY EMPLEADOS

-- otra opción corrección más larga:
SELECT 'femenino' AS GENERO, COUNT(*) AS NUMERO 
FROM employees WHERE gender = 'F'
UNION
SELECT 'masculino' AS GENERO, COUNT(*) AS NUMERO 
FROM employees WHERE gender = 'M';

-- 3 Número de empleados que se contrataron el primer día de apertura de la empresa.
SELECT COUNT(emp_no) AS NUMERO  FROM employees WHERE hire_date 
IN(SELECT MIN(hire_date) FROM employees);


-- 4 Indica el número de hombres y de mujeres que se contrataron en el primer día en la empresa.

SELECT COUNT(emp_no) AS EMPLEADOS, MIN(hire_date)AS FECHA_INCORP, gender AS GENERO 
FROM employees
GROUP BY GENERO;

-- correción:
SELECT count(emp_no) AS NUMERO, gender AS GENERO,
date_format(MIN(hire_date), '%d-%m-%y') AS FECHA
FROM employees
WHERE hire_date IN(SELECT MIN(hire_date) FROM employees)
GROUP BY gender;

-- 5 Indica las fechas en la que más personal se contrato en la empresa 
-- y el número de personal contratado.

SELECT count(emp_no) AS Contrataciones , hire_date AS Fecha 
FROM employees
GROUP BY  Fecha
ORDER BY contrataciones DESC;

-- Se mete la clausula anterior como una tabla empotrada
SELECT contrataciones, Fecha
FROM (SELECT count(emp_no) AS Contrataciones , hire_date AS Fecha 
FROM employees 
GROUP BY  Fecha
ORDER BY contrataciones) as tabla1 
where Contrataciones in(SELECT max(Contrataciones) FROM (SELECT count(emp_no) AS Contrataciones , hire_date AS Fecha 
FROM employees 
GROUP BY  Fecha
ORDER BY contrataciones) AS tabla2);


-- UTILIZANDO UNA VARIABLE
SET @MAXIMO = (SELECT max(contrataciones)
 from ( SELECT count(emp_no) AS Contrataciones , hire_date AS Fecha 
FROM employees
GROUP BY  Fecha
ORDER BY contrataciones) as tabla1);

SELECT count(emp_no) AS CONTRATACIONES, hire_date AS FECHA 
FROM employees GROUP BY Fecha HAVING CONTRATACIONES = @MAXIMO; 

-- SIN VARIBALE en una sola sentencia
SELECT count(emp_no) AS CONTRATACIONES, hire_date AS FECHA 
FROM employees GROUP BY Fecha HAVING CONTRATACIONES = (SELECT max(contrataciones)
 from ( SELECT count(emp_no) AS Contrataciones , hire_date AS Fecha 
FROM employees
GROUP BY  Fecha
ORDER BY contrataciones) as tabla1);

-- CON CREACION DE VISTAS
CREATE VIEW consulta_5 AS SELECT count(emp_no) AS Contrataciones , hire_date AS Fecha 
FROM employees
GROUP BY  Fecha
ORDER BY contrataciones DESC;


SELECT Contrataciones, Fecha 
FROM consulta_5 
where Contrataciones= (SELECT MAX(Contrataciones) FROM consulta_5);

-- 1.-CONSULTA EMPOTRADA
-- 2.- HCAER CONSULTA SENCILLA (VARIABLE,vista


-- 6.- Indicar el tiempo de contratación que lleva el empleado “Sumant Peac” en la empresa hasta
-- hoy.
Select  * from employees 
where first_name LIKE 'Sumant' and last_name LIKE 'Peac';

-- Saber cuanto tiempo lleva contratatado
SELECT first_name, last_name,
concat(timestampdiff(year, hire_date, curdate()), " Años") AS ANTIGUEDAD
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac';


-- 7.- Diferentes salarios que ha tenido el empleado “Sumant Peac“ durante su etapa en la
-- empresa. Mostrar las fechas, salarios y categoría.

-- 1º Obtener ID del trabajador

SET @Sumant_id = (SELECT emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac'); 


SELECT first_name, last_name, emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac'; -- 10.009

-- 2º Obtener los salarios de este empleado
SELECT * FROM salaries WHERE emp_no = (SELECT emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac');

SELECT * FROM titles WHERE emp_no = (SELECT emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac');
--

SELECT @Sumant_id;

SELECT title FROM titles 
WHERE emp_no = @Sumant_id and from_date between '1985-02-08' AND '1986-02-18';

-- SABER CUANTO GANA DEPENDIENDO DE SU TITULACION
-- INNER JOIN 

-- Tabla A (Su salario) S
SELECT * FROM salaries WHERE emp_no in (SELECT emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac');
 
-- Tabla B (Sus titulaciones) T
 SELECT * FROM titles WHERE emp_no IN (SELECT emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac');


SELECT S.emp_no, S.salary, S.from_date, S.to_date, title
FROM (SELECT * FROM salaries WHERE emp_no in (SELECT emp_no
FROM employees 
WHERE first_name LIKE 'Sumant' AND last_name LIKE 'Peac') 
ORDER BY from_date)AS S 
INNER JOIN titles AS T 
WHERE S.emp_no = T.emp_no AND S.from_date BETWEEN T.from_date AND T.to_date 
ORDER BY salary;

-- 8.- Diferencia entre el primer y último salario que ha tenido el empleado “Sumant Peac”.
SELECT concat((MAX(salary)-MIN(salary)),'€')AS DIF_SALARIO, first_name AS NOMBRE, last_name AS APELLIDO
FROM employees JOIN salaries USING(emp_no)
WHERE first_name = "Sumant" AND last_name="PEAC";

-- 9.-Empleado más joven (indicar su edad real) + (años,meses y días).

-- curdate fecha actual 
SELECT first_name AS NOMBRE, last_name AS APELLIDOS, 
concat(timestampdiff(year,birth_date,curdate()), " Años ", 
       timestampdiff(month, birth_date,curdate())%12, " Meses ",
       timestampdiff(day,birth_date,curdate())%30, " Dias "  
) AS edad
FROM employees
WHERE birth_date = (select MAX(birth_date) FROM employees);

-- 10.- Empleado más joven contratado durante el año 2000. Indica nombre completo, edad y
-- fecha de contratación. 

-- Obtener año de fecha (year)

SELECT concat(first_name,' ', last_name) AS NOMBRE_COMPLETO,
birth_date, 
timestampdiff(year, birth_date,hire_date) AS EDAD_CONTRATACION,
year(hire_date) as años
FROM employees
WHERE YEAR(hire_date) LIKE 2000
AND birth_date IN (SELECT max(birth_date) FROM employees
WHERE year(hire_date) LIKE 2000)
ORDER BY birth_date DESC; 


