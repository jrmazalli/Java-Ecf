package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP150;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroP150 {
	
	public static StringBuilder gerar(RegistroP150 registroP150, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroP150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getTipo()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroP150.getInd_valor()));
		sb.append("|").append('\n');
		return sb;
	}

}
