package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM310;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM310 {

	public static StringBuilder gerar(RegistroM310 registroM310, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM310.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM310.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM310.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroM310.getVl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM310.getInd_vl_cta()));
		sb.append("|").append('\n');
		return sb;
	}

}
