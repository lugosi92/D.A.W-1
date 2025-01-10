USE LIBRERIA;

SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- 1 Nombre de las editoriales americanas
Select pub_name, country from publicacion WHERE country = 'USA';

-- 2 Mostart los libros con mas de 200 paginas (nombre de libro y el numero de paginas) ordenados por numeros de paginas
SELECT book_name AS nombre_libro, no_page AS numero_paginas FROM Libro WHERE no_page >200 ORDER BY no_page;

-- 3 Cantidad de Libros escritos en ingles y cantidad de libros escritos en Hindi (Sin where)
SELECT book_name as nombre_libro, pub_lang as idioma FROM libro 
GROUP BY book_name
HAVING pub_lang = 'hindi' or pub_lang = 'english'
ORDER BY pub_lang;

-- 4 Editoriales localizadas en New York, ordenadas de menor a mayor por su numero de "branch". No se puede utilizar el operador =.
SELECT pub_name as nombre_editorial, country as ciudad,  no_of_branch as oficina 
FROM publicacion
WHERE pub_city LIKE '%New York%'
ORDER BY no_of_branch;

-- 5 Autores Americacnos que viven en Houston o Floirda(nombre del autor, pais y ciudad). No se puede usar el operador "=", ni los nombres "Houston" ni "Florida".
SELECT aut_name, home_city FROM autor 
where home_city NOT IN('','Rio De Janerio','cambridge','Toronto', 'Leeds', 'Arnsberg', 'New York', 'London', 'Atlanta', 'Rio de Janeiro', 'Sydney','Vancouver','Adelaide');

-- 6. Autores no americanos cuyo idioma de habla de su país es el inglés (nombre del autor, país y ciudad). Ordénalos por país y por nombre alfabético.
Select a.aut_name, a.country, a.home_city FROM autor a
INNER JOIN libro l ON a.aut_id = l.aut_id
WHERE l.pub_lang = 'English' and a.country NOT IN ('canada','usa')
ORDER BY a.country ;

-- 7. Contar el número de autores ordenados por país, ordenados de forma alfabética. 

SELECT count(*) AS numero_autores, country FROM autor
GROUP BY country
ORDER BY country ASC;
    
    
	-- B) Ordénalo también por el número de autores de forma descendente.
SELECT count(*) AS numero_autores, country FROM autor
GROUP BY country
ORDER BY country ASC, aut_name DESC;
        
        
-- 8. Contar el número de autores cuyo país hablan el INGLÉS como idioma oficial.
SELECT count(*) as numero_autores_ingles
FROM autor
where country IN('uk','Canada','India','USA','Australia');

	-- B) Muestra el número de autores por cada país que habla INGLÉS de forma descendente.
SELECT count(*) as numero_autores_ingles, country
FROM autor
GROUP BY country
HAVINg country IN('uk','Canada','India','USA','Australia')
ORDER BY numero_autores_ingles DESC;


-- 9. Contar el número de autores cuyo pais no hablan el INGLES como idioma oficial. 
SELECT count(*) as numero_autores_ingles
FROM autor
where country NOT IN('uk','USA','Australia');

	-- B) Muestra los países y ordénalos por países de forma ascendente.
SELECT count(*) as numero_autores_ingles, country
FROM autor
GROUP BY country
HAVING country NOT IN('uk','USA','Australia')
ORDER BY country ASC;

-- 10. Número de publicaciones en los paises de USA y UK, por ciudad. Para ello se requiere agrupar por Pais y ciudad.
SELECT count(*) as numero_publicaciones , country, pub_city
FROM publicacion
WHERE country IN('usa','uk')
GROUP BY country , pub_city;

-- 11. Contar el número de publicaciones por idioma único 
-- y el promedio de páginas por libro con máximo dos decimales, 
-- por cada categoría de libros (cate_id).
 
SELECT count(*) as numero_publicaciones, l.pub_lang as idioma, format(avg(l.no_page),2) AS numero_paginas, c.nombre
FROM publicacion p
INNER JOIN libro l ON p.pub_id = l.pub_id
INNER JOIN categoria c ON c.cate_id = l.cate_id
GROUP BY idioma, c.nombre;

-- 12. Media de precios de los libros, con formato € en la misma columna. Redondéalo a dos dígitos decimales.
select concat(round(avg(book_price),2),'€') AS media_precio
FROM libro;


-- 13. Números de libros escritos en cada idioma, de mayor a menor número. (te tiene que dar 16 libros).

	-- a) Realízalo primero con dos sentencias SELECT.
SELECT Num_Libros, Idioma FROM
(SELECT count(*) AS Num_Libros, pub_lang AS Idioma  
FROM libro GROUP by pub_lang ) as sub
ORDER BY Num_Libros DESC;


	-- b) Realizalo con una sola sentencia SELECT.
SELECT count(*) AS Num_Libros, pub_lang AS Idioma  
FROM libro GROUP by pub_lang
ORDER BY Num_Libros DESC;


-- 14. Obtener el número de editoriales que tiene cada ciudad.
select count(*) as numero_editoriales, pub_city
FROM publicacion
GROUP BY pub_city;
 


-- 15. Obtener el número de editoriales de cada ciudad de Estados Unidos.
select count(*) as numero_editoriales, pub_city, country
FROM publicacion
GROUP BY pub_city
HAVING country = 'USA';

-- 16. Libros publicados en los años 2002 y 2003. 
-- Mostrar nombre del libro, categoría y año, 
-- ordenado por categoría de forma ascendente y 
-- fecha de publicación de forma descendente.
-- La fecha de publicación se mostrará en formato Europeo.
SELECT l.book_name as nombre, date_format(l.dt_of_pub, '%d/%m/%Y') as fecha, c.nombre as categoria
FROM libro l 
INNER JOIN publicacion p ON l.pub_id = p.pub_id
INNER JOIN categoria c ON c.cate_id = l.cate_id
WHERE l.dt_of_pub between '2002-01-01' and '2003-12-31'
order by categoria ASC , l.dt_of_pub desc;



-- 17 Contar el número de libros publicados por cada categoria ordenados por categoría.

SELECT count(*) as numer_libros, c.cate_id as categoria, c.nombre as nombre
FROM libro l
INNER JOIN publicacion p ON l.pub_id = p.pub_id
INNER JOIN categoria c ON c.cate_id = l.cate_id
GROUP BY categoria;

-- 18. Muestras las categorías y sus números de publicaciones que hayan tenido dos o más libros publicados
SELECT c.nombre as categoria, count(p.pub_id) as numero_publicacion 
FROM categoria c
INNER JOIN libro l ON c.cate_id = l.cate_id
INNER JOIN publicacion p ON p.pub_id = l.pub_id
GROUP BY c.nombre
HAVING numero_publicacion >= 2;

-- 19. Contar el numero de libros publicados entre los años 2001 y 2003, segun cada categoria

SELECT counT(*) AS numero_libros, c.cate_id as categoria, c.nombre as nombre, date_format(l.dt_of_pub, '%d/%m/%Y') as fecha
from libro l 
INNER JOIN publicacion p ON p.pub_id= l.pub_id
INNER JOIN categoria c ON c.cate_id = l.cate_id
where l.dt_of_pub between '2001-01-01' and '2003-12-31'
GROUP BY c.cate_id
ORDER BY fecha ASC;
