package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE990 {

	public static StringBuilder gerar(RegistroE990 registroE990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE990.getQtd_lin_e()));
		sb.append("|").append('\n');
		return sb;
	}

}
