package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX001 {
	
	public static StringBuilder gerar(RegistroX001 registroX001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
