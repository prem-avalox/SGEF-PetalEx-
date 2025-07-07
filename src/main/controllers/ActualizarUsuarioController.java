package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ActualizarUsuarioController {

    @FXML
    private ComboBox<String> rolComboBox;

    @FXML
    private TextField nombreField, apellidoField, correoField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private void actualizarUsuario(ActionEvent event) {
        // TODO: Implementa la lógica para actualizar usuario aquí
        System.out.println("Actualizando usuario...");


        cerrarVentana(event);
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    private void mostrarError(String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
