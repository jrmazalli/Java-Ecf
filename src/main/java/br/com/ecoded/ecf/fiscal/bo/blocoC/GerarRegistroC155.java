package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC155;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC155 {

	public static StringBuilder gerar(RegistroC155 registroC155, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC155.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getInd_vl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getLinha_ecd()));
		sb.append("|").append('\n');
		return sb;
	}
}
