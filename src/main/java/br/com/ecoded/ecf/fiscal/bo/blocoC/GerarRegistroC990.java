package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC990 {

	public static StringBuilder gerar(RegistroC990 registroC990, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC990.getQtd_lin_c()));
		sb.append("|").append('\n');
		return sb;
	}
}
