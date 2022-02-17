package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT181;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroT181 {
	
	public static StringBuilder gerar(RegistroT181 registroT181, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroT181.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroT181.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroT181.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroT181.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
