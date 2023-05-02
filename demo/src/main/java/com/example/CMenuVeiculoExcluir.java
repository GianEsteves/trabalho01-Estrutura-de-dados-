package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CMenuVeiculoExcluir {

    @FXML
    private Button buscarPlaca;

    @FXML
    private Button excluir;

    @FXML
    private TextField salvaAbuscadaPlaca;

    @FXML
    private Button voltar;

    private LDEVeiculo listaVeiculo;

    @FXML
    void abrirFXMLIinicial() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPrincipal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    void excluir(){
        listaVeiculo = new LDEVeiculo();
        String placa = (buscarPlaca.getText());
        listaVeiculo.excluirVeiculo(placa);
        //limpar();
        listaVeiculo.imprimirNohVeiculo();
    }
}
