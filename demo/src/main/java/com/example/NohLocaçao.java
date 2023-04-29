package com.example;

import java.util.Date;

public class NohLocaçao {
    private NohLocaçao proximo;
    private NohLocaçao anterior;
    private double valor;
    private Date dataRetirada;
    private Date dataDevolucao;
    private NohCliente nohCliente;
    private NohVeiculo nohVeiculo;
    private NohLocaçao info;
    
    
    public NohLocaçao(double valor, Date dataRetirada, Date dataDevolucao) {
        this.valor = valor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }


    public NohLocaçao(LDELocaçao locacao) {
    }


    public NohLocaçao getProx() {
        return proximo;
    }


    public void setProx(NohLocaçao proximo) {
        this.proximo = proximo;
    }


    public NohLocaçao getAnt() {
        return anterior;
    }


    public void setAnt(NohLocaçao anterior) {
        this.anterior = anterior;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public Date getDataRetirada() {
        return dataRetirada;
    }


    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }


    public Date getDataDevolucao() {
        return dataDevolucao;
    }


    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    public NohCliente getNohCliente() {
        return nohCliente;
    }

    public NohVeiculo getNohVeiculo() {
        return nohVeiculo;
    }


    public void setNohCliente(NohCliente nohCliente) {
        this.nohCliente = nohCliente;
    }


    public NohLocaçao getInfo() {
        return info;
    }


    public void setInfo(NohLocaçao info) {
        this.info = info;
    }

    

    
}
