package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK001 {

	public static StringBuilder gerar(RegistroK001 registroK001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}
}
