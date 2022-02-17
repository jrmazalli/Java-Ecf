package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE015;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE015 {

	public static StringBuilder gerar(RegistroE015 registroE015, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE015.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE015.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroE015.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroE015.getDesc_cta()));
		sb.append("|").append(Util.preencheRegistro(registroE015.getVal_cta()));
		sb.append("|").append(Util.preencheRegistro(registroE015.getInd_val_cta()));
		sb.append("|").append('\n');
		return sb;
	}

}
