package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL300;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroL300 {
	
	public static StringBuilder gerar(RegistroL300 registroL300, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroL300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroL300.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroL300.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroL300.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
