package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class VentasController {

    @FXML
    private TextField ordenField, fechaField, codigoField,
            nombreProdField, precioField, cantidadField,
            pagoField, estadoField, usuarioField,
            subtotalField, ivaField, totalField;

    @FXML
    private TableView<?> tablaVentas;

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
    private void registrarVenta() {
        // TODO: Implementar lógica
        System.out.println("Registrando venta...");
    }

    @FXML
    private void consultarVenta() {
        // TODO: Implementar lógica
        System.out.println("Consultando venta...");
    }

    @FXML
    private void anularVenta() {
        // TODO: Implementar lógica
        System.out.println("Anulando venta...");
    }
}
