package com.wbc.gerador.refactoring5.de.nota.fiscal.fiscal.fiscal.fiscal;

public class Imposto {

    private static final int VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A = 200;
    private static final int VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_B = 1000;
    private static final double PORCENTAGEM_DA_FAIXA_A = 0.03;
    private static final double PORCENTAGEM_DA_FAIXA_B = 0.06;
    private static final double PORCENTAGEM_DA_FAIXA_C = 0.07;

    private final double valor;
    private double valorBrutoDaNotaFiscal;

    public Imposto(double valorBrutoDaNotaFiscal) {
        this.valorBrutoDaNotaFiscal = valorBrutoDaNotaFiscal;

        if(isFaixaA()) {
            valor = calculoPorFaixa(PORCENTAGEM_DA_FAIXA_A);
        }
        else if(isFaixaB()) {
            valor = calculoPorFaixa(PORCENTAGEM_DA_FAIXA_B);
        }
        else {
            valor = calculoPorFaixa(PORCENTAGEM_DA_FAIXA_C);
        }
    }

    public double getValor() {
        return valor;
    }

    private boolean isFaixaA() {
        return valorBrutoDaNotaFiscal < VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A;
    }

    private boolean isFaixaB() {
        return valorBrutoDaNotaFiscal > VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A && valorBrutoDaNotaFiscal <= VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_B;
    }

    private double calculoPorFaixa(double porcentagemDaFaixa) {
        return this.valorBrutoDaNotaFiscal * porcentagemDaFaixa;
    }

}
