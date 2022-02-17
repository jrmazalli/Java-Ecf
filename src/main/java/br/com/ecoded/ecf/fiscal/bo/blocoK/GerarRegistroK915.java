package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK915;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK915 {

	public static StringBuilder gerar(RegistroK915 registroK915, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK915.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getPer_apur()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getId_regra()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getVl_sld_ini_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getInd_vl_sld_ini_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getVl_deb_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getVl_cred_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getVl_sld_fin_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getInd_vl_sld_fin_esp()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getSld_ini_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getInd_sld_ini_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getVl_deb_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getVl_cred_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getSld_fin_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getInd_sld_fin_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getInd_sld_fin_pre()));
		sb.append("|").append(Util.preencheRegistro(registroK915.getJustificativa()));
		sb.append("|").append('\n');
		return sb;
	}
}
