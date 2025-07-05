package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ActualizarEstadoInventarioController {

    @FXML
    private Label mensajeLabel;

    private String nombreProducto;

    // Método para recibir el nombre del producto y actualizar el mensaje en la vista
    public void setNombreProducto(String nombre) {
        this.nombreProducto = nombre;
        mensajeLabel.setText("¿Estás seguro que quieres actualizar el estado del producto " + nombreProducto + "?");
    }

    @FXML
    private void confirmarActualizacion() {
        // Aquí iría la lógica real para actualizar el estado del producto
        System.out.println("Estado del producto '" + nombreProducto + "' actualizado.");

        // Cierra la ventana después de actualizar
        cerrarVentana();
    }

    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        stage.close();
    }
}
