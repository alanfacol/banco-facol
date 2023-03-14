package com.alan.facol.src.interfaces;


import com.alan.facol.src.domain.Cliente;

public interface IClienteOperacoes {

    public abstract void adicionar(Cliente c);

    public abstract void alterar(Cliente c);

    public abstract void remover(int id);
    public abstract Cliente pesquisar(int id);
    public abstract boolean verificar(int id);
}
