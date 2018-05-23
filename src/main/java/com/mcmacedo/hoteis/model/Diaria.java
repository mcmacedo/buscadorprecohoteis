package com.mcmacedo.hoteis.model;

public class Diaria {

    private Double precoSemanal;
    private Double precoFimDeSemana;

    public Diaria() {
    }

    public Diaria(Double precoSemanal, Double precoFimDeSemana) {
        this.precoSemanal = precoSemanal;
        this.precoFimDeSemana = precoFimDeSemana;
    }

    public Double getPrecoSemanal() {
        return precoSemanal;
    }

    public void setPrecoSemanal(Double precoSemanal) {
        this.precoSemanal = precoSemanal;
    }

    public Double getPrecoFimDeSemana() {
        return precoFimDeSemana;
    }

    public void setPrecoFimDeSemana(Double precoFimDeSemana) {
        this.precoFimDeSemana = precoFimDeSemana;
    }
}
