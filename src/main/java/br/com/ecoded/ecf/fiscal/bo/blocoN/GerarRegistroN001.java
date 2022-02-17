package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN001 {
	
	public static StringBuilder gerar(RegistroN001 registroN001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
