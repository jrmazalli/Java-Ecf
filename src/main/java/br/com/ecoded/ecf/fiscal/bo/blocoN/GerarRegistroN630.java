package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN630;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN630 {
	
	public static StringBuilder gerar(RegistroN630 registroN630, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN630.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN630.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN630.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN630.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
