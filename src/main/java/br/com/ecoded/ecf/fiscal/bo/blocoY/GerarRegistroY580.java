package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY580;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY580 {

	public static StringBuilder gerar(RegistroY580 registroY580, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY580.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY580.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY580.getTip_benef()));
		sb.append("|").append(Util.preencheRegistro(registroY580.getForm_doa()));
		sb.append("|").append(Util.preencheRegistro(registroY580.getVl_doa()));
		sb.append("|").append('\n');
		return sb;
	}

}
