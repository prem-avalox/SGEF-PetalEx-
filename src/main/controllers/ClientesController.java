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
        }
    }

    @FXML
    private void registrarCliente() {
        abrirVentana("/main/views/RegistrarClientesView.fxml", "Registrar Clientes");
    }

    @FXML
    private void consultarCliente() {
        abrirVentana("/main/views/ConsultarClientesView.fxml", "Consultar Clientes");
    }

    @FXML
    private void actualizarInfoCliente() {
        abrirVentana("/main/views/ActualizarInfoClientesView.fxml", "Actualizar Clientes");
    }

    @FXML
    private void actualizarEstadoCliente() {
        abrirVentana("/main/views/ActualizarEstadoClientesView.fxml", "Actualizar Estado de Clientes");
    }

    /**
     * Método genérico para abrir una ventana nueva.
     */
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
        }
    }

    private void mostrarError(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
