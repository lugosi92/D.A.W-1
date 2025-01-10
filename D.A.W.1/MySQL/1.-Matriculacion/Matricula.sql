Create database if not exists Matriculacion;
Use Matriculacion;

CREATE TABLE if not exists ciclo(
codCiclo VARCHAR(10) PRIMARY KEY,
nombreCiclo VARCHAR(50)
);

CREATE TABLE if not exists alumno(
NIA INT(9) PRIMARY KEY,
nombre VARCHAR(29),
apellidos VARCHAR(50),
fechaNacimiento DATE,
email VARCHAR(100),
delegado BOOLEAN
);

CREATE TABLE if not exists matricula(
numMatricula INT(9),
fechaMatricula DATE,
repetidor BOOLEAN,
NIA int(9),
codCiclo VARCHAR(10),
PRIMARY KEY (numMatricula, fechaMatricula),
FOREIGN KEY (NIA) REFERENCES alumno(NIA)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (codCiclo) REFERENCES ciclo(codCiclo) ON DELETE CASCADE ON UPDATE CASCADE
);
 
CREATE TABLE if not exists modulo(
codModulo int(9) primary key,
nombre VARCHAR(20),
horas TIME,
creditos DECIMAL (4,2)
);

CREATE TABLE if not exists modulomatricula(
numMatricula INT(9),
fechaMatricula DATE,
codModulo INT(9),
-- PRIMARY KEY (numMatricula,fechaMatricula),
FOREIGN KEY (numMatricula,fechaMatricula) REFERENCES matricula(numMatricula, fechaMatricula) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (codModulo) REFERENCES modulo(codModulo) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE if not exists aula(
codAula int(9) PRIMARY KEY,
nombre VARCHAR(50)
);

CREATE TABLE if not exists modulociclo(
codCiclo VARCHAR(6),
codModulo INT(9),
codAula int(9),
PRIMARY KEY (codCiclo, codModulo),
FOREIGN KEY (codCiclo) REFERENCES ciclo(codCiclo)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (codModulo) REFERENCES modulo(codModulo) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (codAula) REFERENCES aula(codAula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE if not exists curso(
codCurso int(9) PRIMARY KEY,
nombreCurso VARCHAR(30),
curso ENUM ('1','2'),
codCiclo VARCHAR(10),
codModulo INT(9),
FOREIGN KEY (codCiclo) REFERENCES ciclo(codCiclo) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (codModulo) REFERENCES modulo (codModulo) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE if not exists votacion (
idVotacion INT(9) PRIMARY KEY,
fechaVotacion DATE,
codCurso int(9),
NIA int(9),
FOREIGN KEY (codCurso) REFERENCES curso(codCurso) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (NIA) REFERENCES alumno(NIA) ON DELETE CASCADE ON UPDATE CASCADE
);



ALTER TABLE ciclo MODIFY COLUMN nombreCiclo varchar(50);
ALTER TABLE ciclo MODIFY COLUMN codCiclo varchar(10);