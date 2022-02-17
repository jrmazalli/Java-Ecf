package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT030 {

	public static StringBuilder gerar(RegistroT030 registroT030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroT030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroT030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
