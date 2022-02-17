package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX410;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX410 {
	
	public static StringBuilder gerar(RegistroX410 registroX410, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX410.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX410.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX410.getInd_home_disp()));
		sb.append("|").append(Util.preencheRegistro(registroX410.getInd_serv_disp()));
		sb.append("|").append('\n');
		return sb;
	}

}
