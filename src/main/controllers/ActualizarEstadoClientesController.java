package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ActualizarEstadoClientesController {

    @FXML
    private Label mensajeLabel;

    // Método para cerrar la ventana (botón "No")
    @FXML
    private void cerrarVentana(ActionEvent event) {
        // Obtener la ventana actual y cerrarla
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        stage.close();
    }

    // Método para confirmar actualización (botón "Sí")
    @FXML
    private void confirmarActualizacion(ActionEvent event) {
        // Aquí pones la lógica para actualizar el estado del cliente

        // Ejemplo simple: cerrar ventana después de confirmar
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        stage.close();

        // Puedes agregar notificaciones, actualizaciones a la BD, etc.
    }

    // Método para actualizar el texto del Label con el nombre del cliente dinámicamente
    public void setNombreCliente(String nombre) {
        mensajeLabel.setText("¿Estás seguro que quieres actualizar el estado de " + nombre + "?");
    }
}
