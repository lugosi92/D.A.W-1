CREATE DEFINER=`khaled`@`localhost` FUNCTION `menor_3_numeros`(n1 int, n2 int, n3 int) RETURNS int
   
    DETERMINISTIC

BEGIN
DECLARE max smallint DEFAULT n1;
	IF n2>max then
		return max=n2;
	else if n3>max then
		return max;
        END IF;
        end IF;
RETURN 1;
END