package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM300;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM300 {
	
	public static StringBuilder gerar(RegistroM300 registroM300, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getTipo_lancamento()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getInd_relacao()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getHist_lan_lal()));
		sb.append("|").append('\n');
		return sb;
	}

}
