package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroV990 {

	public static StringBuilder gerar(RegistroV990 registroV990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroV990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroV990.getQtd_lin_m()));
		sb.append("|").append('\n');
		return sb;
	}

}
