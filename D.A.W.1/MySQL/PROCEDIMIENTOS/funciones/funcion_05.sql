CREATE DEFINER=`khaled`@`localhost` FUNCTION `funcion_05`(n INT) RETURNS varchar(5) CHARSET utf8mb4
    NO SQL
    COMMENT 'Introducir numero y convertir a formato de texto'
BEGIN
	CASE n
		WHEN 1 THEN return "UNO";
        WHEN 2 THEN return "DOS";
        WHEN 3 THEN return "TRES";
        ELSE 
			RETURN "ERROR";
    END CASE;
    
END