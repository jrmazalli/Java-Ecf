package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK156;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK156 {

	public static StringBuilder gerar(RegistroK156 registroK156, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK156.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getCod_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getVl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getInd_vl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getVl_deb()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getVl_cred()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroK156.getInd_vl_sld_fin()));
		sb.append("|").append('\n');
		return sb;
	}
}
