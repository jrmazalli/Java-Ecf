package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM360;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM360 {
	
	public static StringBuilder gerar(RegistroM360 registroM360, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM360.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM360.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM360.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroM360.getVl_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM360.getInd_vl_cta()));
		sb.append("|").append('\n');
		return sb;
	}

}
