package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class RegistrarInventarioController {

    @FXML
    private TextField codigoField, nombreField, fechaCompraField,
            proveedorField, cantidadField, unidadField,
            costoUnitarioField, costoTotalField, fechaVencimientoField;

    @FXML
    private ComboBox<String> estadoComboBox;

    @FXML
    private void registrarProducto(ActionEvent event) {
        // Aquí implementar la lógica real de registro (validaciones, persistencia, etc.)
        System.out.println("Producto registrado:");
        System.out.println("Código: " + codigoField.getText());
        System.out.println("Nombre: " + nombreField.getText());
        // ... puedes agregar más campos si quieres mostrar

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Producto registrado correctamente.");
        alert.showAndWait();

        cerrarVentana(event);
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) codigoField.getScene().getWindow();
        stage.close();
    }
}
