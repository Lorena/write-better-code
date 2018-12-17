package com.wbc.gerador.refactoring5.de.nota.fiscal.fiscal.fiscal.fiscal;

public class NotaFiscal {

	private double valorBruto;
	private double imposto;

	public NotaFiscal(Fatura fatura) {
		valorBruto = fatura.getValor();
		imposto = new Imposto(valorBruto).getValor();
	}
	public double getValorLiquido() {
		return this.valorBruto - this.imposto;
	}
}