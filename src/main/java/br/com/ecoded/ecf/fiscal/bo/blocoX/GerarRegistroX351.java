package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX351;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX351 {
	
	public static StringBuilder gerar(RegistroX351 registroX351, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX351.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_inv_per()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_inv_per_real()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_isen_petr_per()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_isen_petr_per_real()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_neg_acum()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_pos_trib()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getRes_pos_trib_real()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_lucr()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_lucr_real()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_pag_rend()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_pag_rend_real()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_ret_ext()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_ret_ext_real()));
		sb.append("|").append(Util.preencheRegistro(registroX351.getImp_ret_br()));
		sb.append("|").append('\n');
		return sb;
	}

}
