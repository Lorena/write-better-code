package com.wbc.gerador.refactoring4.de.nota.fiscal.fiscal.fiscal;

public class Fatura {

    private double valor;
    private String cliente;

    public Fatura(double valor, String cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

}