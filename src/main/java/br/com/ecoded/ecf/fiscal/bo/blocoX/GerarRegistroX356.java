package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX356;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX356 {
	
	public static StringBuilder gerar(RegistroX356 registroX330, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX330.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getPerc_part()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getAtivo_total()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getPat_liquido()));
		sb.append("|").append('\n');
		return sb;
	}

}
