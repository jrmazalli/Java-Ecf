package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN660;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN660 {
	
	public static StringBuilder gerar(RegistroN660 registroN660, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN660.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN660.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN660.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN660.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
