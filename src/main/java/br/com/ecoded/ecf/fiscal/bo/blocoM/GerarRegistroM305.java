package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM305;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM305 {

	public static StringBuilder gerar(RegistroM305 registroM305, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM305.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM305.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registroM305.getVl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM305.getInd_vl_cta()));
		sb.append("|").append('\n');
		return sb;
	}

}
