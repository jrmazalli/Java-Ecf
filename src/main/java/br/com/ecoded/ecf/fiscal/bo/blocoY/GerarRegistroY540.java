package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY540;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY540 {

	public static StringBuilder gerar(RegistroY540 registroY540, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY540.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY540.getCnpj_estab()));
		sb.append("|").append(Util.preencheRegistro(registroY540.getVl_rec_estab()));
		sb.append("|").append(Util.preencheRegistro(registroY540.getCnae()));
		sb.append("|").append('\n');
		return sb;
	}

}
