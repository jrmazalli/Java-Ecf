package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX353;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX353 {

	
	public static StringBuilder gerar(RegistroX353 registroX353, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX353.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX353.getRes_neg_util()));
		sb.append("|").append(Util.preencheRegistro(registroX353.getRes_neg_util_real()));
		sb.append("|").append(Util.preencheRegistro(registroX353.getSaldo_res_neg_nao_util()));
		sb.append("|").append(Util.preencheRegistro(registroX353.getSaldo_res_neg_nao_util_real()));
		sb.append("|").append(Util.preencheRegistro(registroX353.getResp_prop()));
		sb.append("|").append(Util.preencheRegistro(registroX353.getRes_prop_real()));
		sb.append("|").append('\n');
		return sb;
	}
}
