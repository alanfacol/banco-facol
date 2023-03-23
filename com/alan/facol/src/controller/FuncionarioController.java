package com.alan.facol.src.controller;

import com.alan.facol.src.domain.Funcionario;
import com.alan.facol.src.enums.TipoFuncionario;
import com.alan.facol.src.mock.FuncionarioMock;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    public FuncionarioController() {

    }

    public static List<Funcionario> listarTodos(){
        return FuncionarioMock.listarFuncionarios();
    }

    public List<Funcionario> listarGerentes() {

        List<Funcionario> funcionarios = FuncionarioMock.listarFuncionarios();
        List<Funcionario> listFuncionarios = new ArrayList<>();

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getTipo() == TipoFuncionario.GERENTE){
                listFuncionarios.add(funcionarios.get(i));
            }
        }
        return listFuncionarios;
    }

    public List<Funcionario> listarOperadores(){
        List<Funcionario> funcionarios = FuncionarioMock.listarFuncionarios();
        List<Funcionario> listFuncionarios = new ArrayList<>();

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getTipo() == TipoFuncionario.OPERADOR){
                listFuncionarios.add(funcionarios.get(i));
            }
        }
        return listFuncionarios;
    }
}
