package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY682;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY682 {
	
	public static StringBuilder gerar(RegistroY682 registroY682, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY682.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY682.getMes()));
		sb.append("|").append(Util.preencheRegistro(registroY682.getAcres_patr()));
		sb.append("|").append('\n');
		return sb;
	}

}
