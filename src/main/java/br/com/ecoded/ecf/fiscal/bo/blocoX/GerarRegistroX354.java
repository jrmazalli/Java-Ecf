package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX354;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX354 {
	
	public static StringBuilder gerar(RegistroX354 registroX354, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX354.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX354.getRes_neg()));
		sb.append("|").append(Util.preencheRegistro(registroX354.getRes_neg_real()));
		sb.append("|").append(Util.preencheRegistro(registroX354.getSaldo_res_neg()));
		sb.append("|").append('\n');
		return sb;
	}

}
