CREATE PROCEDURE `actividad02` (out aut_name varchar(6))
COMMENT 'Procedimiento para alistar los libros de un autor, pasando parámetro nombre autor, mostrar título editorial y precio'
BEGIN
	select l.book_name, a.aut_name, l.book_price FROM LIBRO l 
    JOIN AUTOR a ON l.aut_id = a.aut_id
    INTO listado;
	SELECT listado AS 'LISTADO';
END