package com.alan.facol.src.domain;

import com.alan.facol.src.enums.OpcoesSexo;

import java.time.LocalDateTime;

public class Cliente {

    private int id;
    private String cpf;
    private String nome;
    private LocalDateTime data_nascimento;
    private OpcoesSexo sexo;
    private boolean ativo;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public OpcoesSexo getSexo() {
        return sexo;
    }

    public void setSexo(OpcoesSexo sexo) {
        this.sexo = sexo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", sexo=" + sexo +
                ", ativo=" + ativo +
                '}';
    }
}
