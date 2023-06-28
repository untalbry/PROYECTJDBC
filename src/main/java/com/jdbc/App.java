package com.jdbc;

import com.jdbc.view.View;
import com.jdbc.controller.Controller;

public class App {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
    }
}
