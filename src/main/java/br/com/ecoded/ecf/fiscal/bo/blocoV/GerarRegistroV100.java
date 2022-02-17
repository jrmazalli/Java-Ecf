package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroV100 {
	
	public static StringBuilder gerar(RegistroV100 registroV100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroV100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroV100.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroV100.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroV100.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
