package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CMenuPCliente {

    @FXML
    private Button ListarClienteIF;

    @FXML
    private Button adicionarNoFim;

    @FXML
    private Button adicionarNoInicio;

    @FXML
    private Button editarCliente;

    @FXML
    private Button listarClienteFI;

    @FXML
    private Button removerCliente;

    @FXML
    public void abrirFXMLMaddI() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuAddCliente.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMaddF() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClienteaddF.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMaddExcluir() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClienteExcluir.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMaddEditar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClienteEditar.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    void listarFimInicioVeiculo(){
        //LDECliente lc new LDECliente(null, null);
        //lc.exibirClientes();
    }

    
    @FXML
    void listarClienteFI(){
        //LDECliente lc new LDECliente(null, null);
        //lc.listarCliente();
    }
}
