package com.example;

public interface ILDEVeiculo {

    void adicionarNohVeiculo(NohVeiculo novoNoh);

    void imprimirNohVeiculo();

    void lerCsv();

    /*void listarVeiculo();*/

    void listarInicioFimVeiculo();

    void listarFimInicioVeiculo();

    void editarVeiculo(String placa);

    void excluirVeiculo(String placa);

}