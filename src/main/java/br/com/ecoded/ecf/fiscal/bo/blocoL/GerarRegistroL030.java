package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL030 {
	
	public static StringBuilder gerar(RegistroL030 registroL030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroL030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroL030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
