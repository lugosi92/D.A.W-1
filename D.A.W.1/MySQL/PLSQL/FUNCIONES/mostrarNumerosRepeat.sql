CREATE DEFINER=`khaled`@`localhost` PROCEDURE `mostrarNumerosRepeat`(in n INT)
BEGIN
	declare i int default 0; -- CONTADOR
    repeat
		SELECT i;
        SET i = i+1;
	UNTIL i>n
    end repeat;

END