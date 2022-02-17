package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK356;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK356 {

	public static StringBuilder gerar(RegistroK356 registroK356, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK356.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK356.getCod_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registroK356.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroK356.getInd_vl_sld_fin()));
		sb.append("|").append('\n');
		return sb;
	}
}
