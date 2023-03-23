package com.alan.facol.src.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Paths;

public class Reflection {

    private final String baseControllerSrc;
    private final String classe_url;
    private final String metodo_url;

    public Reflection(String classe_url, String metodo_url){
        this.classe_url = classe_url;
        this.metodo_url = metodo_url;
        this.baseControllerSrc = this.getClass().getPackageName().replace("reflection", "controller") + ".";
    }

    public Object returnData() {
        try {
            Class<?> classe = Class.forName(this.baseControllerSrc + this.classe_url + "Controller");
            Object objeto = classe.getDeclaredConstructor().newInstance();
            Method metodo = classe.getMethod(this.metodo_url);
            return metodo.invoke(objeto);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBaseControllerSrc() {
        return baseControllerSrc;
    }

    public String getClasse_url() {
        return classe_url;
    }

    public String getMetodo_url() {
        return metodo_url;
    }
}
