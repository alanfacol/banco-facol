package com.alan.facol.src.controller;

import com.alan.facol.src.domain.Cliente;
import com.alan.facol.src.mock.ClienteMock;

import java.util.List;

public class ClienteController {

    public ClienteController(){

    }

    public List<Cliente> listarTodos(){
        return ClienteMock.listarClientes();
    }
}
