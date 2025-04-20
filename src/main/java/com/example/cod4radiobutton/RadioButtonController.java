package com.example.cod4radiobutton;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.awt.event.ActionEvent;

public class RadioButtonController {

    @FXML
    private RadioButton TerceraEdad;

    @FXML
    private RadioButton Miercoles;

    @FXML
    private Label LabelPrecio;
    @FXML
    public void calcular(javafx.event.ActionEvent actionEvent) {
        int precio = 150;
        if (TerceraEdad.isSelected())
            precio -= 30;
        if (Miercoles.isSelected())
            precio -= 20;
        LabelPrecio.setText("Precio: $" + precio);
    }

    @FXML
    public void salir(javafx.event.ActionEvent actionEvent) {
        Platform.exit();
    }
}