package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX280;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX280 {

	public static StringBuilder gerar(RegistroX280 registroX280, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX280.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX280.getInd_ativ()));
		sb.append("|").append(Util.preencheRegistro(registroX280.getInd_proj()));
		sb.append("|").append(Util.preencheRegistro(registroX280.getAto_conc()));
		sb.append("|").append(Util.preencheRegistro(registroX280.getVig_ini()));
		sb.append("|").append(Util.preencheRegistro(registroX280.getVig_fim()));
		sb.append("|").append('\n');
		return sb;
	}

}
