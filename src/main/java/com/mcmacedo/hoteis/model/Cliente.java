package com.mcmacedo.hoteis.model;

public class Cliente {

    private String nome;
    private Boolean vip;

    public Cliente() {
    }

    public Cliente(String nome, Boolean vip) {
        this.nome = nome;
        this.vip = vip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }
}
