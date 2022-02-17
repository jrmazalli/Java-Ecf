package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY690;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY690 {
	
	public static StringBuilder gerar(RegistroY690 registroY690, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY690.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY690.getMes()));
		sb.append("|").append(Util.preencheRegistro(registroY690.getVl_rec_bru()));
		sb.append("|").append('\n');
		return sb;
	}

}
