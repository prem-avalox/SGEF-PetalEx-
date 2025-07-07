package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class CrearUsuarioController {

    @FXML
    private ComboBox<String> rolComboBox;

    @FXML
    private TextField nombreField, apellidoField, cedulaField, correoField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private void crearUsuario(ActionEvent event) {
        // TODO: Agrega la lógica para crear usuario aquí
        System.out.println("Creando usuario...");

        // Ejemplo: validaciones simples
        if (nombreField.getText().isEmpty() || correoField.getText().isEmpty()) {
            
            return;
        }

        // Al crear usuario con éxito, cierra ventana
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
