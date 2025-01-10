CREATE DEFINER=`khaled`@`localhost` PROCEDURE `mostrarNumeroLoop`(in i INT)
BEGIN
	DECLARE i INT DEFAULT 0; -- CONTADOR
    bucle01:LOOP
		SELECT i;
        SET i =i+1;
        IF i>n THEN 
			LEAVE bucle01;
		END IF;
    END LOOP;

END