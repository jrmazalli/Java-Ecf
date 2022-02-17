package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroW001 {

	public static StringBuilder gerar(RegistroW001 registroW001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroW001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroW001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
