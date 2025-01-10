CREATE FUNCTION `funcion_06` (n INT)
RETURNS INT
DETERMINISTIC
COMMENT 'Funcion factorial'
BEGIN
	DECLARE numFactorial INT default 1;
    declare i INT;
    
    bucle01:LOOP
		SELECT n;
			IF n>0 THEN
				set n =n-1;
				set numFactorial = numFactorial* n;
            ELSE 
                return -1;
			END IF;
    END LOOP;
Return numFactorial;
END