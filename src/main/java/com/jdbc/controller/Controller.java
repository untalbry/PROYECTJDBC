package com.jdbc.controller;

import com.jdbc.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {
    private View view;
    private String query;

    public Controller(View view) {
        try {
            Connection connection = DriverManager.getConnection("", "", "");
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
            e.printStackTrace();
        }

    }

    private void JButton1ActionPerformed(ActionEvent evt) {
        view.setTxt("");
        System.out.println("Boton limpiar");
    }

    private void JButton2ActionPerformed(ActionEvent evt) {
        this.query = view.getTxt();
        System.out.println(query);
    }

}
