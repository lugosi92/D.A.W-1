CREATE DEFINER=`root`@`localhost` FUNCTION `funcion01_mayor_2`(n1 int, n2 int) RETURNS int
    DETERMINISTIC
    COMMENT 'Devuelve el mayor de dos números'
BEGIN

	IF n1>n2 THEN
		return n1;
	ELSE 
		return n2;
	END IF;
    
RETURN 1;
END