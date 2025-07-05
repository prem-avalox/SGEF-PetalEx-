package main.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class ConsultarVentasController {

    @FXML
    private TableView<String> tablaVentas;  // Cambia String por tu clase Venta cuando la tengas

    @FXML
    public void buscarVenta(ActionEvent event) {
        System.out.println("Buscar venta ejecutado");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Buscar Venta");
        alert.setHeaderText(null);
        alert.setContentText("Funcionalidad de búsqueda aún no implementada");
        alert.showAndWait();
    }

    @FXML
    public void cargarVentas() {
        ObservableList<String> ventas = FXCollections.observableArrayList(
                "Venta 1", "Venta 2", "Venta 3");
        tablaVentas.setItems(ventas);
        System.out.println("Ventas cargadas: " + ventas.size());
    }

    @FXML
    public void seleccionarVenta(ActionEvent event) {
        System.out.println("Venta seleccionada");
        // Agrega lógica aquí si quieres manejar selección
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
