package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

public class InactivarUsuarioController {

    @FXML
    private Label mensajeLabel;

    @FXML
    private void confirmarInactivacion(ActionEvent event) {
        // TODO: Implementa la lógica para inactivar el usuario aquí
        System.out.println("Inactivando usuario...");

        // Confirmación exitosa, cerrar ventana
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
