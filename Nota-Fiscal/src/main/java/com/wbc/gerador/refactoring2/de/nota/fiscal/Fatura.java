package com.wbc.gerador.refactoring2.de.nota.fiscal;

public class Fatura {

    private double valorMensal;
    private String cliente;

    public Fatura(double valorMensal, String cliente) {
        this.valorMensal = valorMensal;
        this.cliente = cliente;
    }

    public double getValorMensal() {
        return valorMensal;
    }

}