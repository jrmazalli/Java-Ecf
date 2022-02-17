package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM500;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM500 {
	
	public static StringBuilder gerar(RegistroM500 registroM500, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getCod_tributo()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getSd_ini_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getInd_sd_ini_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_lcto_parte_a()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getInd_vl_lcto_parte_a()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_lcto_parte_b()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getInd_vl_lcto_parte_b()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getSd_fim_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getInd_sd_fim_lal()));
		sb.append("|").append('\n');
		return sb;
	}

}
