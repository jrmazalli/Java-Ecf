package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP200;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP200 {
	
	public static StringBuilder gerar(RegistroP200 registroP200, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
