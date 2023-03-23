package com.alan.facol.src.controller;

import com.alan.facol.src.domain.Funcionario;
import com.alan.facol.src.enums.TipoFuncionario;
import com.alan.facol.src.mock.FuncionarioMock;

import java.util.List;

public class FuncionarioController {

    public FuncionarioController() {

    }

    public static List<Funcionario> listarGerentes() {

        List<Funcionario> funcionarios = FuncionarioMock.listarFuncionarios();

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getTipo() != TipoFuncionario.GERENTE){
                funcionarios.remove(funcionarios.get(i));
            }
        }
        return funcionarios;
    }

    public static List<Funcionario> listarOperadores(){
        List<Funcionario> funcionarios = FuncionarioMock.listarFuncionarios();

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getTipo() != TipoFuncionario.OPERADOR){
                funcionarios.remove(funcionarios.get(i));
            }
        }
        return funcionarios;
    }
}
