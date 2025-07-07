package main.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AdminController {

    @FXML
    private TableView<?> tablaUsuarios;

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
    private void abrirCrearUsuario(ActionEvent event) {
        abrirVentana("/main/views/CrearUsuarioView.fxml", "Crear Usuario");
    }

    @FXML
    private void abrirConsultarUsuario(ActionEvent event) {
        abrirVentana("/main/views/ConsultarUsuarioView.fxml", "Consultar Usuario");
    }

    @FXML
    private void abrirActualizarUsuario(ActionEvent event) {
        abrirVentana("/main/views/ActualizarInfoUsuarioView.fxml", "Actualizar información Usuario");
    }

    @FXML
    private void abrirInactivarUsuario(ActionEvent event) {
        abrirVentana("/main/views/InactivarUsuarioView.fxml", "Inactivar Usuario");
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
        }
    }

    private void mostrarError(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
