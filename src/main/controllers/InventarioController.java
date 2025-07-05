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
            mostrarError("Error al regresar al menú", e.getMessage());
        }
    }

    @FXML
    private void registrarProducto() {
        abrirVentana("/main/views/RegistrarInventarioView.fxml", "Registrar Producto");
    }

    @FXML
    private void consultarProducto() {
        abrirVentana("/main/views/ConsultarInventarioView.fxml", "Consultar Producto");
    }

    @FXML
    private void actualizarProducto() {
        abrirVentana("/main/views/ActualizarInventarioView.fxml", "Actualizar Información del Producto");
    }

    @FXML
    private void actualizarEstadoProducto() {
        abrirVentana("/main/views/ActualizarEstadoInventarioView.fxml", "Actualizar Estado del Producto");
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
