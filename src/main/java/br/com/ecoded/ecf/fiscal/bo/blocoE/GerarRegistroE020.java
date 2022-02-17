package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE020;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE020 {
	
	public static StringBuilder gerar(RegistroE020 registroE020, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE020.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getDesc_cta_lal()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getDt_ap_lal()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getDt_lim_lal()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getTributo()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getVl_saldo_fin()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getInd_vl_saldo_fin()));
		sb.append("|").append(Util.preencheRegistro(registroE020.getCod_pb_rfb()));
		sb.append("|").append('\n');
		return sb;
	}

}
