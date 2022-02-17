package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX470;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX470 {
	
	public static StringBuilder gerar(RegistroX470 registroX470, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX470.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX470.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroX470.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroX470.getValor()));
		sb.append("|").append('\n');
		return sb;
	}

}
