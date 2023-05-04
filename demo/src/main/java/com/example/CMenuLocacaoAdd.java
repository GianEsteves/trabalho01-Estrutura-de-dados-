package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CMenuLocacaoAdd {

    @FXML
    private Button alocar;

    @FXML
    private Button voltar;

    @FXML
    private TextField salvaCPF;

    @FXML
    private TextField salvaPlaca;

    @FXML
    void abrirFXMLIinicial() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPrincipal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        // CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    @FXML
    void addLocacao() {

        String cpf = salvaCPF.getText();
        String placa = salvaPlaca.getText();

        NohLocacao nl = new NohLocacao(null);
        LDELocacao ll = new LDELocacao(null, null);
        ll.alocarVeiculoCliente(null, null);

        // Exibir uma mensagem de sucesso
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso!");
        alert.setContentText("Veículo adicionado com sucesso!");
        alert.showAndWait();

    }

    @FXML
    public void adicionarLocacao(ActionEvent event) {
        // obter informações preenchidas pelo usuário
    
        String placa = salvaPlaca.getText();
        String cpf = salvaCPF.getText();

        // criar objeto Locacao com as informações
        LDELocacao locacao = new LDELocacao(null, null);
        locacao.alocarVeiculoCliente(cpf, placa);

        // adicionar locação à lista
        locacao.adicionarNoLocacao(locacao);

        // limpar campos do formulário

        l();
    }

    @FXML
    void l(){
        salvaPlaca.setText("");
        salvaCPF.setText("");
    }

}
