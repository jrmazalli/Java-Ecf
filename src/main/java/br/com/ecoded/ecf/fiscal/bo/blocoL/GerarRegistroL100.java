package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL100 {
	
	public static StringBuilder gerar(RegistroL100 registroL100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getTipo()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getVal_cta_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getInd_val_cta_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getVal_cta_ref_deb()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getVal_cta_ref_cred()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getVal_cta_ref_fin()));
		sb.append("|").append(Util.preencheRegistro(registroL100.getInd_val_cta_ref_fin()));
		sb.append("|").append('\n');
		return sb;
	}

}
