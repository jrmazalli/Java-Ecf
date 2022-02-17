package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroK030 {

	public static StringBuilder gerar(RegistroK030 registroK030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroK030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroK030.getDt_fin()));
		sb.append("|").append('\n');
		return sb;
	}
}
