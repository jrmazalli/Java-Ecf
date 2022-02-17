package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE001 {
	
	public static StringBuilder gerar(RegistroE001 registroE001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
