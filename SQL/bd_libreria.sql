DROP DATABASE IF EXISTS libreria;
CREATE DATABASE IF NOT EXISTS libreria; 

USE libreria;

CREATE TABLE IF NOT EXISTS autores(
        autor_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE, 
        nombre VARCHAR(25) NOT NULL,
        apellidos VARCHAR(25) NOT NULL,
        nacionalidad VARCHAR(40) NOT NULL
);
CREATE TABLE IF NOT EXISTS ubicacion(
    ubicacion_id INT UNSIGNED PRIMARY KEY UNIQUE,
    municipio VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    pais VARCHAR(50) NOT NULL
);
CREATE TABLE IF NOT EXISTS direccion(
    direccion_id INT UNSIGNED PRIMARY KEY UNIQUE,
    ubicacion_id INT UNSIGNED NOT NULL,
    calle VARCHAR(10) NOT NULL,
    numero INT UNSIGNED NOT NULL,
    CP INT UNSIGNED NOT NULL,
    FOREIGN KEY (ubicacion_id) REFERENCES ubicacion(ubicacion_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS sucursales(
    sucursal_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT UNIQUE,
    direccion_id INT UNSIGNED NOT NULL,
    hora_apertura TIME DEFAULT '08:00:00',
    hora_cierre TIME DEFAULT '20:00:00',
    no_empleados INT UNSIGNED NOT NULL,
    FOREIGN KEY (direccion_id) REFERENCES direccion(direccion_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS editorial(
    editorial_id INT UNSIGNED PRIMARY KEY UNIQUE,
    nombre VARCHAR(25) NOT NULL,
    telefono DECIMAL(10) NOT NULL,
    correo VARCHAR(50) NOT NULL,
    URL VARCHAR(100) NOT NULL, 
    descripcion VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS edicion(
    edicion_id INT UNSIGNED PRIMARY KEY UNIQUE,
    editorial_id INT UNSIGNED NOT NULL,
    numero_edicion INT UNSIGNED NOT NULL,
    fecha_publicacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    idioma VARCHAR(50) NOT NULL,
    genero VARCHAR(25) NOT NULL,
    sipnopsis VARCHAR(100) NOT NULL,
    numero_paginas INT UNSIGNED NOT NULL,
    FOREIGN KEY (editorial_id) REFERENCES editorial(editorial_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS libros(
    libro_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT UNIQUE,
    autor_id INT UNSIGNED NOT NULL,
    sucursal_id INT UNSIGNED NOT NULL,
    edicion_id INT UNSIGNED NOT NULL,
    titulo VARCHAR(50) NOT NULL,
    stock INT UNSIGNED DEFAULT 0,
    precio DECIMAL (10,2) NOT NULL,
    FOREIGN KEY (autor_id) REFERENCES autores(autor_id) ON DELETE CASCADE,
    FOREIGN KEY (sucursal_id) REFERENCES sucursales(sucursal_id) ON DELETE CASCADE,
    FOREIGN KEY (edicion_id) REFERENCES edicion(edicion_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS clientes(
    cliente_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono DECIMAL(10) NOT NULL,
    correo VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS venta(
    venta_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT UNIQUE,
    cliente_id INT UNSIGNED,
    fecha_compra DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2) NOT NULL DEFAULT 0,
    FOREIGN KEY (cliente_id) REFERENCES clientes(cliente_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS detalle_venta(
    detalleVenta_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT UNIQUE,
    venta_id INT UNSIGNED NOT NULL,
    libro_id INT UNSIGNED NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (libro_id) REFERENCES libros(libro_id) ON DELETE CASCADE,
    FOREIGN KEY (venta_id) REFERENCES venta(venta_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS empleados(
    empleados_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT UNIQUE,
    sucursal_id INT UNSIGNED NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    NSS VARCHAR(15) NOT NULL UNIQUE,
    puesto VARCHAR(50) NOT NULL, 
    FOREIGN KEY (sucursal_id) REFERENCES sucursales(sucursal_id) ON DELETE CASCADE
);
SHOW TABLES; 
SELECT libros.titulo, autores.nombre, autores.apellidos
FROM libros
JOIN autores ON libros.autor_id = autores.autor_id;