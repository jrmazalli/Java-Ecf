package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX350;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX350 {
	
	public static StringBuilder gerar(RegistroX350 registroX350, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX350.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getRec_liq()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getCustos()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getLuc_bruto()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getRec_auferidas()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getRec_outras_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getDesp_brasil()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getDesp_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getLuc_oper()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getRec_partic()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getRec_outras()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getDesp_outras()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getLuc_liq_ant_ir()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getImp_dev()));
		sb.append("|").append(Util.preencheRegistro(registroX350.getLuc_liq()));
		sb.append("|").append('\n');
		return sb;
	}

}
