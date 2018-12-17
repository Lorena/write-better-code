package com.wbc.gerador.refactoring2.de.nota.fiscal;

public class NotaFiscal {

	private double valorBruto;
	private double imposto;

	public NotaFiscal(Fatura fatura) {
		valorBruto = fatura.getValorMensal();

	}

	public void calculaImposto() {
		imposto = 0;
		if(valorBruto < 200) {
			imposto = valorBruto * 0.03;
		}
		else if(valorBruto > 200 && valorBruto <= 1000) {
			imposto = valorBruto * 0.06;
		}
		else {
			imposto = valorBruto * 0.07;
		}
	}

	public double getValorLiquido() {
		return this.valorBruto - this.imposto;
	}

	public double getImposto() {
		return imposto;
	}
}