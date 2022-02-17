package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU180;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU180 {
	
	public static StringBuilder gerar(RegistroU180 registroU180, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU180.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU180.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroU180.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroU180.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
