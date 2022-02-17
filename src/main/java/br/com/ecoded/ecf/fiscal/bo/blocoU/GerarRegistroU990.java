package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU990 {
	
	public static StringBuilder gerar(RegistroU990 registroU990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU990.getQtd_lin_u()));
		sb.append("|").append('\n');
		return sb;
	}

}
