CREATE DEFINER=`root`@`localhost` FUNCTION `funcion_02_cuadrado`(n1 int) RETURNS int
    DETERMINISTIC
    COMMENT 'Devolver el cuadrado de un numero'
BEGIN
RETURN n1 *n1;
END