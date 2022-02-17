package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP230;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP230 {
	
	public static StringBuilder gerar(RegistroP230 registroP230, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP230.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP230.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP230.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP230.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
