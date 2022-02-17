package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX480;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX480 {
	
	public static StringBuilder gerar(RegistroX480 registroX480, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX480.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX480.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX480.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX480.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
