package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrarClientesController {

    @FXML
    private TextField tipoIdentificacionField;

    @FXML
    private TextField identificadorField;

    @FXML
    private TextField nombresField;

    @FXML
    private TextField direccionField;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField correoField;

    @FXML
    private void registrarCliente(ActionEvent event) {
        // TODO: Lógica real de registro
        System.out.println("Cliente registrado:");
        System.out.println("Identificador: " + identificadorField.getText());
        mostrarMensaje("Cliente registrado correctamente.");
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) tipoIdentificacionField.getScene().getWindow();
        stage.close();
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
