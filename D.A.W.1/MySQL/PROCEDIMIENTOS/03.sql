CREATE DEFINER=`khaled`@`localhost` PROCEDURE `procedimiento03`(out numero int, out fecha date)
    COMMENT 'PROCEDIMIENTO PARA CONTAR EL NUMERO DE PERSONAS EN LA BASE DE DATOS EN UNA FECHA CONCRETA'
BEGIN
	select COUNT(*) FROM Persona INTO numero;
    select sysdate () INTO fecha;
    SELECT numero AS 'NUMERO DE PERSONAS', fecha AS 'FECHA ACTUAL';
END