package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX450;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX450 {
	
	public static StringBuilder gerar(RegistroX450 registroX450, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX450.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_serv_assist()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_serv_sem_assist()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_serv_sem_assist_ext()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_juro_pf()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_juro_pj()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_demais_juros()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_divid_pf()));
		sb.append("|").append(Util.preencheRegistro(registroX450.getVl_divid_pj()));
		sb.append("|").append('\n');
		return sb;
	}

}
