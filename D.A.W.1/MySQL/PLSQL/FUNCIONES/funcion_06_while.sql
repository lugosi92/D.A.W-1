CREATE DEFINER=`root`@`localhost` FUNCTION `funcion_06_While`(n int) RETURNS int
    DETERMINISTIC
BEGIN
DECLARE numFactorial int DEFAULT 1;

	IF n<0 THEN 
		return -1;
	END IF;
    
	While n>0 DO 
		set numFactorial = numFactorial*n;
		set n = n-1;
	END WHILE;
return numFactorial;
END