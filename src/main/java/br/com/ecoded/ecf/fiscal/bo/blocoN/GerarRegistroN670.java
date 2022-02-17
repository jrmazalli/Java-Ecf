package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN670;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN670 {
	
	public static StringBuilder gerar(RegistroN670 registroN670, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN670.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN670.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN670.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN670.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
