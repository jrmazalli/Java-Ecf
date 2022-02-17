package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN990 {

	public static StringBuilder gerar(RegistroN990 registroN990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN990.getQtd_lin_n()));
		sb.append("|").append('\n');
		return sb;
	}

}
