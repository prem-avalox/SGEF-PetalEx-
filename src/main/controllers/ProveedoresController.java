package main.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
            mostrarError("Error al regresar al menú", e.getMessage());
        }
    }

    @FXML
    private void registrarProveedor() {
        abrirVentana("/main/views/RegistrarProveedoresView.fxml", "Registrar Proveedor");
    }

    @FXML
    private void consultarProveedor() {
        abrirVentana("/main/views/ConsultarProveedoresView.fxml", "Consultar Proveedor");
    }

    @FXML
    private void actualizarProveedor() {
        abrirVentana("/main/views/ActualizarInfoProveedoresView.fxml", "Actualizar información Proveedor");
    }

    @FXML
    private void actualizarEstadoProveedor() {
        abrirVentana("/main/views/ActualizarEstadoProveedoresView.fxml", "Actualizar Estado de Proveedor");
    }

    private void abrirVentana(String fxmlPath, String titulo) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));

            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarError("Error al abrir la ventana", e.getMessage());
        }
    }

    private void mostrarError(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
