package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroJ990 {

	public static StringBuilder gerar(RegistroJ990 registroJ990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroJ990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ990.getQtd_lin_j()));
		sb.append("|").append('\n');
		return sb;
	}
}
