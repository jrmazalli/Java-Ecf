package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX292;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX292 {
	
	public static StringBuilder gerar(RegistroX292 registroX292, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX292.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX292.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX292.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX292.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
