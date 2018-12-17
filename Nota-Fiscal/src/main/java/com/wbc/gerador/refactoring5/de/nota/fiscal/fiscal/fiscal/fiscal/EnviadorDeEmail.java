package com.wbc.gerador.refactoring5.de.nota.fiscal.fiscal.fiscal.fiscal;

public class EnviadorDeEmail {

	public void enviaEmail(NotaFiscal notaFiscal) {

		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "É com prazer que lhe avisamos que sua nota fiscal foi "
				+ "gerada no valor de " + notaFiscal.getValorLiquido() + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e faça o download.<br/><br/>";
		msgDoEmail += "Obrigado!";
		
		System.out.println(msgDoEmail);
	}
}
