package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class InventarioController {

    @FXML
    private TextField codigoField, nombreField, fechaCompraField,
            proveedorField, cantidadField, unidadField,
            costoUnitarioField, costoTotalField, fechaVencimientoField;

    @FXML
    private ComboBox<String> estadoComboBox;

    @FXML
    private TableView<?> tablaInventario;

     @FXML
    private void volverMenu(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/views/Main.fxml"));
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Sistema de Gestión de Exportación de Flores - SGEF");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error al regresar al menú");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    private void registrarProducto() {
        // TODO: Implementar lógica para registrar producto
        System.out.println("Registrar producto...");
    }

    @FXML
    private void consultarProducto() {
        // TODO: Implementar lógica para consultar productos
        System.out.println("Consultar producto...");
    }

    @FXML
    private void actualizarProducto() {
        // TODO: Implementar lógica para actualizar datos
        System.out.println("Actualizar producto...");
    }

    @FXML
    private void actualizarEstadoProducto() {
        // TODO: Implementar lógica para actualizar estado
        System.out.println("Actualizar estado de producto...");
    }

    private void mostrarError(String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
