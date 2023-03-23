package com.alan.facol.src.mock;

import com.alan.facol.src.domain.Bonificacao;
import com.alan.facol.src.domain.Funcionario;
import com.alan.facol.src.domain.Gerente;
import com.alan.facol.src.domain.Operador;
import com.alan.facol.src.enums.OpcoesSexo;
import com.alan.facol.src.enums.TipoFuncionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioMock {

    public FuncionarioMock(){

    }

    public static List<Funcionario> listarFuncionarios(){

        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario func = new Operador();
        func.setId(1);
        func.setNome("Alan");
        func.setCpf("22222222222");
        func.setDtNascimento(LocalDateTime.of(LocalDate.of(1998, 3, 20), LocalTime.of(0, 0)));
        func.setSexo(OpcoesSexo.MASCULINO);
        func.setTipo(TipoFuncionario.OPERADOR);
        func.setSalario(BigDecimal.valueOf(1200.00));
        func.setBonificacao(new Bonificacao(1, "Bonificação por Operador", 0.2));
        func.setAtivo(true);

        Funcionario gerente = new Gerente();
        gerente.setId(2);
        gerente.setNome("Ronaldo");
        gerente.setCpf("33333333333");
        gerente.setDtNascimento(LocalDateTime.of(LocalDate.of(1986, 7, 11), LocalTime.of(0, 0)));
        gerente.setSexo(OpcoesSexo.MASCULINO);
        gerente.setTipo(TipoFuncionario.GERENTE);
        gerente.setSalario(BigDecimal.valueOf(2300.00));
        gerente.setBonificacao(new Bonificacao(1, "Bonificacao por Gerente", 0.35));
        gerente.setAtivo(true);

        funcionarios.add(func);
        funcionarios.add(gerente);

        return funcionarios;

    }
}
