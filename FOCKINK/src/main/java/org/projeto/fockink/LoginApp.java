package org.projeto.fockink;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // A linha abaixo agora usa o caminho absoluto correto, considerando a pasta resources
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/projeto/fockink/login.fxml")));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
