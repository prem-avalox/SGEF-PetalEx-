package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ConsultarInventarioController {

    @FXML
    private TableView<?> tablaInventario;

    @FXML
    private void consultarProducto(ActionEvent event) {
        // TODO: Implementar lógica real de búsqueda en inventario
        System.out.println("Buscando productos en inventario...");
        mostrarMensaje("Búsqueda ejecutada (simulada).");
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) tablaInventario.getScene().getWindow();
        stage.close();
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
