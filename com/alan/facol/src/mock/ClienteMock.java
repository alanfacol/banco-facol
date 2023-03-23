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
        Cliente[] arrayClientes = new Cliente[3];

        arrayClientes[0] = new Cliente();
        arrayClientes[0].setId(1);
        arrayClientes[0].setNome("Amanda");
        arrayClientes[0].setCpf("11111111111");
        arrayClientes[0].setData_nascimento(LocalDateTime.of(LocalDate.of(1999, 3, 20), LocalTime.of(0, 0)));
        arrayClientes[0].setSexo(OpcoesSexo.FEMININO);
        arrayClientes[0].setAtivo(true);

        arrayClientes[1] = new Cliente();
        arrayClientes[1].setId(2);
        arrayClientes[1].setNome("Bruna");
        arrayClientes[1].setCpf("11111111112");
        arrayClientes[1].setData_nascimento(LocalDateTime.of(LocalDate.of(1997, 10, 3), LocalTime.of(0,0)));
        arrayClientes[1].setSexo(OpcoesSexo.FEMININO);
        arrayClientes[1].setAtivo(true);

        arrayClientes[2] = new Cliente();
        arrayClientes[2].setId(3);
        arrayClientes[2].setNome("Junior");
        arrayClientes[2].setCpf("11111111113");
        arrayClientes[2].setData_nascimento(LocalDateTime.of(LocalDate.of(1992, 2, 11), LocalTime.of(0,0)));
        arrayClientes[2].setSexo(OpcoesSexo.MASCULINO);
        arrayClientes[2].setAtivo(true);

        for (int i = 0; i < arrayClientes.length; i++) {
            clientes.add(arrayClientes[i]);
        }
        return clientes;
    }
}
