package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ActualizarInfoClientesController {

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
    private Button actualizarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    private void initialize() {
        // Inicializa el ComboBox con ejemplos de tipos de identificación
        tipoIdentificacionCombo.getItems().addAll("Cédula", "RUC", "Pasaporte");
    }

    @FXML
    private void actualizarCliente(ActionEvent event) {
        // Aquí va la lógica para actualizar el cliente
        System.out.println("Actualizar información del cliente:");
        System.out.println("Tipo ID: " + tipoIdentificacionCombo.getValue());
        System.out.println("Identificador: " + identificadorField.getText());
        System.out.println("Nombres: " + nombresField.getText());
        System.out.println("Dirección: " + direccionField.getText());
        System.out.println("Teléfono: " + telefonoField.getText());
        System.out.println("Correo: " + correoField.getText());

        // Luego, puedes agregar código para validar y guardar datos en la base de datos
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
