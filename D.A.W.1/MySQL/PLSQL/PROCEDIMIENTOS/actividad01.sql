CREATE DEFINER=`root`@`localhost` PROCEDURE `actividad01`(IN dni_user varchar(9))
    COMMENT '1.- Pasar DNI, en caso de que no tenga teléfono que aparezca el mensaje'
BEGIN
	DECLARE v_telefono  varchar(30);
    
	SELECT IFNULL(telefono, 'No tiene telefono') INTO v_telefono
    FROM telefono
    WHERE telefono=dni_user;
	SELECT v_telefono AS 'telefono';
END