package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC350;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC350 {

	public static StringBuilder gerar(RegistroC350 registroC350, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC350.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC350.getDt_res()));
		sb.append("|").append('\n');
		return sb;
	}
}
