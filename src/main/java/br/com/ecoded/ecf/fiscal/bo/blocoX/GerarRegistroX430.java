package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX430;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX430 {
	
	public static StringBuilder gerar(RegistroX430 registroX430, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX430.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getVl_serv_assist()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getVl_serv_sem_assist()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getVl_serv_sem_assist_ext()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getVl_juro()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getVl_demais_juros()));
		sb.append("|").append(Util.preencheRegistro(registroX430.getVl_divid()));
		sb.append("|").append('\n');
		return sb;
	}

}
