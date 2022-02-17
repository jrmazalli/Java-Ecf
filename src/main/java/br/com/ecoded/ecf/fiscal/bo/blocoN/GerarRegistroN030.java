package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN030 {
	
	public static StringBuilder gerar(RegistroN030 registroN030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroN030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroN030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
