package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK990 {

	public static StringBuilder gerar(RegistroK990 registroK990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK990.getQtd_lin_k()));
		sb.append("|").append('\n');
		return sb;
	}
}
