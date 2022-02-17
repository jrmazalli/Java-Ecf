package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroV001 {
	
	public static StringBuilder gerar(RegistroV001 registroV001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroV001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroV001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
