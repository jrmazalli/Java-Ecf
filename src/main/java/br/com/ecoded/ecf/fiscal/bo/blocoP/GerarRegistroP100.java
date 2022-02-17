package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP100 {
	
	public static StringBuilder gerar(RegistroP100 registroP100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getTipo()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVal_cta_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getInd_val_cta_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVal_cta_ref_deb()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVal_cta_ref_cred()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVal_cta_ref_fin()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getInd_val_cta_ref_fin()));
		sb.append("|").append('\n');
		return sb;
	}

}
