package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY990 {
	
	public static StringBuilder gerar(RegistroY990 registroY990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY990.getQtd_lin_y()));
		sb.append("|").append('\n');
		return sb;
	}

}
