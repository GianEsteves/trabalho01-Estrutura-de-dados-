package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
    
    
}
