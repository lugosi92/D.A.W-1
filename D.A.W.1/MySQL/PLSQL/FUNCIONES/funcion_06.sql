CREATE DEFINER=`root`@`localhost` FUNCTION `funcion_06`(n INT) RETURNS int
    DETERMINISTIC
    COMMENT 'Funcion factorial'
BEGIN
	DECLARE numFactorial INT default 1;
    
    IF n<0 THEN 
		return -1;
	END IF;
    
    bucle01:LOOP
			IF n<=1 THEN
				LEAVE bucle01;
			END IF;
            
            IF n>1 THEN
				set numFactorial = numFactorial* n;
                set n =n-1;
			END IF;
    END LOOP;
Return numFactorial;
END