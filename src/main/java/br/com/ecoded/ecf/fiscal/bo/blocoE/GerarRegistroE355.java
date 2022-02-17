package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE355;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE355 {

	public static StringBuilder gerar(RegistroE355 registroE355, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE355.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE355.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroE355.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroE355.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroE355.getInd_vl_sld_fin()));
		sb.append("|").append('\n');
		return sb;
	}

}
