package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY650;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY650 {
	
	public static StringBuilder gerar(RegistroY650 registroY650, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY650.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY650.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY650.getVl_part()));
		sb.append("|").append('\n');
		return sb;
	}

}
