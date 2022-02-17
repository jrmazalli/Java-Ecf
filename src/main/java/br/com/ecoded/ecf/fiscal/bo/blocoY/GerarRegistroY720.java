package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY720;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY720 {
	
	public static StringBuilder gerar(RegistroY720 registroY720, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY720.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY720.getLuc_liq()));
		sb.append("|").append(Util.preencheRegistro(registroY720.getDt_luc_liq()));
		sb.append("|").append(Util.preencheRegistro(registroY720.getRec_brut_ant()));
		sb.append("|").append('\n');
		return sb;
	}

}
