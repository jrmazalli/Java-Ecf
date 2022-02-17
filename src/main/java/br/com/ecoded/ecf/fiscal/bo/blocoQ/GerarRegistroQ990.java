package br.com.ecoded.ecf.fiscal.bo.blocoQ;

import br.com.ecoded.ecf.fiscal.registros.blocoQ.RegistroQ990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroQ990 {
	
	public static StringBuilder gerar(RegistroQ990 registroQ990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroQ990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroQ990.getQtd_lin_q()));
		sb.append("|").append('\n');
		return sb;
	}

}
