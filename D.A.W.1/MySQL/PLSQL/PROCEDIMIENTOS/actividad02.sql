CREATE DEFINER=`root`@`localhost` PROCEDURE `actividad02`(out numero int, out fecha datetime)
    COMMENT '2.PROCEDIMIENTO PARA CONTAR EL NUMERO DE PERSONAS EN LA BASE DE DATOS EN UNA FECHA CONCRETA'
BEGIN
	DECLARE numero_persona int;
    DECLARE fecha_concreta DATETIME;
    
	SELECT count(*) INTO numero_persona;
    SELECT sysdate() INTO fecha_concreta;
    SELECT numero_persona AS 'num_persona', fecha_concreta AS 'fecha_concreta'
    FROM persona;

END