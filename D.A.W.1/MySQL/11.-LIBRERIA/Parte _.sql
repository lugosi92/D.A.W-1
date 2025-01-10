USE LIBRERIA;

-- 1 Nombre de las editoriales americanas
Select pub_name AS Nombre FROM PUBLICACION where country = 'USA';

-- 2 Mostart los libros con mas de 200 paginas (nombre de libro y el numero de paginas) ordenados por numeros de paginas
SELECT book_name, no_page FROM LIBRO WHERE no_page > 200 ORDER BY no_page ASC;

-- 3 Cantidad de Libros escritos en ingles y cantidad de libros escritos en Hindi (Sin where)
SELECT  count(pub_lang) AS libros_ingles,
(select count(pub_lang)  FROM libro  GROUP BY pub_lang having pub_lang = 'Hindi') AS libros_Hindi
FROM libro  
GROUP BY pub_lang HAVING pub_lang  = 'English';

SELECT count(pub_lang) NUMERO, pub_lang FROM LIBRO 
GROUP BY pub_lang 
HAVING pub_lang = 'English' OR pub_lang = 'Hindi';

-- 4 Editoriales localizadas en New York, ordenadas de menor a mayor por su numero de "branch". No se puede utilizar el operador =.
SELECT pub_name AS Editorial, pub_city, no_of_branch AS rama 
FROM publicacion 
WHERE pub_city IN('New York') 
ORDER BY no_of_branch ASC;

-- 5 Autores Americacnos que viven en Houston o Floirda(nombre del autor, pais y ciudad). No se puede usar el operador "=", ni los nombres "Houston" ni "Florida".
SELECT aut_name AS Nombre, country AS Pais, home_city AS ciudad 
FROM autor  
where home_city NOT IN('','Cambridge','Toronto','Leeds','Arnsberg','New York','London','Atlanta','Rio de Janeiro','Sydney','Vancouver','Adelaide','London');

-- 6. Autores no americanos cuyo idioma de habla de su país es el inglés (nombre del autor, país y ciudad). Ordénalos por país y por nombre alfabético.

-- Autores no americanon (tabla autor)
SELECT aut_name AS Nombre, country AS Pais, home_city AS Ciudad FROM autor WHERE country != 'USA' OR country != 'Canada';
-- Autores con idioma Ingles (tabla libro)
SELECT aut_id, pub_lang AS Idiona FROM libro Where pub_lang = 'English';

-- Ordenar por pais y orden alfabetico
SELECT aut_name AS Nombre, country AS Pais, home_city AS Ciudad FROM autor WHERE country != 'USA' and country != 'Canada'
AND EXISTS
(SELECT aut_id, pub_lang AS Idiona FROM libro Where pub_lang = 'English') 
ORDER BY country ASC, aut_name asc;

select aut_name, country, home_city, pub_lang FROM AUTOR A, LIBRO L
where A.aut_id = L.aut_id AND country NOT IN('USA','Canada')
AND pub_lang = 'English'
ORDER BY country ASC, aut_name ASC;


-- 7. Contar el número de autores ordenados por país, ordenados de forma alfabética. 
		SELECT count(aut_name) AS Num_Autores, country AS Ciudad FROM AUTOR  
        GROUP BY country 
        ORDER BY country ASC;
	-- B) Ordénalo también por el número de autores de forma descendente.
		SELECT count(aut_name) AS Autores, country AS Ciudad FROM AUTOR  
        GROUP BY country 
        ORDER BY country ASC, aut_name DESC;
        
        
-- 8. Contar el número de autores cuyo país hablan el INGLÉS como idioma oficial.
SELECT COUNT(*) AS num_autores_ingles
FROM AUTOR
WHERE country IN ('UK', 'USA', 'Australia','Canada');

SELECT count(A.aut_id) AS Numero, country 
FROM LIBRO L, AUTOR A WHERE A.aut_id = L.aut_id
AND pub_lang = 'English'
GROUP BY country 
ORDER BY country DESC;

	-- B) Muestra el número de autores por cada país que habla INGLÉS de forma descendente.
SELECT country, COUNT(*) AS num_autores
FROM AUTOR
WHERE country IN ('UK', 'USA', 'Australia')
GROUP BY country
ORDER BY num_autores DESC;

-- 9. Contar el número de autores cuyo pais no hablan el INGLES como idioma oficial. 
SELECT count(*) NumActores
FROM autor 
WHERE country NOT IN  ('UK', 'USA', 'Australia');
	-- B) Muestra los países y ordénalos por países de forma ascendente.
SELECT count(*) NumActores, country 
FROM autor  
WHERE country NOT IN  ('UK', 'USA', 'Australia') 
GROUP BY country 
ORDER BY country ASC;

-- 10. Número de publicaciones en los paises de USA y UK, por ciudad. Para ello se requiere agrupar por Pais y ciudad.
SELECT count(*) AS publicacion, country, pub_city 
FROM publicacion WHERE country IN( 'USA','UK') 
GROUP BY country,pub_city;

-- 11. Contar el número de publicaciones por idioma único y el promedio de páginas por libro con máximo dos decimales, por cada categoría de libros (cate_id).
-- Contar el número de publicaciones por idioma único 
 SELECT count(*) AS publicaciones, pub_lang AS Idioma , FORMAT(AVG(no_page),2) AS media_Paginas
 FROM libro l 
 INNER JOIN publicacion p ON p.pub_id = l.pub_id 
 GROUP BY pub_lang;
 
-- El promedio de paginas por libro (maximo 2 decimales)
SELECT FORMAT(AVG(no_page),2) FROM libro ;

-- Por cada categoria de libors 
SELECT count(*) AS publicaciones, pub_lang AS Idioma , FORMAT(AVG(no_page),2) AS media_Paginas, c.nombre AS nombre_Categoria
FROM libro l
INNER JOIN publicacion p  ON p.pub_id = l.pub_id 
INNER JOIN categoria c ON l.cate_id = c.cate_id
GROUP BY nombre_Categoria;

-- 12. Media de precios de los libros, con formato € en la misma columna. Redondéalo a dos dígitos decimales.
SELECT CONCAT(ROUND(AVG(book_price),2), '€') AS precio FROM libro;


-- 13. Números de libros escritos en cada idioma, de mayor a menor número. (te tiene que dar 16 libros).

	-- a) Realízalo primero con dos sentencias SELECT.
SELECT Num_Libros, Idioma
FROM
(SELECT count(*) AS Num_Libros, pub_lang AS Idioma  
FROM libro GROUP by pub_lang ) AS subConsulta
ORDER BY Num_Libros DESC;
	-- b) Realizalo con una sola sentencia SELECT.
SELECT count(*) AS Num_Libros, pub_lang AS Idioma  
FROM libro GROUP by pub_lang 
ORDER BY Num_Libros DESC;
    
-- 14. Obtener el número de editoriales que tiene cada ciudad.
SELECT count(pub_name), pub_city 
FROM publicacion
GROUP by pub_city;

-- 15. Obtener el número de editoriales de cada ciudad de Estados Unidos.
SELECT count(pub_name) num_Editorial, pub_city AS ciudadAmericana
FROM publicacion
GROUP by pub_city
having pub_city IN('New York', 'Houstan');

-- 16. Libros publicados en los años 2002 y 2003. Mostrar nombre del libro, categoría y año, ordenado por categoría de forma ascendente y fecha de publicación de forma descendente. La fecha de publicación se mostrará en formato Europeo.
-- 17 Contar el número de libros publicados por cada categoria ordenados por categoría.
-- 18. Muestras las categorías y sus números de publicaciones que hayan tenido dos o más libros publicados