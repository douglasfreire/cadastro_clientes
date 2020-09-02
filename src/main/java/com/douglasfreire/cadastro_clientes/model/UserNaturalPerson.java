package com.douglasfreire.cadastro_clientes.model;

import javax.persistence.Entity;

@Entity
public class UserNaturalPerson extends User {

    private String rg;
    private String cpf;

    public UserNaturalPerson(){}

    public UserNaturalPerson(String nome, String email, String telefone, String cep, String estado, String cidade, String bairro, String rua, String numero, String complemento, String rg, String cpf) {
        super(nome, email, telefone, cep, estado, cidade, bairro, rua, numero, complemento);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
