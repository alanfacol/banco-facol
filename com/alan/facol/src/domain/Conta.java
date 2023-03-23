package com.alan.facol.src.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Conta {

    private int id;
    private String agencia;
    private LocalDateTime dataCriacao;
    private BigDecimal saldo;
    private Cliente cliente;
    private Funcionario funcionario;
    private Imposto imposto;
    private boolean aberta;

    public Conta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
        this.saldo = this.saldo.subtract(this.saldo.multiply(BigDecimal.valueOf(imposto.getJuros())));
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void adicionar(BigDecimal v){
        this.saldo = this.saldo.add(v);
    }

    public void retirar(BigDecimal v){
        this.saldo = this.saldo.subtract(v);
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", agencia='" + agencia + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", imposto=" + imposto +
                ", aberta=" + aberta +
                "}";
    }
}
