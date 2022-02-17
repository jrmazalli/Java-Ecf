package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM510;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM510 {
	
	public static StringBuilder gerar(RegistroM510 registroM510, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getCod_pb_rfb()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getDescricao_pb_rfb()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getCod_tributo()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getSd_ini_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getInd_sd_ini_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getVl_lcto_parte_a()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getInd_vl_lcto_parte_a()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getVl_lcto_parte_b()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getInd_vl_lcto_parte_b()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getSd_fim_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getInd_sd_fim_lal()));
		sb.append("|").append('\n');
		return sb;
	}

}
