package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX990 {
	
	public static StringBuilder gerar(RegistroX990 registroX990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX990.getQtd_lin_x()));
		sb.append("|").append('\n');
		return sb;
	}

}
