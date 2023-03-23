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
        Funcionario[] arrayFuncionarios = new Funcionario[3];

        arrayFuncionarios[0] = new Operador();
        arrayFuncionarios[0].setId(1);
        arrayFuncionarios[0].setNome("Alan");
        arrayFuncionarios[0].setCpf("22222222222");
        arrayFuncionarios[0].setDtNascimento(LocalDateTime.of(LocalDate.of(1998, 3, 20), LocalTime.of(0, 0)));
        arrayFuncionarios[0].setSexo(OpcoesSexo.MASCULINO);
        arrayFuncionarios[0].setTipo(TipoFuncionario.OPERADOR);
        arrayFuncionarios[0].setSalario(BigDecimal.valueOf(1200.00));
        arrayFuncionarios[0].setBonificacao(new Bonificacao(1, "Bonificação por Operador", 0.2));
        arrayFuncionarios[0].setAtivo(true);

        arrayFuncionarios[1] = new Gerente();
        arrayFuncionarios[1].setId(2);
        arrayFuncionarios[1].setNome("Ronaldo");
        arrayFuncionarios[1].setCpf("33333333333");
        arrayFuncionarios[1].setDtNascimento(LocalDateTime.of(LocalDate.of(1986, 7, 11), LocalTime.of(0, 0)));
        arrayFuncionarios[1].setSexo(OpcoesSexo.MASCULINO);
        arrayFuncionarios[1].setTipo(TipoFuncionario.GERENTE);
        arrayFuncionarios[1].setSalario(BigDecimal.valueOf(2300.00));
        arrayFuncionarios[1].setBonificacao(new Bonificacao(2, "Bonificacao por Gerente", 0.35));
        arrayFuncionarios[1].setAtivo(true);

        arrayFuncionarios[2] = new Operador();
        arrayFuncionarios[2].setId(3);
        arrayFuncionarios[2].setNome("Camila");
        arrayFuncionarios[2].setCpf("44444444444");
        arrayFuncionarios[2].setDtNascimento(LocalDateTime.of(LocalDate.of(1991, 10, 29), LocalTime.of(0, 0)));
        arrayFuncionarios[2].setSexo(OpcoesSexo.FEMININO);
        arrayFuncionarios[2].setTipo(TipoFuncionario.OPERADOR);
        arrayFuncionarios[2].setSalario(BigDecimal.valueOf(1200.00));
        arrayFuncionarios[2].setBonificacao(new Bonificacao(3, "Bonificacao por Gerente", 0.2));
        arrayFuncionarios[2].setAtivo(true);

        for (int i = 0; i < arrayFuncionarios.length; i++) {
            funcionarios.add(arrayFuncionarios[i]);
        }

        return funcionarios;

    }
}
