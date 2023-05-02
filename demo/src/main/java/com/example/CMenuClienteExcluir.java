package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CMenuClienteExcluir {

    @FXML
    private AnchorPane excluir;

    @FXML
    private TextField pesquisaCPF;

    private LDECliente listaClientes;

    @FXML
    void excluirCliente() {
        listaClientes = new LDECliente(null, null);
        Long cpf = Long.parseLong(pesquisaCPF.getText());
        listaClientes.excluirCliente(cpf);
        limpar();
    }
    

    @FXML
    void limpar(){
        pesquisaCPF.setText("");
    }
    

}
