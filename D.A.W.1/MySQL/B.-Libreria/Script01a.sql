DROP SCHEMA IF EXISTS LIBRERIA;
CREATE SCHEMA IF  NOT EXISTS LIBRERIA_12;
use LIBRERIA_12;

CREATE TABLE IF NOT EXISTS AUTOR(
  aut_id varchar(6) NOT NULL,
  aut_name varchar(30) NOT NULL UNIQUE,
  country enum ('UK','Canada', 'India', 'Germany', 'USA', 'Brazil', 'Australia') NOT NULL,
  home_city varchar(20),
  PRIMARY KEY(aut_id)  
)Engine= InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS PUBLICACION(
  pub_id varchar(4) NOT NULL UNIQUE,
  pub_name varchar(35) NOT NULL UNIQUE,
  pub_city enum ('New York','Mumbai','Adelaide','London','Houstan','Cambridge','New Delhi') NOT NULL,
  country enum('UK','Canada', 'India', 'Germany', 'USA', 'Brazil', 'Australia') NOT NULL,
  country_office varchar(15) NOT NULL,
  no_of_branch int(2) UNSIGNED NOT NULL,
  estd date NOT NULL,
  PRIMARY KEY(pub_id)
)Engine = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS LIBRO(
  book_id varchar(5) NOT NULL UNIQUE,
  book_name varchar(50) NOT NULL,
  isbn_no int(10) NOT NULL UNIQUE,
  cate_id varchar(5) NOT NULL,
  aut_id varchar(6) NOT NULL,
  pub_id varchar(4) NOT NULL,
  dt_of_pub date NOT NULL,
  pub_lang enum ('English', 'Hindi', 'German','French'),
  no_page int(4) UNSIGNED NOT NULL,
  book_price DECIMAL(5,2),
  PRIMARY KEY(book_id),
  CONSTRAINT fk_autor FOREIGN KEY(aut_id) REFERENCES AUTOR(aut_id) ON DELETE CASCADE ON UPDATE CASCADE, -- Si se actualiza o se borra un autor, se actualiza o se borra sus libros.
  CONSTRAINT fk_publicacion FOREIGN KEY(pub_id) REFERENCES PUBLICACION(pub_id) ON DELETE NO ACTION ON UPDATE CASCADE, -- No se pueden borrar las listas de publicación, pero si actualizar... 
  CONSTRAINT fk_fecha CHECK (dt_of_pub between '2000-01-01' AND '2010-12-31'), -- Las fechas de publicación de la tabla libro serán entre 01/01/2000 y 31/12/2010.
  CONSTRAINT fk_pagina CHECK (no_page > 30 and no_page < 1000), -- El número de páginas de un libro deberá ser mayor que 30 y menor que 1000.
  CONSTRAINT fk_book_price CHECK (book_price > 0) -- El precio de un libro deberá ser mayor que cero.
  )Engine= InnoDB DEFAULT CHARSET =utf8mb4;
  
  

