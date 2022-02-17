package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX352;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX352 {
	
	public static StringBuilder gerar(RegistroX352 registroX352, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX352.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX352.getRes_per()));
		sb.append("|").append(Util.preencheRegistro(registroX352.getRes_per_real()));
		sb.append("|").append(Util.preencheRegistro(registroX352.getLuc_disp()));
		sb.append("|").append(Util.preencheRegistro(registroX352.getLuc_disp_real()));
		sb.append("|").append('\n');
		return sb;
	}

}
