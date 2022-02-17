package br.com.ecoded.ecf.fiscal.bo.blocoQ;

import br.com.ecoded.ecf.fiscal.registros.blocoQ.RegistroQ001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroQ001 {
	
	public static StringBuilder gerar(RegistroQ001 registroQ001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroQ001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroQ001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
