package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX330;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX330 {
	
	public static StringBuilder gerar(RegistroX330 registroX330, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX330.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX330.getCond_pes()));
		sb.append("|").append('\n');
		return sb;
	}

}
