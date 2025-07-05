package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ConsultarUsuarioController {

    @FXML
    private TextField filtroNombreField, filtroCorreoField;

    @FXML
    private TableView<?> tablaUsuarios;

    @FXML
    private void consultarUsuario(ActionEvent event) {
        // TODO: Implementa lógica de búsqueda aquí
        System.out.println("Buscando usuarios con filtros: nombre=" 
            + filtroNombreField.getText() + ", correo=" + filtroCorreoField.getText());
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    private void mostrarError(String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
