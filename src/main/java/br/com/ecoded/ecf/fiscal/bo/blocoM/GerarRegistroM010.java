package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM010;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM010 {
	
	public static StringBuilder gerar(RegistroM010 registroM010, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getDesc_cta_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getDt_ap_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getCod_pb_rfb()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getDt_lim_lal()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getCod_tributo()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getVl_saldo_ini()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getInd_vl_saldo_ini()));
		sb.append("|").append(Util.preencheRegistro(registroM010.getCnpj_sit_esp()));
		sb.append("|").append('\n');
		return sb;
	}

}
