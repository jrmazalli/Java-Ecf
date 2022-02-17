package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC355;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC355 {

	public static StringBuilder gerar(RegistroC355 registroC355, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC355.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC355.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC355.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroC355.getVl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC355.getInd_vl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC355.getLinha_ecd()));
		sb.append("|").append('\n');
		return sb;
	}
}
