package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN615;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN615 {
	
	public static StringBuilder gerar(RegistroN615 registroN615, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN615.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN615.getBase_calc()));
		sb.append("|").append(Util.preencheRegistro(registroN615.getPer_incen_finor()));
		sb.append("|").append(Util.preencheRegistro(registroN615.getVl_liq_incen_finor()));
		sb.append("|").append(Util.preencheRegistro(registroN615.getPer_incen_finam()));
		sb.append("|").append(Util.preencheRegistro(registroN615.getVl_liq_incen_finam()));
		sb.append("|").append(Util.preencheRegistro(registroN615.getValor_total()));
		sb.append("|").append('\n');
		return sb;
	}

}
