package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL001 {
	
	public static StringBuilder gerar(RegistroL001 registroL001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
