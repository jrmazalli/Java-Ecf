package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX355;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX355 {
	
	public static StringBuilder gerar(RegistroX355 registroX355, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX355.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getRend_pass_prop()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getRend_pass_prop_real()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getRend_total()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getRend_total_real()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getRend_ativ_prop()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getRend_ativ_prop_real()));
		sb.append("|").append(Util.preencheRegistro(registroX355.getPercentural()));
		sb.append("|").append('\n');
		return sb;
	}

}
