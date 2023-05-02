package com.example;

public class NohCliente {
    private NohCliente proximo;
    private NohCliente anterior;
    protected String nome;
    protected long cnh;
    protected long telefone;
    protected long cpf;
    private NohCliente info;
    
    public NohCliente(String nome, long cnh, long telefone, long cpf) {
        this.nome = nome;
        this.cnh = cnh;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void setProx(NohCliente n) { this.proximo = n; }

    public void setAnt(NohCliente n) { this.anterior = n; }
    
    public NohCliente getInfo() {
        return this.info;
    }
    public NohCliente getProx() {
        return this.proximo;
    }
    public NohCliente getAnt() {
        return this.anterior;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnh() {
        return cnh;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

}
