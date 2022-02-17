package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX510;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX510 {
	
	public static StringBuilder gerar(RegistroX510 registroX510, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX510.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX510.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX510.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
