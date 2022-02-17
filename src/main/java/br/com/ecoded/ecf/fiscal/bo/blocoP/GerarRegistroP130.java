package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP130;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP130 {
	
	public static StringBuilder gerar(RegistroP130 registroP130, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP130.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP130.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP130.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP130.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
