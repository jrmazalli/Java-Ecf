package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM350;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM350 {
	
	public static StringBuilder gerar(RegistroM350 registroM350, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM350.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getTipo_lancamento()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getInd_relacao()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getHist_lan_lal()));
		sb.append("|").append('\n');
		return sb;
	}

}
