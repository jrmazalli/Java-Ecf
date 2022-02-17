package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM355;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM355 {
	
	public static StringBuilder gerar(RegistroM355 registroM355, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM355.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM355.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registroM355.getVl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM355.getInd_vl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM355.getInd_vl_cta()));
		sb.append("|").append('\n');
		return sb;
	}

}
