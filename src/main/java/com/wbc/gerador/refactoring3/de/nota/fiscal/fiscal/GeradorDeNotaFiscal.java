package com.wbc.gerador.refactoring3.de.nota.fiscal.fiscal;

public class GeradorDeNotaFiscal {

	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal notaFiscal = new NotaFiscal(fatura);
		new NotaFiscalDao().salva(notaFiscal);
		new EnviadorDeEmail().enviaEmail(notaFiscal);

		return notaFiscal;
	}
}