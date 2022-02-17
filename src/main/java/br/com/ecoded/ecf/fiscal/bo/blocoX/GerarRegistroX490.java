package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX490;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX490 {
	
	public static StringBuilder gerar(RegistroX490 registroX490, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX490.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX490.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX490.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX490.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
