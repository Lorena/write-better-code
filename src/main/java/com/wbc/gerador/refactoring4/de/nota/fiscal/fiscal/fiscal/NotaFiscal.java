package com.wbc.gerador.refactoring4.de.nota.fiscal.fiscal.fiscal;

public class NotaFiscal {

	public static final int VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A = 200;
	public static final int VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_B = 1000;
	public static final double PORCENTAGEM_DA_FAIXA_A = 0.03;
	public static final double PORCENTAGEM_DA_FAIXA_B = 0.06;
	public static final double PORCENTAGEM_DA_FAIXA_C = 0.07;

	private double valorBruto;
	private double imposto;

	public NotaFiscal(Fatura fatura) {

		valorBruto = fatura.getValor();

		if(isFaixaA()) {
			imposto = calculaImpostoPorFaixa(PORCENTAGEM_DA_FAIXA_A);
		}
		else if(isFaixaB()) {
			imposto = calculaImpostoPorFaixa(PORCENTAGEM_DA_FAIXA_B);
		}
		else {
			imposto = calculaImpostoPorFaixa(PORCENTAGEM_DA_FAIXA_C);
		}
	}

	public double getValorLiquido() {
		return this.valorBruto - this.imposto;
	}

	private boolean isFaixaA() {
		return valorBruto < VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A;
	}

	private boolean isFaixaB() {
		return valorBruto > VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A && valorBruto <= VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_B;
	}

	private double calculaImpostoPorFaixa(double porcentagemDaFaixa) {
		return this.valorBruto * porcentagemDaFaixa;
	}

}