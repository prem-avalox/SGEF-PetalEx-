package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class AnularVentasController {

    @FXML
    private TableView<?> tablaVentas;
    @FXML
    private javafx.scene.control.TextArea motivoField;

    @FXML
    private void anularVenta(ActionEvent event) {
        Object ventaSeleccionada = tablaVentas.getSelectionModel().getSelectedItem();

        if (ventaSeleccionada == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Selección requerida");
            alert.setContentText("Debe seleccionar una venta para anular.");
            alert.showAndWait();
            return;
        }

        String motivo = motivoField.getText();
        System.out.println("Venta anulada: " + ventaSeleccionada.toString());
        System.out.println("Motivo: " + motivo);

        // Aquí puedes añadir lógica para anular la venta en base de datos o lógica de
        // negocio

        // Cerrar ventana o actualizar tabla
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
