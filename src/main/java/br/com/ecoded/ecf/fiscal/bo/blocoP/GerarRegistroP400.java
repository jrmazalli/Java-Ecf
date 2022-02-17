package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP400;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP400 {
	
	public static StringBuilder gerar(RegistroP400 registroP400, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP400.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP400.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP400.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP400.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
