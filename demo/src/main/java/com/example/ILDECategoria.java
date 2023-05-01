package com.example;

public interface ILDECategoria {

    void adicionarNohCategoria(NohCategoria novoNoh);

    void imprimirNohCategoria();

    void lerCsv();

    void listarInicioFimCategoria();

    void listarFimInicioCategoria();

    void editarCategoria(int codCategoria);

    void excluirCategoria(int codCategoria);
    /*
     * public Categoria excluirCategoria(String nomeCategoria) throws Exception {
     * Categoria categoriaAtual = primeiraCategoria;
     * 
     * // Procura pela categoria a ser excluída
     * while (categoriaAtual != null &&
     * !categoriaAtual.getNome().equals(nomeCategoria)) {
     * categoriaAtual = categoriaAtual.getProxima();
     * }
     * 
     * // Verifica se a categoria existe na lista encadeada
     * if (categoriaAtual == null) {
     * throw new Exception("Categoria não encontrada");
     * }
     * 
     * // Verifica se existem veículos atrelados à categoria
     * Veiculo veiculoAtual = primeiroVeiculo;
     * while (veiculoAtual != null) {
     * if (veiculoAtual.getCategoria().equals(categoriaAtual)) {
     * throw new Exception("Existem veículos atrelados à categoria " +
     * nomeCategoria);
     * }
     * veiculoAtual = veiculoAtual.getProximo();
     * }
     * 
     * // Atualiza os ponteiros da lista encadeada
     * if (categoriaAtual == primeiraCategoria) {
     * primeiraCategoria = categoriaAtual.getProxima();
     * } else {
     * Categoria categoriaAnterior = primeiraCategoria;
     * while (categoriaAnterior.getProxima() != categoriaAtual) {
     * categoriaAnterior = categoriaAnterior.getProxima();
     * }
     * categoriaAnterior.setProxima(categoriaAtual.getProxima());
     * }
     * 
     * // Limpa os ponteiros da categoria excluída e retorna ela
     * categoriaAtual.setProxima(null);
     * return categoriaAtual;
     * }
     */

}