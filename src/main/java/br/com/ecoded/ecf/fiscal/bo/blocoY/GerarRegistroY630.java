package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY630;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY630 {
	
	public static StringBuilder gerar(RegistroY630 registroY630, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY630.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY630.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY630.getQte_quot()));
		sb.append("|").append(Util.preencheRegistro(registroY630.getQte_quota()));
		sb.append("|").append(Util.preencheRegistro(registroY630.getPatr_fin_per()));
		sb.append("|").append(Util.preencheRegistro(registroY630.getDat_abert()));
		sb.append("|").append(Util.preencheRegistro(registroY630.getDat_encer()));
		sb.append("|").append('\n');
		return sb;
	}

}
