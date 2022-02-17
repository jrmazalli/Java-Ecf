package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY001 {
	
	public static StringBuilder gerar(RegistroY001 registroY001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
