package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM030 {
	
	public static StringBuilder gerar(RegistroM030 registroM030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroM030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroM030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
