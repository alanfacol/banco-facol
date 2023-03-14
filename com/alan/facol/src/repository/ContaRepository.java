package com.alan.facol.src.repository;

import com.alan.facol.src.domain.Conta;
import com.alan.facol.src.interfaces.IContaOperacoes;

import java.util.ArrayList;

public class ContaRepository implements IContaOperacoes {

    ArrayList<Conta> contas = new ArrayList<>();

    @Override
    public void adicionar(Conta c) {
        contas.add(c);
    }

    @Override
    public void alterar(Conta c) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getId() == c.getId()){
                contas.set(i, c);
            }
        }
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getId() == id){
                contas.get(i).setAberta(false);
            }
        }
    }

    @Override
    public Conta pesquisar(int id) {
        for (int i = 0; i < contas.size() ; i++) {
            if (contas.get(i).getId() == id){
                return contas.get(i);
            }
        }
        return null;
    }

    public boolean verificar(int id){
        for (Conta c : contas) {
            if (c.getId() == id){
                return true;
            }
        }
        return false;
    }
}
