package com.jdbc.controller;

import com.jdbc.model.Model;
import com.jdbc.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view;
    private Model model;
    private String query;

    public Controller(Model model, View view) {
        this.model = model;
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
