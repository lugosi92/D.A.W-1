CREATE DEFINER=`administrador`@`%` PROCEDURE `actividad03`(IN nombre varchar(30))
    COMMENT 'Procedimiento para listar los libros de un autor, se le pasa el nombre del autor. mostrando el título,editorial y precio de cada uno.'
BEGIN
	select book_name, pub_name, book_price FROM LIBRO
    JOIN PUBLICACION USING (pub_id)
    JOIN AUTOR USING (aut_id)
    WHERE aut_name = nombre;
END