package com.wbc.gerador.refactoring2.de.nota.fiscal;

public class NFDao {
	public void salvaNoBanco(NotaFiscal nf) {
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}

}
