package com.alan.facol.src;

import com.alan.facol.src.domain.*;
import com.alan.facol.src.enums.OpcoesSexo;
import com.alan.facol.src.service.ClienteService;
import com.alan.facol.src.service.ContaService;
import com.alan.facol.src.service.FuncionarioService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        ClienteService clienteService = new ClienteService();
        FuncionarioService funcionarioService = new FuncionarioService();
        ContaService contaService = new ContaService();

        // Criando clientes
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Amanda");
        c1.setCpf("11111111111");
        c1.setData_nascimento(LocalDateTime.of(LocalDate.of(1999, 3, 20), LocalTime.of(0, 0)));
        c1.setSexo(OpcoesSexo.FEMININO);
        c1.setAtivo(true);

        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Bruna");
        c2.setCpf("11111111112");
        c2.setData_nascimento(LocalDateTime.of(LocalDate.of(1997, 10, 3), LocalTime.of(0,0)));
        c1.setSexo(OpcoesSexo.FEMININO);
        c2.setAtivo(true);

        clienteService.adicionar(c1);
        clienteService.adicionar(c2);

        // Crisando Funcionarios
        Funcionario func = new Operador();
        func.setId(1);
        func.setNome("Alan");
        func.setCpf("22222222222");
        func.setDtNascimento(LocalDateTime.of(LocalDate.of(1998, 3, 20), LocalTime.of(0, 0)));
        func.setSexo(OpcoesSexo.MASCULINO);
        func.setSalario(BigDecimal.valueOf(1200.00));
        func.setBonificacao(new Bonificacao(1, "Bonificação por Operador", 0.2));
        func.setAtivo(true);

        Funcionario gerente = new Gerente();
        gerente.setId(2);
        gerente.setNome("Ronaldo");
        gerente.setCpf("33333333333");
        gerente.setDtNascimento(LocalDateTime.of(LocalDate.of(1986, 7, 11), LocalTime.of(0, 0)));
        gerente.setSexo(OpcoesSexo.MASCULINO);
        gerente.setSalario(BigDecimal.valueOf(2300.00));
        gerente.setBonificacao(new Bonificacao(1, "Bonificacao por Gerente", 0.35));
        gerente.setAtivo(true);

        funcionarioService.adicionar(func);
        funcionarioService.adicionar(gerente);

        // Criando conta de Amanda
        Conta contaAmanda = new ContaCorrente();
        contaAmanda.setId(1);
        contaAmanda.setCliente(c1);
        contaAmanda.setAgencia("0232-1");
        contaAmanda.setSaldo(BigDecimal.ZERO);
        contaAmanda.adicionar(BigDecimal.valueOf(200));
        contaAmanda.setDataCriacao(LocalDateTime.now());
        contaAmanda.setFuncionario(func);
        contaAmanda.setImposto(new Imposto(1, "Imposto sobre Conta Corrente", 0.03));
        contaAmanda.setAberta(true);

        contaService.adicionar(contaAmanda);

        System.out.println(func.getSalario());
        System.out.println(gerente.getSalario());
        System.out.println(contaAmanda.getSaldo());

    }
}
