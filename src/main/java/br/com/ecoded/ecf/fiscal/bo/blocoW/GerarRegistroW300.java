package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW300;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroW300 {
	
	public static StringBuilder gerar(RegistroW300 registroW300, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroW300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getJurisdicao()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_rec_nao_rel()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_rec_rel()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_rec_total()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_luc_prej_antes_ir()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_ir_pago()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_ir_devido()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_cap_soc()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_luc_acum()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_ativ_tang()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getInd_num_emp()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getObservacao()));
		sb.append("|").append(Util.preencheRegistro(registroW300.getFim_observacao()));
		sb.append("|").append('\n');
		return sb;
	}

}
