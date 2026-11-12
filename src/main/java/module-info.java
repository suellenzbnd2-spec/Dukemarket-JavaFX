module br.dev.suellen.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;

    opens br.dev.suellen.dukemarket.javafx to javafx.fxml;
    opens br.dev.suellen.dukemarket.javafx.controller to javafx.fxml;
    
    exports br.dev.suellen.dukemarket.javafx;
    exports br.dev.suellen.dukemarket.javafx.controller;
    exports br.dev.suellen.dukemarket.javafx.DAO;
    exports br.dev.suellen.dukemarket.javafx.model;
    exports connection;
    
    requires mysql.connector.java;
}
