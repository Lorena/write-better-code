package com.wbc.gerador.refactoring2.de.nota.fiscal;

public class GeradorDeNotaFiscal {

	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal notaFiscal = new NotaFiscal(fatura);
        notaFiscal.calculaImposto();

		new NFDao().salvaNoBanco(notaFiscal);
		new EnviadorDeEmail().enviaEmail(notaFiscal);

		return notaFiscal;
	}
}