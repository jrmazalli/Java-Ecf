package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC050;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC050 {
	
	public static StringBuilder gerar(RegistroC050 registroC050, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC050.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getInd_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroC050.getCta()));
		sb.append("|").append('\n');
		return sb;
	}

}
