package com.alan.facol.src.domain;

import java.math.BigDecimal;

public class Bonificacao {

    private int id;
    private String descricao;
    private double percentual;

    public Bonificacao() {
    }

     public Bonificacao(int id, String descricao, double percentual){
        this.id = id;
        this.descricao = descricao;
        this.percentual = percentual;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
}
