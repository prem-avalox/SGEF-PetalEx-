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
 
    }

    @FXML
    private void confirmarActualizacion() {
      
    }

    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        stage.close();
    }
}
