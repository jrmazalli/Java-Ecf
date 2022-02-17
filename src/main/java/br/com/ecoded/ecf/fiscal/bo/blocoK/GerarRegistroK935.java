package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK935;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK935 {

	public static StringBuilder gerar(RegistroK935 registroK935, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK935.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getPer_apur()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getId_regra()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getVl_sld_fin_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getInd_vl_sld_fin_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getSld_fin_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getInd_sld_fin_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK935.getJustificativa()));
		sb.append("|").append('\n');
		return sb;
	}

}
