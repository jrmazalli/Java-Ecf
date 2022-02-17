package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY660;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY660 {
	
	public static StringBuilder gerar(RegistroY660 registroY660, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY660.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY660.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY660.getNome_emp()));
		sb.append("|").append(Util.preencheRegistro(registroY660.getPerc_pat_liq()));
		sb.append("|").append('\n');
		return sb;
	}

}
