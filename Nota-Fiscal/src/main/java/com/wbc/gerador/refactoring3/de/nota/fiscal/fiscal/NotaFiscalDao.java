package com.wbc.gerador.refactoring3.de.nota.fiscal.fiscal;

public class NotaFiscalDao {
	public void salva(NotaFiscal notaFiscal) {
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + notaFiscal.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}

}
