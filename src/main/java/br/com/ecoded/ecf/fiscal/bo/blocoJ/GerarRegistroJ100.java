package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroJ100 {

	public static StringBuilder gerar(RegistroJ100 registroJ100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroJ100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getCcus()));
		sb.append("|").append('\n');
		return sb;
	}
}
