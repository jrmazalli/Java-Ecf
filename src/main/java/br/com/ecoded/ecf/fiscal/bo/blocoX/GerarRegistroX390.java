package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX390;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX390 {

	public static StringBuilder gerar(RegistroX390 registroX390, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX390.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX390.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX390.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX390.getValor()));
		sb.append("|").append('\n');
		return sb;
	}
	
}
