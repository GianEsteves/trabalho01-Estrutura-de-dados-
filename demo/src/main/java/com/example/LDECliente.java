package com.example;

public class LDECliente implements ILDECliente {
    private NohCliente primeiro;
    private NohCliente ultimo;

    public LDECliente(NohCliente primeiro, NohCliente ultimo) {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNoCliente(NohCliente novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void adicionarNoClienteF(NohCliente novoNoh) {
        if (this.ultimo == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setAnt(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void exibirClientes() {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }
    }

    @Override
    public void listarCliente() {
        NohCliente atual = this.ultimo;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }

    }

    @Override
    public void editarCliente(Long cpf) {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            if (atual.getCpf()==(cpf)) {
                atual.setNome(null);
                atual.setCnh(0);
                atual.setTelefone(0);
                break;
            }
            atual = atual.getProx();
        }

    }

    @Override
    public void excluirCliente(Long cpf) {
        NohCliente atual = this.primeiro;
    while (atual != null) {
        if (atual.getCpf()==(cpf)) {
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
}
/*public void excluirCliente(Cliente cliente) {
    // Verifica se o cliente está atrelado a uma locação
    for (Locacao locacao : listaLocacoes) {
        if (locacao.getCliente() == cliente) {
            System.out.println("Não é possível excluir o cliente " + cliente.getNome() + " pois está atrelado a uma locação.");
            return;
        }
    }
    
    // Remove o cliente da lista
    NoListaDupla atual = primeiro;
    while (atual != null) {
        if (atual.getCliente() == cliente) {
            if (atual == primeiro) {
                primeiro = atual.getProximo();
            } else {
                atual.getAnterior().setProximo(atual.getProximo());
            }
            if (atual == ultimo) {
                ultimo = atual.getAnterior();
            } else {
                atual.getProximo().setAnterior(atual.getAnterior());
            }
            System.out.println("O cliente " + cliente.getNome() + " foi excluído com sucesso.");
            return;
        }
        atual = atual.getProximo();
    }
    System.out.println("O cliente " + cliente.getNome() + " não foi encontrado na lista.");
}
 */

}

// outros métodos da lista (ex: remover, buscar, etc.)