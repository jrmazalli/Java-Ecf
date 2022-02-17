package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroW990 {

	public static StringBuilder gerar(RegistroW990 registroW990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroW990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroW990.getQtd_lin_w()));
		sb.append("|").append('\n');
		return sb;
	}

}
