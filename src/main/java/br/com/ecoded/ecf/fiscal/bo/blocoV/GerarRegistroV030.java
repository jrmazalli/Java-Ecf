package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroV030 {
	
	public static StringBuilder gerar(RegistroV030 registroV030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroV030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroV030.getMes()));
		sb.append("|").append('\n');
		return sb;
	}

}
