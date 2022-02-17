package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0990 {

	public static StringBuilder gerar(Registro0990 registro0990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0990.getQtd_lin_0()));
		sb.append("|").append('\n');
		return sb;
	}
}
