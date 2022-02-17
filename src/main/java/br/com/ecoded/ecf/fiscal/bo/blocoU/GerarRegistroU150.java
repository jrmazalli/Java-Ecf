package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU150;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU150 {
	
	public static StringBuilder gerar(RegistroU150 registroU150, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getTipo()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroU150.getInd_valor()));
		sb.append("|").append('\n');
		return sb;
	}

}
