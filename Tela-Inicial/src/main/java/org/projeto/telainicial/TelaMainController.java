package org.projeto.telainicial;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class TelaMainController {

    @FXML
    private Button signInButton;

    @FXML
    private Button registerButton;

    @FXML
    private Button contactButton;

    @FXML
    public void initialize() {
        signInButton.setOnAction(event -> showMessage("Login", "Você clicou em Sign In!"));
        registerButton.setOnAction(event -> showMessage("Registro", "Você clicou em Registrar!"));
        contactButton.setOnAction(event -> showMessage("Contato", "Você clicou em Contato!"));
    }

    private void showMessage(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
