CREATE DEFINER=`root`@`localhost` PROCEDURE `actividad04`(in nombre_user varchar(30), in apellidos_user varchar(50) )
    COMMENT '4.- crear un procedimiento para buscar los teléfonos de una persona por su nombre  y apellidos y el resultado deberá mostrar nombres apellidos y teléfonos'
BEGIN
	-- Buscar telefonos 
    SELECT p.nombre AS 'nombre',
    p.apellidos as 'apellidos', 
    t.telefono as 'telefono'
    FROM persona p
    JOIN telefono t ON p.dni=t.dni_persona
    WHERE p.nombre =nombre_user and p.apellidos = apellidos_user;
END