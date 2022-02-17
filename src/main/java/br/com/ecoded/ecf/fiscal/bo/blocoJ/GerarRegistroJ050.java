package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ050;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroJ050 {

	public static StringBuilder gerar(RegistroJ050 registroJ050, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroJ050.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getInd_cta()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroJ050.getCta()));
		sb.append("|").append('\n');
		return sb;
	}
}
