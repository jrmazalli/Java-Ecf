package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN620;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN620 {
	
	public static StringBuilder gerar(RegistroN620 registroN620, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN620.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN620.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN620.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN620.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
