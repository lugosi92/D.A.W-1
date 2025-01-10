ñ-- PL = Procedural Language
/* Comentarios varias líneas */
-- DELIMITER, diferenciar que estas separando o creando campos:
DELIMITER // o ::

CREATE OR REPLACE PROCEDURE `nombreProcedimiento` (tres tipos: {IN|OUT|INOUT} nombre tipo de dato(se separan los argumentos por comas))
BEGIN
...
END
//
delimiter;

CREATE OR REPLACE FUNCTION
BEGIN
...
END

-- Tipos de datos
-- ORACLE          MYSQL
-- NUMBER           INT
-- CHAR       
-- VARCHAR          VARCHAR
-- BOOLEAN          BOOLEAN

-- Operadores:
-- ORACLE                   MYSQL
-- :=
-- +,-,*,/, **              ^
-- =, <>, >,<,>=, <=        !=, <>
-- AND,OR,NOT               AND, &&, NOT, !
-- |                        OR, ||, XOR


-- Condicional IF

IF (expresion) THEN 
	-- INSTRUCCIONES
ELSE IF (expresion) THEN
	-- INSTRUCCIONES
ELSE
	-- INSTRUCCIONES
END IF;


-- CONTROL DE FLUJO FOR
FOR contador IN
[reverse] inicio .. final LOOP
	-- INSTRUCCIONES
END LOOP;

-- CONTROL DE FLUJO WHILE
WHILE (expresion) LOOP
	-- INSTRUCCIONES
END LOOP;

-- CONTROL DE FLUJO LOOP (do-while)
LOOP 
	-- INSTRUCCIONES
	IF(expresion) THEN
	-- INSTRUCCIONES
	EXIT;
	END IF;
	END LOOP;
-- DEFINICION DE VARIABLES Y datos
nombreVariable [CONSTANT] <tipoDato> [NOT NULL] [:= valor_inicial];

nombre varchar2 := 'Juan';
fechaNacimiento DATE;

-- ESTRUCTURA BLOQUES:
[declare | is | as]
/* Parte declarativa */
BEGIN
/* Parte de ejecución */
[exception]
/* Parte de excepciones */
END;

-- VER PROCEDIMIENTOS Y FUNCIONES
SHOW [procedure | function]
STATUS WHERE Db='sakila';
SHOW CREATE procedure <nombre>;
SHOW CREATE function <nombre>;

-- LLAMAR A UN PROCEDIMIENTOS
CALL [BBDD].nombre[parametros];
SET @resultado = null;
CALL sakila.film_in_stock(19,1, @resultado);

-- Para borrarlo el nombre o procedimiento
DROP PROCEDURE nombre;
DROP FUNCTION nombre;

-- FN() Las definidas en el sgbd y las que definamos nosotros.

-- Ejemplos BBDD prueba2:
CREATE PROCEDURE procedimiento01 (IN dniUser varchar(9)) BEGIN SELECT * FROM personas WHERE personas.dni=dniUser; END//

-- Ejemplos clase:
CREATE DEFINER=`administrador`@`%` PROCEDURE `procedimiento02`(IN dni2 varchar(9))
BEGIN
	SELECT IFNULL(telefono, "NO TIENE TELEFONOS") FROM telefonos;
	SELECT telefono from telefonos WHERE dni_persona = dni2;
END

-- Darle a Juan permisos 
-- Crearemos usuario
CREATE USER 'juan'@'localhost' IDENTIFIED BY 'P@$$w0rd';
-- Asignamos permisos:
GRANT ALL PRIVILEGES ON prueba2 

-- Lo que hemos hecho en clase:
-- 1º
SELECT user,host FROM mysql.user;

-- Ver permisos de juan:
SHOW GRANTS FOR 'juan'@'localhost';

-- exit entramos con el usuario Juan
sudo mysql -u juan -p



GRANT SELECT ON prueba2.telefonos TO 'juan'@'localhost';

-- ver de nuevo permisos juan:
SHOW GRANTS FOR 'juan'@'localhost';

-- Asignar permiso para ejecutar PARA DARLE PERMISOS DE EJECUCION AL USUARIO:
GRANT EXECUTE ON PROCEDURE prueba2.procedimiento02 TO 'juan'@'localhost';

-- Ver permisos Juan de nuevo:
SHOW GRANTS FOR 'juan'@'localhost';

-- 
CALL procedimiento02('00000000A');

-- Procedimiento para contar número de personas que hay en la tabla personas 
-- y la fecha de la creación con esas dos variables:

