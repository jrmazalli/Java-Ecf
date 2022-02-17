package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX500;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX500 {
	
	public static StringBuilder gerar(RegistroX500 registroX500, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX500.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX500.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX500.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
