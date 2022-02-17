package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC100 {

	public static StringBuilder gerar(RegistroC100 registroC100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC100.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registroC100.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroC100.getCcus()));
		sb.append("|").append('\n');
		return sb;
	}

}
