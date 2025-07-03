package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ProveedoresController {

    @FXML
    private TextField rucField, nombreField, telefonoField, direccionField;

    @FXML
    private ComboBox<String> estadoVentaCombo;

    @FXML
    private TableView<?> tablaProveedores;

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
    private void registrarProveedor() {
        // TODO: lógica para registrar proveedor
        System.out.println("Registrar proveedor...");
    }

    @FXML
    private void consultarProveedor() {
        // TODO: lógica para consultar proveedor
        System.out.println("Consultar proveedor...");
    }

    @FXML
    private void actualizarProveedor() {
        // TODO: lógica para actualizar proveedor
        System.out.println("Actualizar proveedor...");
    }

    @FXML
    private void actualizarEstadoProveedor() {
        // TODO: lógica para actualizar estado
        System.out.println("Actualizar estado de proveedor...");
    }
}
