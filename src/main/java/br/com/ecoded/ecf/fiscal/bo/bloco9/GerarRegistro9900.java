package br.com.ecoded.ecf.fiscal.bo.bloco9;

import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro9900 {

	public static StringBuilder gerar(Registro9900 registro9900, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro9900.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9900.getReg_blc()));
		sb.append("|").append(Util.preencheRegistro(registro9900.getQtd_reg_blc()));
		sb.append("|").append('\n');
		return sb;
	}
}
