package com.douglasfreire.cadastro_clientes.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class UserNaturalPerson extends User {

    @NotEmpty
    private String rg;
    @NotEmpty
    private String cpf;

    public UserNaturalPerson(){}


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

    @Override
    public String toString() {
        return "UserNaturalPerson{" +
                "rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
