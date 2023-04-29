package com.example;

public interface ILDECliente {

    void adicionarNoCliente(NohCliente novoNoh);

    void exibirClientes();

    void listarCliente();

    void editarCliente(Long cpf);

    void excluirCliente(Long cpf);

}