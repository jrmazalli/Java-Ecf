package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroW100 {
	
	public static StringBuilder gerar(RegistroW100 registroW100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroW100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getNome_multinacional()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getInd_controladora()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getNome_controladora()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getJurisdicao_controladora()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getTin_controladora()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getInd_entrega()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getInd_modalidade()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getNome_substituta()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getJurisdicao_subistituta()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getTin_substituta()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getTip_moeda()));
		sb.append("|").append(Util.preencheRegistro(registroW100.getInd_idioma()));
		sb.append("|").append('\n');
		return sb;
	}

}
