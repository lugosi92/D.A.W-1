CREATE FUNCTION `menor_3_numeros` (n1 int, n2 int, n3 int)
RETURNS INT
DETERMINISTIC

BEGIN
DECLARE max smallint DEFAULT n1;
	IF n2>max
		return max=n2;
	else if n3>max
		return max;
        END IF;
RETURN 1;
END