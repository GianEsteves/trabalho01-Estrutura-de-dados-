package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CMenuPLocacao {

    @FXML
    private Button addLLocacao;

    @FXML
    private Button excluirLocacao;

    @FXML
    private Button listarLocacao;

    @FXML
    public void abrirFXMLMadd() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuLocacaoAdd.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMRemove() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuLocacaoRemove.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

}
