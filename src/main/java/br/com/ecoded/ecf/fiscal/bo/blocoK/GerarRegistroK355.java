package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK355;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK355 {

	public static StringBuilder gerar(RegistroK355 registroK355, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK355.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK355.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroK355.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroK355.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroK355.getInd_vl_sld_fin()));
		sb.append("|").append('\n');
		return sb;
	}
}
