CREATE DEFINER=`root`@`localhost` FUNCTION `funcion_06_repeat`(n int) RETURNS int
    DETERMINISTIC
BEGIN
	DECLARE numFactorial INT DEFAULT 1;
    
    REPEAT 
		SET numFactorial = numFactorial * n;
        SET n = n -1;
    UNTIL n=0
    END REPEAT;
    
RETURN numFactorial;
END