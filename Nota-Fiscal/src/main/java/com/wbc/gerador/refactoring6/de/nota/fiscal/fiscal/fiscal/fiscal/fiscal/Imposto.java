package com.wbc.gerador.refactoring6.de.nota.fiscal.fiscal.fiscal.fiscal.fiscal;

import java.util.HashMap;
import java.util.Map;

public class Imposto {

    private final double valor;

    private final Map<String,Faixa> faixas = createFaixas();

    private Map<String, Faixa> createFaixas() {
        Map<String,Faixa> faixas = new HashMap<>();
        Faixa faixaA = new Faixa(0, 200, 0.03);
        Faixa faixaB = new Faixa(200, 1000, 0.06);
        Faixa faixaC = new Faixa(1000, 1000000, 0.07);
        faixas.put("A", faixaA);
        faixas.put("B", faixaB);
        faixas.put("C", faixaC);
        return faixas;
    }

    public Imposto(double valorBrutoDaNotaFiscal) {
        Faixa faixa = faixas.entrySet().stream().filter(f -> f.getValue().isBetween(valorBrutoDaNotaFiscal)).findFirst().get().getValue();
        valor = faixa.calculoImposto(valorBrutoDaNotaFiscal);
    }

    public double getValor() {
        return valor;
    }

}
