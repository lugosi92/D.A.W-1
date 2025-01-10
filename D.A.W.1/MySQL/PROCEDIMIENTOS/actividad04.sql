CREATE DEFINER=`khaled`@`localhost` PROCEDURE `actividad04`(IN nombre2 varchar(30), IN apellido2 varchar(50))
    COMMENT 'Buscar los teléfonos de una persona por su nombre  y apellidos y el resultado deberá mostrar nombres apellidos y teléfonos, pasar nombre y apellido'
BEGIN
	SELECT nombre, apellidos, telefonos FROM Persona
    INNER JOIN telefono ON dni=dni_persona
    WHERE nombre=nombreB and apellido=apellido2;
    
END