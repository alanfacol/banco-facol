package com.alan.facol.src.interfaces;

import com.alan.facol.src.domain.Conta;

public interface IContaOperacoes {
    public abstract void adicionar(Conta c);

    public abstract void alterar(Conta c);

    public abstract void remover(int id);

    public abstract Conta pesquisar(int id);

}
