package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN500;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN500 {

	public static StringBuilder gerar(RegistroN500 registroN030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN030.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN030.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN030.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
