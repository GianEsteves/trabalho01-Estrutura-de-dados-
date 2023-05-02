package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CMenuClienteEditar {

    @FXML
    private Button buscaCPF;

    @FXML
    private Button editar;

    @FXML
    private TextField lerCPFParaBusca;

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
// precisa rever depois 
    @FXML
    void editarCliente() {
        Long cpf = Long.parseLong(salvaCPF.getText());
        // Encontra o cliente na lista pelo CPF
        LDECliente lc = new LDECliente(null, null);
        NohCliente atual = this.primeiro;
        while (atual != null) {
            if (atual.getCpf() == cpf) {
                // Atualiza os dados do cliente com os valores dos campos de texto
                atual.setNome(salvaNome.getText());
                atual.setCnh(Long.parseLong(salvaCNH.getText()));
                atual.setTelefone(Long.parseLong(salvaTelefone.getText()));
                break;
            }
            atual = atual.getProx();
        }
    
        limpar();
    }
    

    @FXML
    void limpar(){
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
    
        //CMenuPCliente controller = loader.getController();
        // fazer algo com o controlador, se necessário
    }

    

}
