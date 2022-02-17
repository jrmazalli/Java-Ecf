package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT170;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT170 {
	
	public static StringBuilder gerar(RegistroT170 registroT170, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT170.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT170.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroT170.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroT170.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
