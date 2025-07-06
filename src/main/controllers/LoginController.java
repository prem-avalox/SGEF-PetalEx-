package main.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usuarioField;
    @FXML
    private PasswordField contrasenaField;
    @FXML
    private Label errorLabel;

    @FXML
    private void handleLogin() {
        String usuario = usuarioField.getText().trim();
        String contrasena = contrasenaField.getText().trim();

        if (usuario.equals("admin") && contrasena.equals("admin##")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/views/Main.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) usuarioField.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("Sistema de Gestión de Exportación de Flores - SGEF");
                stage.centerOnScreen(); // ✅ CENTRAR LA VENTANA

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            errorLabel.setVisible(true);
        }
    }

}
