package com.alan.facol.src.interfaces;

import com.alan.facol.src.domain.Funcionario;

public interface IFuncionarioOperacoes {

    public abstract void adicionar(Funcionario f);

    public abstract void alterar(Funcionario f);

    public abstract void remover(int id);
    public abstract Funcionario pesquisar (int id);
    public abstract boolean verificar(int id);
}
