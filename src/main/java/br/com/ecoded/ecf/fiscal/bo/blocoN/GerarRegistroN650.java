package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN650;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN650 {
	
	public static StringBuilder gerar(RegistroN650 registroN650, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN650.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN650.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN650.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN650.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
