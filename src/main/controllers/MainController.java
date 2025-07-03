package main.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MainController {

    // Método genérico para cambiar escena
    private void cambiarEscena(String fxmlPath, String titulo, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openClientes(ActionEvent event) {
        cambiarEscena("/main/views/ClientesView.fxml", "SGEF - Módulo Clientes", event);
    }

    @FXML
    private void openVentas(ActionEvent event) {
        cambiarEscena("/main/views/VentasView.fxml", "SGEF - Módulo Ventas", event);
    }

    @FXML
    private void openProveedores(ActionEvent event) {
        cambiarEscena("/main/views/ProveedoresView.fxml", "SGEF - Módulo Proveedores", event);
    }

    @FXML
    private void openInventario(ActionEvent event) {
        cambiarEscena("/main/views/InventarioView.fxml", "SGEF - Módulo Inventario", event);
    }

    @FXML
    private void openAdmin(ActionEvent event) {
        cambiarEscena("/main/views/AdministracionSistemaView.fxml", "SGEF - Módulo Administración", event);
    }
}