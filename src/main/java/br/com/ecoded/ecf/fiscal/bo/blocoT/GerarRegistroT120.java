package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT120;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT120 {
	
	public static StringBuilder gerar(RegistroT120 registroT120, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT120.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT120.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroT120.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroT120.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
