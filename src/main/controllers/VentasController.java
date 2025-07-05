package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class VentasController {

    @FXML
    private TextField ordenField, fechaField, codigoField,
            nombreProdField, precioField, cantidadField,
            pagoField, estadoField, usuarioField,
            subtotalField, ivaField, totalField;

    @FXML
    private TableView<?> tablaVentas;

    @FXML
    private void volverMenu(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/views/Main.fxml"));
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Sistema de Gestión de Exportación de Flores - SGEF");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error al regresar al menú");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
    @FXML
   public void abrirRegistrarVenta(ActionEvent event) {
        abrirVentana("/main/views/RegistrarVentas.fxml", "Registrar Venta");
    }
    @FXML
    public void abrirConsultarVenta(ActionEvent event) {
        abrirVentana("/main/views/ConsultarVentas.fxml", "Consultar Venta");
    }
    @FXML
    public void abrirActualizarVenta(ActionEvent event) {
        abrirVentana("/main/views/ActualizarVentas.fxml", "Actualizar Venta");
    }
    @FXML
    public void anularVenta(ActionEvent event) {
        abrirVentana("/main/views/AnularVentas.fxml", "Anular Venta");
    }
    @FXML
    private void abrirVentana(String ruta, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
