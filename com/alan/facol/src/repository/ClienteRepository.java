package com.alan.facol.src.repository;

import com.alan.facol.src.domain.Cliente;
import com.alan.facol.src.interfaces.IClienteOperacoes;

import java.util.ArrayList;

public class ClienteRepository implements IClienteOperacoes {

    ArrayList<Cliente> clientes = new ArrayList<>();
    @Override
    public void adicionar(Cliente c) {
        clientes.add(c);
    }

    @Override
    public void alterar(Cliente c) {
        for (int i = 0; i < clientes.size() ; i++) {
            if (clientes.get(i).getId() == c.getId()){
                clientes.set(i, c);
            }
        }
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < clientes.size() ; i++) {
            if (clientes.get(i).getId() == id){
                clientes.get(i).setAtivo(false);
            }
        }
    }

    @Override
    public Cliente pesquisar(int id) {
        for (int i = 0; i < clientes.size() ; i++) {
            if (clientes.get(i).getId() == id){
                return clientes.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean verificar(int id) {
        return false;
    }
}
