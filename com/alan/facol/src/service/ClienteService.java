package com.alan.facol.src.service;

import com.alan.facol.src.domain.Cliente;
import com.alan.facol.src.interfaces.IClienteOperacoes;
import com.alan.facol.src.repository.ClienteRepository;

public class ClienteService implements IClienteOperacoes {

    ClienteRepository clientesRepository = new ClienteRepository();

    @Override
    public void adicionar(Cliente c) {
        if (!this.verificar(c.getId())) {
            clientesRepository.adicionar(c);
        }
    }
    @Override
    public void alterar(Cliente c) {
        if (this.verificar(c.getId())){
            clientesRepository.alterar(c);
        }
    }
    @Override
    public void remover(int id) {
        if (this.verificar(id)){
            clientesRepository.remover(id);
        }
    }

    @Override
    public Cliente pesquisar(int id) {
        if (this.verificar(id)){
            clientesRepository.pesquisar(id);
        }
        return null;
    }

    @Override
    public boolean verificar(int id) {
        return clientesRepository.verificar(id);
    }
}
