package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX310;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX310 {
	
	public static StringBuilder gerar(RegistroX310 registroX310, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX310.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX310.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroX310.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX310.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX310.getCond_pes()));
		sb.append("|").append('\n');
		return sb;
	}

}
