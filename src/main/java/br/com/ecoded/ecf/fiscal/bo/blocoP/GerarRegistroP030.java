package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP030 {
	
	public static StringBuilder gerar(RegistroP030 registroP030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroP030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroP030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
