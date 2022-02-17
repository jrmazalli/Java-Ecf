package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT150;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT150 {
	
	public static StringBuilder gerar(RegistroT150 registroT150, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT150.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroT150.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroT150.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
