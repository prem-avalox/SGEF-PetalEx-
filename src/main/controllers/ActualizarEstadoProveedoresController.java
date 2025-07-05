package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ActualizarEstadoProveedoresController {

    @FXML
    private Label mensajeLabel;

    /**
     * Método para confirmar la actualización del estado.
     */
    @FXML
    private void confirmarActualizacion() {
        // Aquí colocarías la lógica para actualizar el estado del proveedor en la base de datos

        System.out.println("Estado del proveedor actualizado.");

        mostrarInfo("Actualización Exitosa", "El estado del proveedor ha sido actualizado correctamente.");

        cerrarVentana();
    }

    /**
     * Método para cerrar la ventana.
     */
    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        stage.close();
    }

    /**
     * Método opcional para establecer dinámicamente el nombre del proveedor en el mensaje.
     */
    public void setNombreProveedor(String nombreProveedor) {
        mensajeLabel.setText("¿Estás seguro que quieres actualizar el estado de " + nombreProveedor + "?");
    }

    /**
     * Muestra una alerta informativa.
     */
    private void mostrarInfo(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
