package com.wbc.gerador.refactoring6.de.nota.fiscal.fiscal.fiscal.fiscal.fiscal;

public class Faixa {

    private final double low;
    private final double high;
    private final double porcentagemDaFaixa;

    public Faixa(double low, double high, double porcentagemDaFaixa) {
        this.low = low;
        this.high = high;
        this.porcentagemDaFaixa = porcentagemDaFaixa;
    }

    public boolean isBetween(double valorBrutoDaNotaFiscal) {
        return valorBrutoDaNotaFiscal >= low && valorBrutoDaNotaFiscal < high;
    }

    public double calculoImposto(double valorBrutoDaNotaFiscal) {
        return valorBrutoDaNotaFiscal * porcentagemDaFaixa;
    }

}
