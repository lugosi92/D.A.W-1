CREATE DEFINER=`khaled`@`localhost` PROCEDURE `mostrarNumerosWhile`(IN n INT)
    COMMENT 'Mostrar enteros desde el 1 hasta el numero introducido por el usuario'
BEGIN
	DECLARE i INT default 0; -- Contador
	WHILE i <= n DO SELECT i; -- SELECT es como el sysout | Muestra el contador
		SET i := i+1; -- Nuevo valor de i 
    END WHILE; -- Termina bucle
END