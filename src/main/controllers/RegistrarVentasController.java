package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrarVentasController {

    @FXML
    private TextField ordenField, fechaField, codigoField,
            nombreProdField, precioField, cantidadField,
            pagoField, estadoField, usuarioField,
            subtotalField, ivaField, totalField;

    @FXML
    private void guardarVenta(ActionEvent event) {
        try {
            // Ejemplo simple de validación
            if (ordenField.getText().isEmpty() || codigoField.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Campos requeridos");
                alert.setContentText("Por favor, complete los campos obligatorios.");
                alert.showAndWait();
                return;
            }

            // Aquí iría la lógica para guardar la venta (en BD o estructura)
            System.out.println("Venta registrada: Orden " + ordenField.getText());

            // Cerrar ventana luego de guardar
            cerrarVentana(event);

        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error al guardar venta");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
