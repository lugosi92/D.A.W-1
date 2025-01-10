CREATE DEFINER=`root`@`localhost` PROCEDURE `actividad03`(IN nombre_autor varchar(30))
    COMMENT '3. Procedimiento para listar los libros de un autor, pasando parámetro nombre autor, mostrando el título,editorial y precio de cada uno.'
BEGIN
	
	SELECT l.book_name AS 'nombre_libro',
    p.pub_name  AS 'editorial', 
    l.book_price AS 'precio_libro'
    FROM libro l 
    join publicacion p ON l.pub_id = p.pub_id
    join autor a ON a.aut_id = l.aut_id
    WHERE nombre_autor=aut_name;
END