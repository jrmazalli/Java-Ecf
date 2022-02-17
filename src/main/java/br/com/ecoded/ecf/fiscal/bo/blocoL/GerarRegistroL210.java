package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL210;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL210 {
	
	public static StringBuilder gerar(RegistroL210 registroL210, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL210.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroL210.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroL210.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
