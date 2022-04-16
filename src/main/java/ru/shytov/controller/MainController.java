package ru.shytov.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MainController {

    public TextField textField;

    private int result;

    public void slozenie(ActionEvent actionEvent) {
        int var = Integer.parseInt(textField.getText());

        result += var;

        textField.clear();
        textField.setPromptText(String.valueOf(result));
    }

    public void vichitanie(ActionEvent actionEvent) {
        int var = Integer.parseInt(textField.getText());

        result -= var;

        textField.clear();
        textField.setPromptText(String.valueOf(result));
    }

    public void ymnozenie(ActionEvent actionEvent) {
        int var = Integer.parseInt(textField.getText());

        result *= var;

        textField.clear();
        textField.setPromptText(String.valueOf(result));
    }

    public void delenie(ActionEvent actionEvent) {
        int var = Integer.parseInt(textField.getText());

        result /= var;

        textField.clear();
        textField.setPromptText(String.valueOf(result));
    }

    public void removeResult(ActionEvent actionEvent) {
        result = 0;

        textField.clear();
        textField.setPromptText(String.valueOf(result));
    }
}
