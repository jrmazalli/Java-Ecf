package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX340;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX340 {
	
	public static StringBuilder gerar(RegistroX340 registroX340, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX340.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getRaz_social()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getNif()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getInd_controle()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getInd_isen_petr()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getInd_consol()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getMot_nao_consol()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroX340.getTip_moeda()));
		sb.append("|").append('\n');
		return sb;
	}

}
