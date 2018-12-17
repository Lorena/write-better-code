package com.wbc.gerador.refactoring1.de.nota.fiscal.fiscal;

public class NFDao {
	public void salvaNoBanco(NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}

}
