package com.jdbc;

import com.jdbc.view.View;
import com.jdbc.model.Model;
import com.jdbc.controller.Controller;

public class App {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}
