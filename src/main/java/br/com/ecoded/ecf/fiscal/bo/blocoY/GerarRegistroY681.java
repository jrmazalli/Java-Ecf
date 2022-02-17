package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY681;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY681 {
	
	public static StringBuilder gerar(RegistroY681 registroY681, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY681.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY681.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroY681.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroY681.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
