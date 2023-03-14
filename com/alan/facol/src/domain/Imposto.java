package com.alan.facol.src.domain;

import java.math.BigDecimal;

public class Imposto extends Conta{

    private int id;
    private String descricao;
    private double juros;

    public Imposto(){}

    public Imposto(int id, String descricao, double juros) {
        this.id = id;
        this.descricao = descricao;
        this.juros = juros;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
