package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP001 {
	
	public static StringBuilder gerar(RegistroP001 registroP001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
