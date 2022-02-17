package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM990 {
	
	public static StringBuilder gerar(RegistroM990 registroM990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM990.getQtd_lin_m()));
		sb.append("|").append('\n');
		return sb;
	}

}
