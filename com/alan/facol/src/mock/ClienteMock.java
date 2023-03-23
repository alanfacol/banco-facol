package com.alan.facol.src.mock;

import com.alan.facol.src.domain.Cliente;
import com.alan.facol.src.enums.OpcoesSexo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ClienteMock {

    public ClienteMock(){

    }

    public static List<Cliente> listarClientes(){
        List<Cliente> clientes = new ArrayList<>();

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
        c2.setSexo(OpcoesSexo.FEMININO);
        c2.setAtivo(true);

        clientes.add(c1);
        clientes.add(c2);

        return clientes;
    }
}
