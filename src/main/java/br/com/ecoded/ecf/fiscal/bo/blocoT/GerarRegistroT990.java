package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT990 {
	
	public static StringBuilder gerar(RegistroT990 registroT990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT990.getQtd_lin_t()));
		sb.append("|").append('\n');
		return sb;
	}

}
