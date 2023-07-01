DROP DATABASE IF EXISTS libreria;
CREATE DATABASE IF NOT EXISTS libreria; 

USE libreria;

CREATE TABLE IF NOT EXISTS autores(
        autor_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, 
        nombre VARCHAR(25) NOT NULL,
        apellidos VARCHAR(25) NOT NULL,
        seudonimo VARCHAR(50) UNIQUE,
        genero ENUM('M', 'F'),
        fecha_nacimiento L NOT NULL,
        pais_origen VARCHAR(40) NOT NULL,
        fecha_creacion DATETIME DEFAULT current_timestamp
);
CREATE TABLE IF NOT EXISTS libros(
    libro_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    autor_id INT UNSIGNED NOT NULL,
    titulo varchar(50) NOT NULL,
    descripcion varchar(100) NOT NULL DEFAULT '',
    paginas INTEGER UNSIGNED NOT NULL DEFAULT 0,
    fecha_publicacion DATE NOT NULL,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (autor_id) REFERENCES autores(autor_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS usuarios(
    usuario_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(25) NOT NULL,
    apellidos varchar(25) NOT NULL,
    username varchar(25) NOT NULL,
    email varchar(25) NOT NULL
);
SHOW TABLES; 
INSERT INTO autores(nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('John', 'Doe', 'JD123', 'M', '1990-01-01', 'Estados Unidos');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Alice', 'Smith', 'AS456', 'F', '1985-05-12', 'Reino Unido');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Juan', 'Pérez', 'JP789', 'M', '1988-09-25', 'España');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Emma', 'Johnson', 'EJ321', 'F', '1992-03-10', 'Canadá');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Alex', 'García', 'AG654', 'M', '1983-11-08', 'México');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Sophia', 'Martinez', 'SM987', 'F', '1995-07-15', 'Argentina');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('David', 'Brown', 'DB222', 'M', '1980-02-20', 'Australia');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Olivia', 'Lopez', 'OL111', 'F', '1987-06-29', 'Francia');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Daniel', 'Miller', 'DM777', 'M', '1993-12-05', 'Alemania');
INSERT INTO autores (nombre, apellidos, seudonimo, genero, fecha_nacimiento, pais_origen) VALUES
('Sophie', 'Taylor', 'ST444', 'F', '1998-04-18', 'Italia');

/* INSERTS  A LIBROS*/ 

INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(1, 'El camino de la aventura', 'Una emocionante historia llena de acción', 350, '2022-05-10');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(2, 'El secreto del bosque', 'Un misterio que cambiará todo', 280, '2021-08-15');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(3, 'La isla perdida', 'Una increíble aventura en busca del tesoro', 420, '2023-01-05');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(4, 'Amor en la ciudad', 'Una historia romántica ambientada en Nueva York', 200, '2020-03-20');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(5, 'La conspiración del pasado', 'Un thriller lleno de intriga y suspense', 320, '2022-11-30');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(6, 'El secreto de la montaña', 'Un enigma que desafiará tus creencias', 400, '2023-06-05');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(7, 'El camino hacia la libertad', 'Una historia inspiradora de superación personal', 250, '2021-05-01');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(8, 'La sombra del pasado', 'Un oscuro secreto que amenaza el presente', 380, '2022-09-12');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(9, 'El destino de los valientes', 'Una épica batalla por el futuro de la humanidad', 500, '2023-03-25');
INSERT INTO libros (autor_id, titulo, descripcion, paginas, fecha_publicacion) VALUES
(10, 'La búsqueda del tesoro perdido', 'Una emocionante odisea en busca de riquezas', 300, '2020-07-08');

SELECT * FROM autores;
SELECT * FROM libros;
SELECT * FROM usuarios;
SELECT * from libros;