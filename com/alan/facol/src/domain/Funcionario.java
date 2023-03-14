package com.alan.facol.src.domain;

import com.alan.facol.src.enums.OpcoesSexo;
import com.alan.facol.src.enums.TipoFuncionario;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Funcionario {

    private int id;
    private String nome;
    private String cpf;
    private LocalDateTime dtNascimento;
    private OpcoesSexo sexo;
    private TipoFuncionario tipo;
    private BigDecimal salario;
    private Bonificacao bonificacao;
    private boolean ativo;

    public Funcionario(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDateTime dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public OpcoesSexo getSexo() {
        return sexo;
    }

    public void setSexo(OpcoesSexo sexo) {
        this.sexo = sexo;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
        this.salario = this.salario.add(this.salario.multiply(BigDecimal.valueOf(bonificacao.getPercentual())));
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
