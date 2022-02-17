package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL990 {
	
	public static StringBuilder gerar(RegistroL990 registroL990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL990.getQtd_lin_l()));
		sb.append("|").append('\n');
		return sb;
	}

}
