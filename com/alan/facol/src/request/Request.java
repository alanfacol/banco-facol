package com.alan.facol.src.request;

import com.alan.facol.src.reflection.Reflection;

import java.util.Locale;

public class Request {

    private String url;
    private String classe;
    private String metodo;

    public Request(String url){
        this.url = url;
        try {
            String[] partesUrl = url.replaceFirst("/", "").split("/");
            this.classe = partesUrl[0].replace(String.valueOf(partesUrl[0].charAt(0)), String.valueOf(partesUrl[0].charAt(0)).toUpperCase());
            this.metodo = partesUrl[1];
        } catch (Exception e){
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Object response(){
        Reflection reflection = new Reflection(this.classe, this.metodo);
        return reflection.returnData();
    }
}
