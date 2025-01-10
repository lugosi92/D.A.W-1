USE LIBRERIA;

SELECT @@sql_mode;
SET sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- 20. Nombre y precio del libro más barato, junto a su autor, y que aparezca el
-- símbolo Euro dentro de la columna precio.
SELECT concat(book_price, '€') as precio,book_name as nombre_libro, aut_name as autor
FROM libro l
INNER JOIN autor a ON l.aut_id = a.aut_id;


-- 21. Nombre y precio del libro más caro en dólares. Cambio actual a 1,19$ por Euro.
SELECT 
	book_name as precio_libro,
	concat('$',FORMAT(book_price*1.19, 2)) as precio
FROM 
	libro
ORDER BY 
	book_price DESC
LIMIT 1;

 -- Con dos decimales
SELECT concat('$',FORMAT(book_price*1.19, 2)) as precio, book_name as precio_libro
FROM libro
LIMIT 1;

-- 22. Número de libros publicados por cada editorial. Mostrar el nombre de la editorial 
-- y el número de libros publicados.
SELECT  p.pub_name as nombre_editorial,count(*) as numero_libros 
FROM libro l
INNER JOIN publicacion p ON p.pub_id = l.pub_id
GROUP BY p.pub_name;


-- 23. Número total de Publicaciones de cada editorial americana.
SELECT 
	count(l.pub_id) as numero_publicaciones,
	p.pub_name as editorial,
    p.country as lugar
FROM 
	publicacion p
INNER JOIN 
	libro l ON l.pub_id = p.pub_id
GROUP BY 
	p.pub_name
HAVING 
	p.country IN('USA','Canada');


-- 24. Número total de Publicaciones de las editoriales americanas,
-- utilizando dos tablas en la consulta. 
-- Aparecerá el número total y el país 
-- (resultado la suma del apartado anterior).
--  Realízalo de 2 formas diferentes CON/SIN GROUP BY+HAVING.

	-- CON/SIN GROUP BY+HAVING
SELECT 
	p.country as Pais,
	count(*) as Numero_publicaciones
FROM 
	libro l
INNER JOIN 
	publicacion p ON l.pub_id= p.pub_id
GROUP BY 
	p.country
HAVING 
	p.country IN('USA','Canada');

	-- CON/SIN GROUP BY+HAVING
SELECT 
	p.country as Pais,
	count(*) as Numero_publicaciones
FROM 
	libro l
INNER JOIN 
	publicacion p ON l.pub_id= p.pub_id
WHERE p.country IN('USA','Canada');


-- 25. Mostrar el libro más caro de cada categoría: Nombre del libro, categoría,
-- precio y año de publicación (solo el año).

SELECT 
	l.book_name as nombre_libro,
    c.cate_id as categoria,
	l.book_price as precio,
    date_format(l.dt_of_pub, '%Y') as fecha
FROM 
	libro l 
INNER JOIN
	categoria c ON c.cate_id = l.cate_id
GROUP BY 
	c.cate_id
ORDER BY 
	l.book_price DESC;

-- 26. Del apartado anterior, muestra el nombre de la categoría en lugar del
-- identificador de la categoría, ordenado por categoría de forma ascendente.

SELECT 
	l.book_name as nombre_libro,
    c.nombre as categoria,
	l.book_price as precio,
    date_format(l.dt_of_pub, '%Y') as fecha
FROM 
	libro l 
INNER JOIN
	categoria c ON c.cate_id = l.cate_id
GROUP BY 
	c.nombre
ORDER BY 
	categoria ASC,l.book_price DESC;


-- 27. Obtén los libros más baratos de las categorías de Física y termodinámica.
-- Muestra el nombre de la categoría, nombre del libro y su precio.

SELECT
    c.nombre as categoria,
    l.book_name as nombre_libro,
	l.book_price  as precio
FROM 
	libro l 
INNER JOIN
	categoria c ON c.cate_id = l.cate_id
GROUP BY 
	c.nombre
HAVING 
	c.nombre IN('Fisica','Termodinámica')
ORDER BY 
	l.book_price ASC;


    
-- 28. Obtén las publicaciones que se hayan hecho de Física. Muestra el nombre
-- de la publicación, el libro y su autor.

SELECT DISTINCT
	p.pub_name AS nombre_publicacion,
    l.book_name AS nombre_libro,
    a.aut_name AS nombre_autor,
    c.nombre AS nombre_categoria
FROM
	libro l
INNER JOIN 
	publicacion p ON p.pub_id = l.pub_id
INNER JOIN
    autor a ON a.aut_id = l.aut_id
INNER JOIN
    categoria c ON c.cate_id = l.cate_id
WHERE c.nombre = 'Fisica';
    

-- 29. Seleccionar los libros escritos por autores australianos, mostrando el autor,
-- su libro, el nombre de la categoría del libro y la editorial que lo ha publicado.
SELECT DISTINCT
	a.aut_name AS Autor,
    l.book_name AS Libro,
    c.nombre AS Categoria,
    p.pub_name AS Editorial
FROM 
	libro l 
INNER JOIN 
	publicacion p ON p.pub_id = l.pub_id
INNER JOIN
    autor a ON a.aut_id = l.aut_id
INNER JOIN
    categoria c ON c.cate_id = l.cate_id
WHERE a.country IN('Australia');



-- 30. Obtén las publicaciones de los autores cuyo nombre sea William. Muestra el
-- nombre de los autores, sus libros, el nombre de su categoría, la editorial y su
-- precio con el símbolo del €, ordenándolos por esta última de forma descendente.

SELECT DISTINCT
	a.aut_name AS Autor,
    l.book_name AS Libro,
    c.nombre AS Categoria,
    p.pub_name AS Editorial,
    concat(l.book_price, '€') AS Precio
FROM 
	libro l 
INNER JOIN 
	publicacion p ON p.pub_id = l.pub_id
INNER JOIN
    autor a ON a.aut_id = l.aut_id
INNER JOIN
    categoria c ON c.cate_id = l.cate_id
WHERE a.aut_name like '%William%'
ORDER BY l.book_price DESC;


-- 31. Muestra los libros, autores, nombre de la CATEGORIA y precio, de los libros
-- cuyo precio se encuentre entre 100 y 200€.

SELECT DISTINCT
	l.book_name AS Libro,
    a.aut_name AS Autor,
    c.nombre AS Categoria,
    concat(l.book_price,'€') AS Precio
FROM 
	libro l 
INNER JOIN 
	publicacion p ON p.pub_id = l.pub_id
INNER JOIN
    autor a ON a.aut_id = l.aut_id
INNER JOIN
    categoria c ON c.cate_id = l.cate_id
WHERE l.book_price BETWEEN 100 and 200
ORDER BY l.book_price DESC;