package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0021;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0021 {
	
	public static StringBuilder gerar(Registro0021 registro0021, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0021.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_repes()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_recap()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_padis()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_patvd()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_reidi()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_repenec()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_reicomp()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_retaero()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_recine()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_residuos_solidos()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_recopa()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_copa_do_mundo()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_retid()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_repnbl_redes()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_reinf()));
		sb.append("|").append(Util.preencheRegistro(registro0021.getInd_olimpiadas()));
		sb.append("|").append('\n');
		return sb;
	}

}
