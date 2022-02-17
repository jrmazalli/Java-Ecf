package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX460;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX460 {
	
	public static StringBuilder gerar(RegistroX460 registroX460, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX460.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX460.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX460.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX460.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
