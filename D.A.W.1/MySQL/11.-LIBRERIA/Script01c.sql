USE LIBRERIA;

create index idx_libro ON LIBRO(cate_id);
CREATE TABLE IF NOT EXISTS CATEGORIA(
id_cate int4 auto_increment,
cate_id VARCHAR(5) NOT NULL ,
nombre VARCHAR(20) NOT NULL,
PRIMARY KEY(id_cate),
CONSTRAINT fk_cate FOREIGN KEY (cate_id) REFERENCES LIBRO(cate_id) ON UPDATE CASCADE ON DELETE CASCADE 
)Engine= InnoDB DEFAULT CHARSET = utf8mb4;

INSERT INTO CATEGORIA (cate_id, nombre)  VALUES('CA001','Fisica'),
											   ('CA002','Termodinámica'),
                                               ('CA003','Computers'),
                                               ('CA002','Termodinámica'),
                                               ('CA001','Fisica'),
                                               ('CA001','Fisica'),
                                               ('CA003','Computers'),
                                               ('CA008','Anatomía'),
                                               ('CA009','Psicología'),
                                               ('CA002','Termodinámica'),
                                               ('CA004','Ciencias Naturales'),
                                               ('CA004','Ciencias Naturales'),
                                               ('CA004','Ciencias Naturales'),
                                               ('CA005','Medicina'),
                                               ('CA005','Medicina'),
                                               ('CA003','Computers');
                                               

SET SQL_SAFE_UPDATES = 1;
delete from CATEGORIA;