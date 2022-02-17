package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY600;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY600 {
	
	public static StringBuilder gerar(RegistroY600 registroY600, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getDt_alt_soc()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getDt_fim_soc()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getInd_qualif()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getCpf_cnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getNom_emp()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getQualif()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getPerc_cap_tot()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getPerc_cap_vot()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getCpf_rep_leg()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getQualif_rep_leg()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getVl_rem_trab()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getVl_luc_div()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getVl_jur_cap()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getVl_dem_rend()));
		sb.append("|").append(Util.preencheRegistro(registroY600.getVl_ir_ret()));
		sb.append("|").append('\n');
		return sb;
	}

}
