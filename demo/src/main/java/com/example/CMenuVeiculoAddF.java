package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CMenuVeiculoAddF {

    @FXML
    private Button cadastrar;

    @FXML
    private Button limpar;

    @FXML
    private TextField salvaAno;

    @FXML
    private TextField salvaCategoria;

    @FXML
    private TextField salvaMarca;

    @FXML
    private TextField salvaModelo;

    @FXML
    private TextField salvaNLugares;

    @FXML
    private TextField salvaPlaca;

    @FXML
    private TextField salvaPotencia;

    @FXML
    private Button voltar;

    @FXML
    private void adicionarVeiculo() {
        try {
            // Ler os dados dos campos da interface
            String placa = salvaPlaca.getText();
            String modelo = salvaModelo.getText();
            String marca = salvaMarca.getText();
            int ano = Integer.parseInt(salvaAno.getText());
            double potencia = Double.parseDouble(salvaPotencia.getText());
            int nLugares = Integer.parseInt(salvaNLugares.getText());

            // Criar uma nova instância de NohVeiculo com os dados lidos
            NohVeiculo novoVeiculo = new NohVeiculo(placa, modelo, marca, ano, potencia, nLugares, 1);

            // Adicionar o novo veículo à lista de veículos
            LDEVeiculo lv = new LDEVeiculo();
            lv.adicionarNohVeiculF(novoVeiculo);
            //lv.imprimirNohVeiculo();

            // Exibir uma mensagem de sucesso
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sucesso!");
            alert.setContentText("Veículo adicionado com sucesso!");
            alert.showAndWait();

            lmpar();


        } catch (NumberFormatException e) {
            // Exibir uma mensagem de erro caso ocorra uma exceção ao tentar converter os valores dos campos da interface
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Por favor, preencha todos os campos corretamente.");
            alert.showAndWait();
            
        }
    }

    @FXML 
    void lmpar(){
                    // Limpar os campos da interface
            salvaPlaca.setText("");
            salvaModelo.setText("");
            salvaMarca.setText("");
            salvaAno.setText("");
            salvaPotencia.setText("");
            salvaNLugares.setText("");
    }

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

}
