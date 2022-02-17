package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY671;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY671 {

	public static StringBuilder gerar(RegistroY671 registroY671, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY671.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_aq_maq()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_doa_crianca()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_doa_idoso()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_aq_imobilizado()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_bx_imobilizado()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_inc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_inc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_csll_deprec_ini()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_oc_sem_iof()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_folha_aliq_red()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getVl_aliq_red()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getInd_alter_capital()));
		sb.append("|").append(Util.preencheRegistro(registroY671.getInd_bcn_csll()));
		sb.append("|").append('\n');
		return sb;
	}
	
}
