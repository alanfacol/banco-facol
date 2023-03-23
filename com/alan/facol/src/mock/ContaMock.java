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

        Conta contaAmanda = new ContaCorrente();

        contaAmanda.setId(1);
        contaAmanda.setCliente(ClienteMock.listarClientes().get(1));
        contaAmanda.setAgencia("0232-1");
        contaAmanda.setSaldo(BigDecimal.ZERO);
        contaAmanda.adicionar(BigDecimal.valueOf(200));
        contaAmanda.setDataCriacao(LocalDateTime.now());
        contaAmanda.setFuncionario(FuncionarioMock.listarFuncionarios().get(1));
        contaAmanda.setImposto(new Imposto(1, "Imposto sobre Conta Corrente", 0.03));
        contaAmanda.setAberta(true);

        contas.add(contaAmanda);

        return contas;
    }
}


