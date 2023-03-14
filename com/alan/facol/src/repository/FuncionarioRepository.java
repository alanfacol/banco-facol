package com.alan.facol.src.repository;

import com.alan.facol.src.domain.Funcionario;
import com.alan.facol.src.interfaces.IFuncionarioOperacoes;

import java.util.ArrayList;

public class FuncionarioRepository implements IFuncionarioOperacoes {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    @Override
    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }

    @Override
    public void alterar(Funcionario f) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == f.getId()){
                funcionarios.set(i, f);
            }
        }
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < funcionarios.size() ; i++) {
            if (funcionarios.get(i).getId() == id){
                funcionarios.get(i).setAtivo(false);
            }
        }

    }

    @Override
    public Funcionario pesquisar(int id) {
        for (int i = 0; i < funcionarios.size() ; i++) {
            if (funcionarios.get(i).getId() == id) {
                return funcionarios.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean verificar(int id) {
        for (Funcionario f : funcionarios){
            if (f.getId() == id){
                return true;
            }
        }
        return false;
    }

}
