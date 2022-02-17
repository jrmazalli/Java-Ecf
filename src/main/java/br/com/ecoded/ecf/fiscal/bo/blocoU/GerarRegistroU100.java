package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU100 {
	
	public static StringBuilder gerar(RegistroU100 registroU100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getTipo()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getVal_cta_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getInd_val_cta_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getVal_cta_ref_deb()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getVal_cta_ref_cred()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getVal_cta_ref_fin()));
		sb.append("|").append(Util.preencheRegistro(registroU100.getInd_val_cta_ref_fin()));
		sb.append("|").append('\n');
		return sb;
	}

}
