CREATE DEFINER=`khaled`@`localhost` PROCEDURE `procedimiento02`(IN dni2 VARCHAR(20))
BEGIN
    SELECT IFNULL(telefono, 'NO TIENE TELEFONOS') FROM telefonos
    WHERE dni_persona = dni2;
END