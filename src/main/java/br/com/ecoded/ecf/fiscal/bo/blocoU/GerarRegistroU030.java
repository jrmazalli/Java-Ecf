package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU030 {
	
	public static StringBuilder gerar(RegistroU030 registroU030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroU030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroU030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
