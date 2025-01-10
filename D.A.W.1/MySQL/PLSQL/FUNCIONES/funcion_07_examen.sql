CREATE DEFINER=`khaled`@`localhost` FUNCTION `funcion_07`(numero int) RETURNS varchar(20) CHARSET utf8mb4
    DETERMINISTIC
    COMMENT 'Es Par, Devaolvera true si es par con 1 y False 0 si es impar'
    COMMENT 'No automatizado --> select if(funcion_07(6)=1,Es Par, Es Impar) AS numero 6;'
    comment 'select @numero AS Numero, if(funcion_07(@numero)=1,Es Par,Es Impar) AS ES par/impar;'
BEGIN
	DECLARE resultado varchar(20);
    
    IF mod(numero,2)= 0 THEN 
     set resultado = 'Par';
	ELSE 
     set resultado = 'Impar'; 
	END IF;

RETURN resultado;
END