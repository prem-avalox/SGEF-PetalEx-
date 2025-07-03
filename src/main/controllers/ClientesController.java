package main.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ClientesController {

    @FXML
    private ComboBox<String> tipoIdentificacionCombo;

    @FXML
    private TextField identificadorField;

    @FXML
    private TextField nombresField;

    @FXML
    private TextField direccionField;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField correoField;

    @FXML
    private TableView<?> tablaClientes;

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
    private void registrarCliente() {
        // TODO: Agregar lógica para registrar un cliente
        System.out.println("Registrando cliente...");
    }

    @FXML
    private void consultarCliente() {
        // TODO: Agregar lógica para buscar un cliente
        System.out.println("Consultando cliente...");
    }

    @FXML
    private void actualizarInfoCliente() {
        // TODO: Agregar lógica para actualizar datos del cliente
        System.out.println("Actualizando información del cliente...");
    }

    @FXML
    private void actualizarEstadoCliente() {
        // TODO: Agregar lógica para cambiar estado (activo/inactivo, etc.)
        System.out.println("Actualizando estado del cliente...");
    }
}
