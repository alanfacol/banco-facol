package com.alan.facol.src.controller;

import com.alan.facol.src.domain.Conta;
import com.alan.facol.src.mock.ContaMock;

import java.util.List;

public class ContaController {

    public ContaController (){
    }

    public List<Conta> listarContas(){
        return ContaMock.listarContas();
    }
}
