package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CMenuPVeiculo {

    @FXML
    private Button ExcluirVeiculo;

    @FXML
    private Button cadastrarNoFim;

    @FXML
    private Button cadastrarNoInicio;

    @FXML
    private Button editarVeiculo;

    @FXML
    private Button listarVeiculoDoFimAoInicio;

    @FXML
    private Button listarVeiculoDoInicioAoFim;

    @FXML
    public void abrirFXMLMCadastrarI() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuVeiculoAdd.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMCadastrarF() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuVeiculoAddF.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMEditar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuVeiculoEditar.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    public void abrirFXMLMExcluirr() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuVeiculoExcluir.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    void listarVeiculoDoInicioAoFim(){
        LDEVeiculo lv = new LDEVeiculo();
        //lv.imprimirNohVeiculo();
        lv.listarInicioFimVeiculo();

    }

    @FXML
    void listarVeiculoDoFimAoInicio(){
        LDEVeiculo lv = new LDEVeiculo();
        //lv.imprimirNohVeiculo();
        lv.listarFimInicioVeiculo();

    }

}
