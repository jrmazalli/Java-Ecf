package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX357;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX357 {
	
	public static StringBuilder gerar(RegistroX357 registroX357, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX357.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX357.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX357.getNif_cnpj()));
		sb.append("|").append(Util.preencheRegistro(registroX357.getRazao_social()));
		sb.append("|").append(Util.preencheRegistro(registroX357.getPercentual()));
		sb.append("|").append('\n');
		return sb;
	}

}
