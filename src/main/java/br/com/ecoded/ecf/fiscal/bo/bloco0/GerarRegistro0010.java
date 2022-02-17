package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0010;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0010 {

	public static StringBuilder gerar(Registro0010 registro0010, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getHash_ecf_anterior()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getOpt_refis()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getOpt_paes()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getForma_trib()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getForma_apur()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getCod_qualif_pj()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getForma_trib_per()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getMes_bal_red()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getTip_esc_pre()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getTip_ent()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getForma_apur_i()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getApur_csll()));
		sb.append("|").append(Util.preencheRegistro(registro0010.getInd_rec_receita()));
		sb.append("|").append('\n');
		return sb;
	}

}
