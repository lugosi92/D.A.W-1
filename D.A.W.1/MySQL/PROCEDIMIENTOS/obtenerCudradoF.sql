CREATE DEFINER=`khaled`@`localhost` FUNCTION `obtenerCudrador`(s SMALLINT) RETURNS smallint
    DETERMINISTIC
BEGIN
	RETURN s*s;
END