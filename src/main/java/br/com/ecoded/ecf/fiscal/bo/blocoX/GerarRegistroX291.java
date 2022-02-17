package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX291;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX291 {
	
	public static StringBuilder gerar(RegistroX291 registroX291, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX291.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX291.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX291.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX291.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
