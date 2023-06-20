# LIBRARY DB JDBC Practice
## Requerimientos 
### a. Registro de libros:
- La base de datos debe permitir el registro de nuevos libros, incluyendo información como título, autor, editorial, fecha de publicación, número de páginas, género, y número de copias disponibles.
- Se debe poder asignar un identificador único a cada libro registrado.
### b. Registro de clientes:
- La base de datos debe permitir el registro de nuevos clientes, incluyendo información como nombre completo, número de teléfono y dirección de correo electrónico.
- Se debe poder asignar un identificador único a cada cliente registrado.
### c. Ventas:
- La base de datos debe permitir registrar las ventas de libros a los clientes, incluyendo la fecha de venta, los libros vendidos, la cantidad de cada libro y el total de la venta.
- Se debe poder asociar cada venta a un cliente específico.
### d. Búsqueda de libros:
- La base de datos debe permitir la búsqueda de libros por título, autor, género u otra información relevante.
- Debe ser posible obtener información sobre la disponibilidad de copias de un libro específico.

## Diagrama Entidad Entidad
![diagrama](https://github.com/xVrzBx/PROYECTJDBC/assets/91161604/245d2647-cdc6-420a-9423-f7372d20ca8b)
# Modelo Relacional 
## Normalización
Autores (autor id, nombre, apellido, nacionalidad) <br>
Ubicación (Ubicación id, municipio, estado, país)<br>
Dirección (Dirección id, ubicación id, calle, numero, CP)<br>
Sucursal (sucursal id, Dirección id, hora abertura, hora cierre)<br>
Editorial (Editorial id, nombre, teléfono, correo, URL, descripción)<br>
Edición (Edición id, Editorial id, numero de edición, fecha publicación, idioma del libro, genero, sinopsis, número de páginas)<br>
Libro (Libro id, autor id, Sucursal id, Edición id, titulo, stock, precio)<br>
Clientes (clientes id, nombre, apellido, correo electrónico, número de teléfono)<br>
Venta (venta id, cliente id, fecha, total de venta)<br>
Detalle venta (Detalle venta id, venta id, libro id, precio)<br>
Empleado (Empleado id, Sucursal id, nombre, apellido, NSS, puesto)<br>
### Diagrama de la Base de datos 
![untitled](https://github.com/xVrzBx/PROYECTJDBC/assets/91161604/a7d2afc7-31c9-487b-a4cb-41d54c8574ec)
# Como usar el proyecto
El proyecto tiene guardado el archico .sql para crear una base de datos en local en la carpeta SQL/ para que puedas tener la misma base de datos que el proyecto utiliza solamente por uso educativo. 

