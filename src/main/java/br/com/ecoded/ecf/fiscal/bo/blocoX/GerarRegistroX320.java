package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX320;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX320 {
	
	public static StringBuilder gerar(RegistroX320 registroX320, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX320.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getNum_ord()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getTip_imp()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getDesc_imp()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getTot_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getQtde()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getUni_med()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getTip_met()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getVl_par()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getVl_prat()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getVl_jur()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getVl_jur_min()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getVl_jur_max()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getCod_cnc()));
		sb.append("|").append(Util.preencheRegistro(registroX320.getTip_moeda()));
		sb.append("|").append('\n');
		return sb;
	}

}
