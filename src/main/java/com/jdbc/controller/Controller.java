package com.jdbc.controller;

import com.jdbc.model.TransferObject.Book;
import com.jdbc.model.service.BookService;
import com.jdbc.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {
    private View view;
    private String query;
    BookService bookService;
    Book book;

    public Controller(View view) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/libreria",
                    "root",
                    "Cognito_1407.");
            System.out.println("Conexión exitosa");
            BookService bookService = new BookService(connection);

            this.view = view;
            view.setVisible(true);

            view.getJButton1().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    JButton1ActionPerformed(evt);
                }
            });
            view.getJButton2().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    JButton2ActionPerformed(evt);
                }
            });
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: ");
            e.printStackTrace();
        }

    }

    private void JButton1ActionPerformed(ActionEvent evt) {
        view.setTxt("");
        System.out.println("Boton limpiar");
    }

    private void JButton2ActionPerformed(ActionEvent evt) {
        this.query = view.getTxt();
        System.out.println("Buscando: " + query);
        try {
            book = bookService.getByName(query);
            System.out.println("Libro encontrado: ");
            System.out.println(book.getTitle());
        } catch (SQLException e) {
            System.out.println("Fallo en Button");
            e.getStackTrace();
        } catch (NullPointerException n) {
            System.out.println("Libro no encontrado");
        }

    }

}