-- CREAMOS NUEVO PROCEDIMIENTO´:

CREATE PROCEDURE `actividad01` (OUT numero int, out fecha DATE)
COMMENT 'Procedimiento para contar el número de personas en la BBDD en una fecha concreta'
BEGIN
	SELECT COUNT(*) FROM personas;
END


-- Actividad01 completa: 

CREATE PROCEDURE `actividad01` (OUT numero int, out fecha DATE)
COMMENT 'Procedimiento para contar el número de personas en la BBDD en una fecha concreta'
BEGIN
	SELECT COUNT(*) FROM personas INTO numero;
    SELECT sysdate() INTO fecha;
    SELECT numero AS 'NUMERO_DE_PERSONAS', fecha AS 'FECHA_ACTUAL';
END


SET @numero = 0;
SET @fecha = 0;
CALL actividad01(@numero, @fecha);

-- Procedimiento para listar los libros de un autor, se le pasa el nombre del autor. 
-- mostrando el título,editorial y precio de cada uno.
CREATE DEFINER=`administrador`@`%` PROCEDURE `actividad02`(IN nombre varchar(30))
    COMMENT 'Procedimiento para listar los libros de un autor, se le pasa el nombre del autor. funcion_prubeafuncion_prubeafuncion_06mostrando el título,editorial y precio de cada uno.'
BEGIN
	select book_name, pub_name, book_price FROM LIBRO
    JOIN PUBLICACION USING (pub_id)
    JOIN AUTOR USING (aut_id)
    WHERE aut_name = nombre;
END

-- Crear un procedimiento para buscar los teléfonos de una persona por su nombre y apellidos.
-- El resultado deberá mostrar nombre, apellidos y teléfonos.

CREATE DEFINER=`administrador`@`%` PROCEDURE `actividad02`(IN nombreA VARCHAR(30), IN apellidosA VARCHAR(50))
    COMMENT 'Crear un procedimiento para buscar los teléfonos de una persona por su nombre, apellidos y teléfonos.'
BEGIN
	select nombre, apellidos, telefono from personas
    INNER JOIN telefonos ON dni=dni_persona
    WHERE nombre=nombreA and apellidos=apellidosA;
END



-- Estrucutraqs Iterativas
-- WHILE, LOOP(foor), REPEAT(do-while)
-- Variables locales: declare
-- Añadir DEFAULT
-- SET variable :=/=
DECLARE numPersonas int default();

-- Ejemplo01: Mostrar numeros while
CREATE DEFINER=`khaled`@`localhost` PROCEDURE `mostrarNumeros`(IN n INT)
    COMMENT 'Mostrar enteros desde el 1 hasta el numero introducido por el usuario'
BEGIN
	DECLARE i INT default 0; -- Contador
	WHILE i <= n DO SELECT i; -- SELECT es como el sysout | Muestra el contador
		SET i := i+1; -- Nuevo valor de i 
    END WHILE;
END 

-- Ejemplo02: con Repeat
CREATE PROCEDURE `mostrarNumerosRepeat` (in n INT)
BEGIN
	declare i int default 0; -- CONTADOR
    repeat
		SELECT i;
        SET i = i+1;
	UNTIL i>n
    end repeat;

END


-- FUNCIONES , count, concat, avg ... Hay algunas que no existen, las creamos | SE PUEDE USAR EN PROCEDIMIENTOS Y TRIGGERS
CREATE FUNCTION nombreFuncion(todos son IN entonces NO se pone 
parametros) RETURN tipo_de_dato
Tipo de Funcion(DETERMINISTIC, NOT DETERMINISTIC, READS SQL DATA, MODIFIES SQL DATA, NO SQL, CONTAINS SQL)
BEGIN
	--Cuerpo de la funcion
END

-- DETERMINISTIC:(si lo ejecuto hoy da el mismo resultado que si lo ejecuto mañanaÇ) prodcir mismo resultado para la misma entrada de parametros
-- NOT DETERMINISTIC (lo opuesto) (por defecto si no se pone nada)
-- READ SQL DATA --> Lee los datos de la base de datos pero no modifica
-- MODIFIES SQL DATA (lo opuesto)
-- Modififca datos de la base de datos. UPDATE, ALTER, DELETE, INSERT 
-- NO SQL 
-- No contiene sentencias SQL 
-- CONTAINS SQL
-- Contiene lenguaje SQL pero no le datos ni escribe datos


 -- procedimiento05. CONTAR LOS TELEFONOS DE UNA PERSONA PASANDO EL DNI


