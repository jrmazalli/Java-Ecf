package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP300;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP300 {
	
	public static StringBuilder gerar(RegistroP300 registroP300, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP300.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP300.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP300.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
