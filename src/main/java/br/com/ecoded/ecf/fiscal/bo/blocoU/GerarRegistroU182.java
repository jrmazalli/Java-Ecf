package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU182;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU182 {
	
	public static StringBuilder gerar(RegistroU182 registroU182, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU182.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU182.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroU182.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroU182.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
