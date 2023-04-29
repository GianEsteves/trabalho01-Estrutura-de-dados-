package com.example;

public interface ILDECategoria {

    void adicionarNohCategoria(NohCategoria novoNoh);

    void imprimirNohCategoria();

    void lerCsv();

    void listarInicioFimCategoria();

    void listarFimInicioCategoria();

    void editarCategoria(int codCategoria);

    void excluirCategoria(int codCategoria);

}