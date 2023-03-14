package com.alan.facol.src.enums;

public enum TipoFuncionario {

    OPERADOR(1), GERENTE(2);

    private final int tipo;
    TipoFuncionario(int i) {
        this.tipo = i;
    }

    public int getTipo(){
        return this.tipo;
    }
}
