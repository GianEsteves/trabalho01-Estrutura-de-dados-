package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CMenuVeiculoEditar {

    @FXML
    private Button buscarPlaca;

    @FXML
    private Button editar;

    @FXML
    private TextField salvaAbuscadaPlaca;

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
    public void editarVeiculo() {
        String placaBuscada = salvaAbuscadaPlaca.getText();
        NohVeiculo nv = new NohVeiculo(placaBuscada, placaBuscada, placaBuscada, 0, 0, 0, 0);
        nv.getPlaca(buscarPlaca);
        if (nv != null) {
            // o veículo foi encontrado, permitir que o usuário edite as informações
            nv.setAno(Integer.parseInt(salvaAno.getText()));
            nv.setCategoria(salvaCategoria.getText());
            nv.setMarca(salvaMarca.getText());
            nv.setModelo(salvaModelo.getText());
            nv.setnLugares(Integer.parseInt(salvaNLugares.getText()));
            nv.setPotencia(Float.parseFloat(salvaPotencia.getText()));
            nv.setPlaca(salvaPlaca.getText());
            // exibir mensagem de sucesso
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Veículo editado");
            alert.setHeaderText(null);
            alert.setContentText("Veículo editado com sucesso.");
            alert.showAndWait();
        } else {
            // o veículo não foi encontrado
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Veículo não encontrado");
            alert.setHeaderText(null);
            alert.setContentText("Não foi encontrado nenhum veículo com a placa informada.");
            alert.showAndWait();
        }
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

    /**
     * 
     */
    @FXML
    public void buscarVeiculo2() {
        String placa = buscarPlaca.getText();
        NohVeiculo veiculoEncontrado = null;
        for(NohVeiculo v: placa) {
        if(v.getPlaca().equals(placa)) {
            veiculoEncontrado = v;
            break;
            }
        }
        if (veiculoEncontrado != null) {
            // exibe informações do veículo encontrado
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Veículo encontrado");
            alert.setHeaderText(null);
            alert.setContentText("Placa: " + veiculoEncontrado.getPlaca() + "\n" +
            "Marca: " + veiculoEncontrado.getMarca() + "\n" +
            "Modelo: " + veiculoEncontrado.getModelo() + "\n" +
            "Ano: " + veiculoEncontrado.getAno() + "\n" +
            "Categoria: " + veiculoEncontrado.getCategoria() + "\n" +
            "Número de lugares: " + veiculoEncontrado.getnLugares() + "\n" +
            "Potência: " + veiculoEncontrado.getPotencia() + " CV");
            alert.showAndWait();
        } else {
            // exibe mensagem de veículo não encontrado
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Veículo não encontrado");
            alert.setHeaderText(null);
            alert.setContentText("Não foi encontrado nenhum veículo com a placa informada.");
            alert.showAndWait();
        }
    }

}
