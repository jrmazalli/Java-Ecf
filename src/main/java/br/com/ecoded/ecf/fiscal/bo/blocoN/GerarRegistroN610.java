package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN610;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroN610 {
	
	public static StringBuilder gerar(RegistroN610 registroN610, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroN610.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroN610.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroN610.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroN610.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
