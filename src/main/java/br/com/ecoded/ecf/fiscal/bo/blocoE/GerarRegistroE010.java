package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE010;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroE010 {

	public static StringBuilder gerar(RegistroE010 registroE010, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroE010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE010.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroE010.getCod_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registroE010.getDesc_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registroE010.getVal_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registroE010.getInd_val_cta_ref()));
		sb.append("|").append('\n');
		return sb;
	}

}
