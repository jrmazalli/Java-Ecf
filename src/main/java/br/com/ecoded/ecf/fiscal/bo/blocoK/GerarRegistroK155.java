package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK155;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK155 {

	public static StringBuilder gerar(RegistroK155 registroK155, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK155.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getVl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getInd_vl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getVl_deb()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getVl_cred()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroK155.getInd_vl_sld_fin()));
		sb.append("|").append('\n');
		return sb;
	}
}
