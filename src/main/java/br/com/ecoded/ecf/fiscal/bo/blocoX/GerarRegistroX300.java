package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX300;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX300 {
	
	public static StringBuilder gerar(RegistroX300 registroX300, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getNum_ordem()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getTip_exp()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getDesc_exp()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getTot_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getQtde()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getUni_med()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getInd_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getTip_met()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getVl_par()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getVl_prat()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getVl_jur()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getVl_jur_min()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getVl_jur_max()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getCod_cnc()));
		sb.append("|").append(Util.preencheRegistro(registroX300.getTip_moeda()));
		sb.append("|").append('\n');
		return sb;
	}

}
