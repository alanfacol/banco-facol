package com.alan.facol.src.enums;

public enum OpcoesSexo {

    FEMININO(1), MASCULINO(2);

    private final int sexo;
    OpcoesSexo(int i) {
        this.sexo = i;
    }

    public int getSexo(){
        return this.sexo;
    }
}
