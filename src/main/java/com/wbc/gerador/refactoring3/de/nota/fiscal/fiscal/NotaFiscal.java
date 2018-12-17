package com.wbc.gerador.refactoring3.de.nota.fiscal.fiscal;

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
		imposto = 0;
		if(valorBruto < VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A) {
			imposto = valorBruto * PORCENTAGEM_DA_FAIXA_A;
		}
		else if(valorBruto > VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_A && valorBruto <= VALOR_DE_IMPOSTO_MAXIMO_DA_FAIXA_B) {
			imposto = valorBruto * PORCENTAGEM_DA_FAIXA_B;
		}
		else {
			imposto = valorBruto * PORCENTAGEM_DA_FAIXA_C;
		}
	}

	public double getValorLiquido() {
		return this.valorBruto - this.imposto;
	}

}