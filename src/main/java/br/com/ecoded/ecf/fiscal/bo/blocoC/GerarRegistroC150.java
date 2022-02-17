package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC150;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC150 {

	public static StringBuilder gerar(RegistroC150 registroC150, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC150.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC150.getDt_fin()));
		sb.append("|").append('\n');
		return sb;
	}
}
