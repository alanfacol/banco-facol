package com.alan.facol.src.service;

import com.alan.facol.src.domain.Conta;
import com.alan.facol.src.interfaces.IContaOperacoes;
import com.alan.facol.src.repository.ContaRepository;

public class ContaService implements IContaOperacoes {

    ContaRepository contasRepository = new ContaRepository();

    @Override
    public void adicionar(Conta c) {
        if (! this.verificar(c.getId())){
            contasRepository.adicionar(c);
        }
    }

    @Override
    public void alterar(Conta c) {
        if (this.verificar(c.getId())){
            contasRepository.alterar(c);
        }
    }

    @Override
    public void remover(int id) {
        if (this.verificar(id)){
            contasRepository.remover(id);
        }
    }

    @Override
    public Conta pesquisar(int id) {
        if (this.verificar(id)){
            return contasRepository.pesquisar(id);
        }
        return null;
    }

    public boolean verificar(int id){
       return contasRepository.verificar(id);
    }
}
