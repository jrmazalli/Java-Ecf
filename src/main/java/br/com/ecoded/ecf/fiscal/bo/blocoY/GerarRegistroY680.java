package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY680;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY680 {
	
	public static StringBuilder gerar(RegistroY680 registroY680, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY680.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY680.getMes()));
		sb.append("|").append('\n');
		return sb;
	}

}
