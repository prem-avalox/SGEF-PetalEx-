package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ActualizarClientesController {

    @FXML
    private TableView<?> tablaClientes;

    @FXML
    private void actualizarCliente(ActionEvent event) {
        // TODO: Implementar lógica real de actualización
        System.out.println("Actualizando información del cliente...");
        mostrarMensaje("Información del cliente actualizada (simulado).");
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) tablaClientes.getScene().getWindow();
        stage.close();
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
