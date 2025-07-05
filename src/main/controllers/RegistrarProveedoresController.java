package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

public class RegistrarProveedoresController {

    @FXML
    private TextField rucField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField direccionField;

    @FXML
    private ComboBox<String> estadoVentaCombo;

    @FXML
    private void registrarProveedor(ActionEvent event) {
        // Aquí iría la lógica para validar e insertar el proveedor en la base de datos

        String ruc = rucField.getText();
        String nombre = nombreField.getText();
        String telefono = telefonoField.getText();
        String direccion = direccionField.getText();
        String estadoVenta = estadoVentaCombo.getValue();

        if (ruc.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || estadoVenta == null) {
            mostrarError("Datos incompletos", "Por favor, complete todos los campos.");
            return;
        }

        // Simulación de registro
        System.out.println("Registrando proveedor:");
        System.out.println("RUC: " + ruc);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Estado de Venta: " + estadoVenta);

        // Después de registrar, cerrar la ventana
        cerrarVentana();
    }

    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) rucField.getScene().getWindow();
        stage.close();
    }

    private void mostrarError(String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
