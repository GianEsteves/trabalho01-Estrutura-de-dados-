package com.example;

public class LDELocacao implements ILDELocacao {
    private NohLocacao primeiro;
    private NohLocacao ultimo;

    public LDELocacao(NohLocacao primeiro, NohLocacao ultimo) {
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }

    public LDELocacao(NohCliente cliente, NohVeiculo veiculo) {
        
    }

    @Override
    public void adicionarNoLocacao(NohLocacao novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }

    }

    @Override
    public void adicionarLocacaoInicio(NohLocacao novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.primeiro;
            this.primeiro = novoNoh;
            this.primeiro = novoNoh;
        }
    }

    @Override
    public void adicionarLocacaoFim(NohLocacao novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void alocarVeiculoCliente(NohCliente cliente, NohVeiculo veiculo) {
        LDELocacao locacao = new LDELocacao(cliente, veiculo);
        NohLocacao novoNoh = new NohLocacao(locacao);
        adicionarNoLocacao(novoNoh);
        System.out.println("Veículo alocado com sucesso para o cliente " + cliente.getNome() + "!");
    }

    /*
     * @Override
     * public void excluirLocacao() {
     * NohLocaçao noAtual = this.inicio; // começa a percorrer a lista pelo início
     * 
     * while (noAtual != null) {
     * NohLocacao nohLocacao = noAtual.getLocacao();
     * 
     * if (locacao.getVeiculo().getPlaca() == (placa)) { // encontra o nó que contém
     * a locação com a placa do veículo desejado
     * if (noAtual == lista.getInicio()) { // se o nó a ser excluído é o primeiro
     * lista.setInicio(noAtual.getProximo()); // define o próximo nó como o início
     * da lista
     * } else if (noAtual == lista.getFim()) { // se o nó a ser excluído é o último
     * lista.setFim(noAtual.getAnterior()); // define o nó anterior como o fim da
     * lista
     * } else { // se o nó a ser excluído está no meio da lista
     * noAtual.getAnterior().setProximo(noAtual.getProximo()); // define o próximo
     * nó do nó anterior como o próximo nó do nó atual
     * noAtual.getProximo().setAnterior(noAtual.getAnterior()); // define o nó
     * anterior do próximo nó como o nó anterior do nó atual
     * }
     * break; // sai do loop após a exclusão ser realizada
     * }
     * 
     * noAtual = noAtual.getProximo(); // avança para o próximo nó
     * }
     * }
     */
    @Override
    public void excluirLocacao(NohVeiculo placaVeiculo) {/* throws NullPointerException, IllegalArgumentException { */
        NohLocacao atual = this.primeiro;
        while (atual != null) {
            if (atual.getPlacaVeiculo() == (placaVeiculo)) {
                if (atual == primeiro) {
                    primeiro = atual.getProx();
                    if (primeiro != null) {
                        primeiro.setAnt(null);
                    } else {
                        ultimo = null;
                    }
                } else if (atual == ultimo) {
                    ultimo = atual.getAnt();
                    ultimo.setProx(null);
                } else {
                    atual.getAnt().setProx(atual.getProx());
                    atual.getProx().setAnt(atual.getAnt());
                }
                break;
            }
            atual = atual.getProx();
        }
        if (atual == null) {
            System.out.println("Locação excluida com sucesso!");
        }
        /*
         * if (atual == null) {
         * throw new IllegalArgumentException("Carro não identificado em uma locação");
         * }
         */
    }

    /*
     * public void excluirLocacao(String placa) {
     * try {
     * NohLocacao noAtual = this.primeiro; // começa a percorrer a lista pelo início
     * 
     * while (noAtual != null) {
     * NohLocacao locacao = noAtual.getnohLocacao();
     * 
     * if (nohlocacao.getnohVeiculo().getPlaca().equals(placa)) { // encontra o nó
     * que contém a locação com a placa do veículo desejado
     * if (noAtual == this.primeiro) { // se o nó a ser excluído é o primeiro
     * this.primeiro = noAtual.getProx(); // define o próximo nó como o início da
     * lista
     * } else if (noAtual == this.ultimo) { // se o nó a ser excluído é o último
     * this.ultimo = noAtual.getAnt(); // define o nó anterior como o fim da lista
     * } else { // se o nó a ser excluído está no meio da lista
     * noAtual.getAnt().setProx(noAtual.getProx()); // define o próximo nó do nó
     * anterior como o próximo nó do nó atual
     * noAtual.getProx().setAnt(noAtual.getAnt()); // define o nó anterior do
     * próximo nó como o nó anterior do nó atual
     * }
     * break; // sai do loop após a exclusão ser realizada
     * }
     * 
     * noAtual = noAtual.getProx(); // avança para o próximo nó
     * }
     * } catch (NullPointerException e) {
     * System.out.println("Erro de ponteiro nulo: " + e.getMessage());
     * } catch (Exception e) {
     * System.out.println("Erro ao excluir locação: " + e.getMessage());
     * } finally {
     * // liberar recursos, se necessário
     * }
     * }
     */
    @Override
    public void visualizarLocacoes() {
        NohLocacao atual = this.primeiro;
        if (atual == null) {
            System.out.println("Não há locações cadastradas.");
        } else {
            while (atual != null) {
                System.out.println("-----");
                System.out.println(
                        "Veículo: " + atual.getPlacaVeiculo());
                System.out
                        .println("Cliente: " + atual.getCnh().getNome());
                System.out.println("Data de início: " + atual.getDataRetirada());
                System.out.println("Data de fim: " + atual.getDataDevolucao());
                System.out.println("Valor total: " + atual.getValor());
                atual = atual.getProx();
            }
        }
    }

    @Override
    public void listarInicioFimLocacao(NohLocacao novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.primeiro;
            this.primeiro = novoNoh;
            this.primeiro = novoNoh;
        }
    }

    @Override
    public void listarFimInicioLocacao(NohLocacao novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }
}
