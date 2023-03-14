package com.alan.facol.src.service;

import com.alan.facol.src.domain.Funcionario;
import com.alan.facol.src.interfaces.IFuncionarioOperacoes;
import com.alan.facol.src.repository.FuncionarioRepository;

public class FuncionarioService implements IFuncionarioOperacoes {

    FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
    @Override
    public void adicionar(Funcionario f) {
        if (!this.verificar(f.getId())){
            funcionarioRepository.adicionar(f);
        }
    }

    @Override
    public void alterar(Funcionario f) {
        if (this.verificar(f.getId())){
            funcionarioRepository.alterar(f);
        }
    }

    @Override
    public void remover(int id) {
        if (this.verificar(id)){
            funcionarioRepository.remover(id);
        }
    }

    @Override
    public Funcionario pesquisar(int id) {
        if (this.verificar(id)){
            funcionarioRepository.pesquisar(id);
        }
        return null;
    }

    @Override
    public boolean verificar(int id) {
        return funcionarioRepository.verificar(id);
    }

}
