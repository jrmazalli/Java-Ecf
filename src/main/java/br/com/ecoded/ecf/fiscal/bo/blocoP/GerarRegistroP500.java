package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP500;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP500 {
	
	public static StringBuilder gerar(RegistroP500 registroP500, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP500.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP500.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP500.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
