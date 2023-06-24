package com.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conection implements Connection {
    private final String URL = "<URL>";
    private final String USERNAME = "<USERNAME>";
    private final String PASSWORD = "<PASSWORD>";

    // Objeto de tipo connection para manejar la DB
    protected Connection con = null;

    // Metodo getConexion(): intenta conectar a la DB, si lo logra guarda la
    // conexion en la variable 'con', caso contrario imprime la excepcion.
    public Connection getConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error ===> " + e.getMessage());
        }
        return con;
    }

}
