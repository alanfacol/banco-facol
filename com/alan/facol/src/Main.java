package com.alan.facol.src;

import com.alan.facol.src.request.Request;

public class Main {

    public static void main(String[] args) {

        /* URLs a serem testadas:
            /conta/listarContas,
            /funcionarios/listarTodos
            /funcionario/listarGerentes
            /funcionario/listarOperadores
            /cliente/listarTodos
         */

        Request request = new Request("/funcionario/listarGerentes");
        Object obj = request.response();
        System.out.println(obj);


    }
}
