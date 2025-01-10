

-- ENGINE=MyISAM Se utiliza para poder usar como PK el ENUM

CREATE database IF NOT EXISTS animals;
use animals;

CREATE TABLE IF NOT EXISTS animal(
id INT(3) UNSIGNED NOT NULL AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL,
PRIMARY KEY (id)
);

SET @@AUTO_INCREMENT_INCREMENT = 1;
SET @@AUTO_INCREMENT_OFFSET =1;

INSERT INTO animal(nombre) VALUES('dog'),('cat'),('penguin'),('lax'),('whale'),('ostrich'),('groundhog'),('squirrel');
-- INSERT INTO animal(nombre) VALUES('dog');
-- INSERT INTO animal(nombre) VALUES('cat');
-- INSERT INTO animal(nombre) VALUES('penguin');
-- INSERT INTO animal(nombre) VALUES('lax');
-- INSERT INTO animal(nombre) VALUES('whale');
-- INSERT INTO animal(nombre) VALUES('ostrich');
-- INSERT INTO animal(nombre) VALUES('groundhog');
-- INSERT INTO animal(nombre) VALUES('squirrel');
-- INSERT INTO animal(nombre) VALUES('rabbit');
-- INSERT INTO animal(nombre) VALUES('mouse');

INSERT INTO animal VALUES(100,'rabbit');
INSERT INTO animal(nombre) VALUES('mouse');

CREATE TABLE IF NOT EXISTS especieAnimal(
grupo ENUM('fish', 'mammal', 'bird') NOT NULL,
id INT (3) NOT NULL AUTO_INCREMENT,
nombre varchar(20) NOT NULL,
PRIMARY KEY (grupo, id)
)ENGINE=MyISAM;

-- ENGINE=MyISAM Se utiliza para poder usar como PK el ENUM

SET @@AUTO_INCREMENT_INCREMENT = 1;
SET @@AUTO_INCREMENT_OFFSET=1;

INSERT INTO especieAnimal (grupo, nombre)
VALUES ('fish', 'lax'), ('mammal', 'dog'), ('mammal', 'cat'), ('mammal', 'whale'), ('bird', 'ostrich'), ('bird', 'penguin');

-- desde aquí
CREATE TABLE usuarios(
id serial, 
name varchar(25)
);

CREATE TABLE envios(
id int,
cantidad int,
usuario_id SERIAL,
CONSTRAINT fk_01 FOREIGN KEY(usuario_id)
REFERENCES usuarios(id)
);

ALTER TABLE usuarios ADD fechaE DATE DEFAULT (current_date);
ALTER TABLE usuarios ADD fechasS DATE DEFAULT (fechaE + INTERVAL 1 YEAR);

INSERT INTO usuarios(name) VALUES ("Leo");
INSERT INTO usuarios(name) VALUES ("Elena");

INSERT INTO usuarios(name, fechaE, fechasS) 
VALUES ("Alvaro", '2024-02-05', fechaE + interval 1 month); 

INSERT INTO usuarios(name, fechaE, fechasS) 
VALUES ("Fran", '2024-02-05 9:30:00', fechaE + interval 31 day); 