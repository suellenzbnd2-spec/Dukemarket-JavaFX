package br.dev.suellen.dukemarket.javafx.controller;

import br.dev.suellen.dukemarket.javafx.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}