package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE155;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE155 {
	
	public static StringBuilder gerar(RegistroE155 registroE155, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE155.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getVl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getInd_vl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getVl_deb()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getVl_cred()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroE155.getInd_vl_sld_fin()));
		sb.append("|").append('\n');
		return sb;
	}

}
