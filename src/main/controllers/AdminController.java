package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {

    @FXML
    private ComboBox<String> rolComboBox;

    @FXML
    private TextField nombreField, apellidoField, cedulaField, correoField, contrasenaField;

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
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error al regresar al menú");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    private void crearUsuario() {
        // TODO: Implementar creación de usuario
        System.out.println("Creando usuario...");
    }

    @FXML
    private void consultarUsuario() {
        // TODO: Implementar consulta de usuario
        System.out.println("Consultando usuario...");
    }

    @FXML
    private void actualizarUsuario() {
        // TODO: Implementar actualización de usuario
        System.out.println("Actualizando usuario...");
    }

    @FXML
    private void inactivarUsuario() {
        // TODO: Implementar lógica para inactivar usuario
        System.out.println("Inactivando usuario...");
    }
}
