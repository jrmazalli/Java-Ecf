package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL200;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL200 {
	
	public static StringBuilder gerar(RegistroL200 registroL200, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL200.getInd_aval_estoq()));
		sb.append("|").append('\n');
		return sb;
	}

}
