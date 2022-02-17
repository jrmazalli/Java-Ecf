package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW200;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroW200 {
	
	public static StringBuilder gerar(RegistroW200 registroW200, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroW200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getJurisdicao()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_rec_nao_rel_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_rec_nao_rel()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_rec_rel_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_rec_rel()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_rec_total_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_rec_total()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_luc_prej_antes_ir_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_luc_prej_antes_ir()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_ir_pago_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_ir_pago()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_ir_devido_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_ir_devido()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_cap_soc_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_cap_soc()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_luc_acum_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_luc_acum()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_ativ_tang_est()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getVl_ativ_tang()));
		sb.append("|").append(Util.preencheRegistro(registroW200.getNum_emp()));
		sb.append("|").append('\n');
		return sb;
	}

}
