package com.alan.facol.src.mock;

import com.alan.facol.src.domain.*;
import com.alan.facol.src.enums.OpcoesSexo;
import com.alan.facol.src.enums.TipoFuncionario;
import com.alan.facol.src.service.ClienteService;
import com.alan.facol.src.service.ContaService;
import com.alan.facol.src.service.FuncionarioService;
import com.sun.tools.jconsole.JConsoleContext;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ContaMock {

    public ContaMock(){
    }

    public static List<Conta> listarContas() {

        List<Conta> contas = new ArrayList<>();
        Conta[] arrayContas = new Conta[3];

        arrayContas[0] = new ContaCorrente();
        arrayContas[0].setId(1);
        arrayContas[0].setCliente(ClienteMock.listarClientes().get(1));
        arrayContas[0].setAgencia("0232-1");
        arrayContas[0].setSaldo(BigDecimal.ZERO);
        arrayContas[0].adicionar(BigDecimal.valueOf(200));
        arrayContas[0].setDataCriacao(LocalDateTime.now());
        arrayContas[0].setFuncionario(FuncionarioMock.listarFuncionarios().get(1));
        arrayContas[0].setImposto(new Imposto(1, "Imposto sobre Conta Corrente", 0.03));
        arrayContas[0].setAberta(true);

        arrayContas[1] = new ContaCorrente();
        arrayContas[1].setId(2);
        arrayContas[1].setCliente(ClienteMock.listarClientes().get(2));
        arrayContas[1].setAgencia("0232-1");
        arrayContas[1].setSaldo(BigDecimal.ZERO);
        arrayContas[1].adicionar(BigDecimal.valueOf(4000));
        arrayContas[1].setDataCriacao(LocalDateTime.now());
        arrayContas[1].setFuncionario(FuncionarioMock.listarFuncionarios().get(0));
        arrayContas[1].setImposto(new Imposto(1, "Imposto sobre Conta Corrente", 0.04));
        arrayContas[1].setAberta(true);

        arrayContas[2] = new ContaCorrente();
        arrayContas[2].setId(3);
        arrayContas[2].setCliente(ClienteMock.listarClientes().get(0));
        arrayContas[2].setAgencia("0232-1");
        arrayContas[2].setSaldo(BigDecimal.ZERO);
        arrayContas[2].adicionar(BigDecimal.valueOf(2500));
        arrayContas[2].setDataCriacao(LocalDateTime.now());
        arrayContas[2].setFuncionario(FuncionarioMock.listarFuncionarios().get(2));
        arrayContas[2].setImposto(new Imposto(1, "Imposto sobre Conta Corrente", 0.02));
        arrayContas[2].setAberta(true);

        for (int i = 0; i < arrayContas.length; i++) {
            contas.add(arrayContas[i]);
        }
        return contas;
    }
}


