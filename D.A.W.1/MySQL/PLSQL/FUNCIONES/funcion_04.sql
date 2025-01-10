CREATE DEFINER=`khaled`@`localhost` FUNCTION `funcion_04`(dni_user varchar(9)) RETURNS int
    DETERMINISTIC
    COMMENT 'CONTAR LOS TELEFONOS DE UNA PERSONA PASANDO EL DNI'
BEGIN
DECLARE numTel int;
select COUNT(*) INTO numtel
FROM telefonos
WHERE dni_persona=dni_user;
RETURN numTel;
END