package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM410;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM410 {
	
	public static StringBuilder gerar(RegistroM410 registroM410, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM410.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getCod_tributo()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getVal_lan_lalb_pb()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getInd_val_lan_lalb_pb()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getCod_cta_b_ctp()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getHist_lan_lalb()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getInd_lan_ant()));
		sb.append("|").append('\n');
		return sb;
	}

}
