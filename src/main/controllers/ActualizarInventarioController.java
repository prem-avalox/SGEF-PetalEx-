package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ActualizarInventarioController {

    @FXML
    private TextField codigoField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField fechaCompraField;

    @FXML
    private TextField proveedorField;

    @FXML
    private TextField cantidadField;

    @FXML
    private TextField unidadField;

    @FXML
    private TextField costoUnitarioField;

    @FXML
    private TextField costoTotalField;

    @FXML
    private TextField fechaVencimientoField;

    @FXML
    private ComboBox<String> estadoComboBox;

    @FXML
    private void actualizarProducto() {
        // TODO: Lógica real para actualizar en la base de datos
        System.out.println("Actualizando producto...");
        System.out.println("Código: " + codigoField.getText());
        System.out.println("Nombre: " + nombreField.getText());

    }

    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) codigoField.getScene().getWindow();
        stage.close();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
