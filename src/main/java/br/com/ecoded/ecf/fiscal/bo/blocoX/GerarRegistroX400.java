package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX400;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX400 {
	
	public static StringBuilder gerar(RegistroX400 registroX400, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX400.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX400.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX400.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX400.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
