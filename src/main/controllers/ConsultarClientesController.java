package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ConsultarClientesController {

    @FXML
    private TableView<?> tablaClientes;

    @FXML
    private void consultarCliente(ActionEvent event) {
        // TODO: Implementar lógica real de búsqueda
        System.out.println("Buscando clientes...");
        mostrarMensaje("Búsqueda ejecutada (simulada).");
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
