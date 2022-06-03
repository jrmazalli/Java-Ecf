package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0020;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0020 {
	
	public static StringBuilder gerar(Registro0020 registro0020, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0020.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_aliq_csll()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_qte_scp()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_adm_fun_clu()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_part_cons()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_op_ext()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_op_vinc()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_pj_enquad()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_part_ext()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_ativ_rural()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_luc_exp()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_red_isen()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_fin()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_part_colig()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_rec_ext()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_ativ_ext()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_pgt_ext()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_ecom_ti()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_roy_rec()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_roy_pag()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_rend_serv()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_pgto_rem()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_inov_tec()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_cap_inf()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_pj_hab()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_polo_am()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_zon_exp()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_area_com()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_pais_a_pais()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_derex()));
		sb.append("|").append('\n');
		return sb;
	}

}
