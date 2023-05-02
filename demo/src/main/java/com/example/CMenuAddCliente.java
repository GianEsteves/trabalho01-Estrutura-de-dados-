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

public class CMenuAddCliente {

    @FXML
    private Button cadastra;

    @FXML
    private Button limpaOsCampos;

    @FXML
    private TextField salvaCNH;

    @FXML
    private TextField salvaCPF;

    @FXML
    private TextField salvaNome;

    @FXML
    private TextField salvaTelefone;

    @FXML
    private Button voltar;

    @FXML
    void adicionaDliente() throws Exception {

        String cpf = salvaCPF.getText();
        String cnh = salvaCNH.getText();
        String telefone = salvaTelefone.getText();
        String nome = salvaNome.getText();

        // Cria um novo objeto NohCliente com as informações fornecidas
        // NohCliente novoNoh = new NohCliente(nome, 0, 0, 0)
        NohCliente novoNoh = new NohCliente(nome, cnh, telefone, cpf);
        LDECliente lc = new LDECliente(null, null);
        lc.adicionarNoCliente(novoNoh);
        lc.listarCliente();
        // limpar();

        // limparCampos(null);

        alertInterface("SUCESSO", "Cliente adicionado com sucesso!", Alert.AlertType.INFORMATION);
    }

    private void alertInterface(String string, String string2, AlertType information) {
        // System.out.print("foi");
    }

    @FXML
    void limpar() {
        salvaCPF.setText("");
        salvaCNH.setText("");
        salvaTelefone.setText("");
        salvaNome.setText("");
    }

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


}
