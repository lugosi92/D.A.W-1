USE Matriculacion;

INSERT INTO ciclo VALUES (1111, 'Desarrollo de aplicaciones Web') ;
INSERT INTO ciclo VALUES (2222, 'Desarrollo de aplicaciones multiplataforma') ;


INSERT INTO alumno (NIA, nombre, apellidos, fechaNacimiento,email,delegado) VALUES (11111111, 'Khalid', 'Beno', '2002-11-22', 'khaledben1236@gmail.com', FALSE);
INSERT INTO alumno (NIA, nombre, apellidos, fechaNacimiento,email,delegado) VALUES (22222222, 'Jesus', 'Villaverde', '2004-06-09', 'jesus@gmail.com', TRUE);
INSERT INTO alumno (NIA, nombre, apellidos, fechaNacimiento,email,delegado) VALUES (33333333, 'Ivan', 'Soria', '2003-01-22', 'Ivan@gmail.com', FALSE);
INSERT INTO alumno (NIA, nombre, apellidos, fechaNacimiento,email,delegado) VALUES (44444444, 'Isac', 'Ingles', '2004-09-23', 'Isac@gmail.com', FALSE);
INSERT INTO alumno (NIA, nombre, apellidos, fechaNacimiento,email,delegado) VALUES (55555555, 'Elena', 'Romeo', '1988-08-09', 'Elena@gmail.com', FALSE);


INSERT INTO modulo (codModulo, nombre, horas, creditos) VALUES (321, 'Base de datos', '40:00:00', 45);
INSERT INTO modulo (codModulo, nombre, horas, creditos) VALUES (322, 'Programacion', '70:00:00', 45);
INSERT INTO modulo (codModulo, nombre, horas, creditos) VALUES (323, 'Entornos', '20:00:00', 45);
INSERT INTO modulo (codModulo, nombre, horas, creditos) VALUES (324, 'Fol', '100:00:00', 45);
INSERT INTO modulo (codModulo, nombre, horas, creditos) VALUES (325, 'Sistemas', '50:00:00', 45);




INSERT INTO matricula (numMatricula, fechaMatricula, repetidor, NIA,codCiclo) VALUES (1, '2023-09-5', True, 11111111, 1111);
INSERT INTO matricula (numMatricula, fechaMatricula, repetidor, NIA,codCiclo) VALUES (2, '2023-09-5', True, 22222222, 1111);
INSERT INTO matricula (numMatricula, fechaMatricula, repetidor, NIA,codCiclo) VALUES (3, '2023-09-5', True, 33333333, 1111);
INSERT INTO matricula (numMatricula, fechaMatricula, repetidor, NIA,codCiclo) VALUES (4, '2023-09-5', True, 44444444, 1111);
INSERT INTO matricula (numMatricula, fechaMatricula, repetidor, NIA,codCiclo) VALUES (5, '2023-09-5', False, 55555555, 1111);

-- Khalid
INSERT INTO modulomatricula (numMatricula, fechaMatricula, codModulo)VALUES (1, '2023-09-5', 321);
INSERT INTO modulomatricula (numMatricula, fechaMatricula, codModulo)VALUES (1, '2023-09-5', 322);
INSERT INTO modulomatricula (numMatricula, fechaMatricula, codModulo)VALUES (1, '2023-09-5', 323);
INSERT INTO modulomatricula (numMatricula, fechaMatricula, codModulo)VALUES (1, '2023-09-5', 324);
INSERT INTO modulomatricula (numMatricula, fechaMatricula, codModulo)VALUES (1, '2023-09-5', 325);


INSERT INTO aula (codAula, nombre)VALUES (412, 'AULA A4.1.2: DAW 1º');
INSERT INTO aula (codAula, nombre)VALUES (413, 'AULA A4.1.3: DAM 1º');
INSERT INTO aula (codAula, nombre)VALUES (411, 'AULA A4.1.1: DAM 2º');
INSERT INTO aula (codAula, nombre)VALUES (414, 'AULA A4.1.4: DAW 2º');


INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (1111, 321, 412);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (1111, 322, 412);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (1111, 323, 412);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (1111, 324, 412);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (1111, 325, 412);

INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (2222, 321, 413);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (2222, 322, 413);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (2222, 323, 413);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (2222, 324, 413);
INSERT INTO modulociclo (codCiclo, codModulo, codAula)VALUES (2222, 325, 413);


INSERT INTO curso (codCurso, nombreCurso, curso,codCiclo, codModulo)VALUES (3333, 'Desarrollo de aplicaciones Web', '1',1111,321);
-- ...