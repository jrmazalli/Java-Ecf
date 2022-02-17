package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT001 {
	
	public static StringBuilder gerar(RegistroT001 registroT001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
