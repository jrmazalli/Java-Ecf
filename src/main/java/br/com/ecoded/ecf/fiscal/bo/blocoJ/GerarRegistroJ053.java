package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ053;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroJ053 {

	public static StringBuilder gerar(RegistroJ053 registroJ053, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroJ053.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ053.getCod_idt()));
		sb.append("|").append(Util.preencheRegistro(registroJ053.getCod_cnt_corr()));
		sb.append("|").append(Util.preencheRegistro(registroJ053.getNat_sub_cnt()));
		sb.append("|").append('\n');
		return sb;
	}
}
