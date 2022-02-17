package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM001 {
	
	public static StringBuilder gerar(RegistroM001 registroM001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
