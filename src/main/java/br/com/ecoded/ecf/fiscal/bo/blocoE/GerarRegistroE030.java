package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE030 {

	public static StringBuilder gerar(RegistroE030 registroE030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroE030.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroE030.getPer_apur()));
		sb.append("|").append('\n');
		return sb;
	}

}
