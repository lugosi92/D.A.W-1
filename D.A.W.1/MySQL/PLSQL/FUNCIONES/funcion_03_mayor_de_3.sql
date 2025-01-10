CREATE DEFINER=`root`@`localhost` FUNCTION `funcion_03_mayor_de_3`(n1 INT,n2 INT,n3 INT) RETURNS int
    DETERMINISTIC
BEGIN
	IF n1>n2 and n1>n3 THEN 
		RETURN n1;
    ELSE IF n2>n1  and n2 >n3 THEN 
		RETURN n2;
    ELSE 
		RETURN N3;
    END IF;
    END IF;
END