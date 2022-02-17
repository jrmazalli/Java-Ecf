package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN600;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN600 {

	public static StringBuilder gerar(RegistroN600 registroN600, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN600.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN600.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN600.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
