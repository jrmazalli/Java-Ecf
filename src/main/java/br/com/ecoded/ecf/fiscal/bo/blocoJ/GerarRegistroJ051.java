package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ051;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroJ051 {

	public static StringBuilder gerar(RegistroJ051 registroJ051, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroJ051.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ051.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroJ051.getCod_cta_ref()));
		sb.append("|").append('\n');
		return sb;
	}
}
