package com.wbc.gerador.refactoring0.de.nota.fiscal;

public class NotaFiscal {

	private double valorBruto;
	private double impostos;

	public NotaFiscal(double valorBruto, double impostos) {
		this.valorBruto = valorBruto;
		this.impostos = impostos;
	}

	public double getValorLiquido() {
		return this.valorBruto - this.impostos;
	}

}