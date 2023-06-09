package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CmenuInicial {

    @FXML
    private Button menuCategoria;

    @FXML
    private Button menuCliente;

    @FXML
    private Button menuLocacao;

    @FXML
    private Button menuVeiculo;
    
    @FXML
    public void abrirFXMLMPC() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPCliente.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMPV() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPVeiculo.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMPCa() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPCategoria.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMPL() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPLocacao.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }


}

