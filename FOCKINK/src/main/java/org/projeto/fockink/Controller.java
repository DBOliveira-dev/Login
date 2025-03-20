package org.projeto.fockink;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.image.*;

public class Controller {

    @FXML
    private TextField nameField;

    @FXML
    private TextField cpfField;

    @FXML
    private TextField idField;

    @FXML
    private ImageView imgFundo;

    @FXML
    public void initialize(){
    carregarImagem();
    }

    private void carregarImagem(){
        String imagemURL = "https://s2.glbimg.com/vvWFl2CSsamZkR2uCJxNinyAYg8=/780x440/e.glbimg.com/og/ed/f/original/2017/09/01/d8f292e1-e9e1-4b1c-b591-1f81d2fe638f.jpg";
        Image imagem = new Image(imagemURL, true);
        imgFundo.setImage(imagem);


    }

    @FXML
    private void handleSubmit() {
        String name = nameField.getText();
        String cpf = cpfField.getText();
        String id = idField.getText();

        // Aqui você pode processar os dados como desejar
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("ID: " + id);
    }
}