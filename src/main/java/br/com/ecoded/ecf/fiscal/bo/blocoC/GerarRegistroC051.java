package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC051;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC051 {
	
	public static StringBuilder gerar(RegistroC051 registroC051, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC051.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC051.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroC051.getCod_cta_ref()));
		sb.append("|").append('\n');
		return sb;
	}

}
