package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV020;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroV020 {
	
	public static StringBuilder gerar(RegistroV020 registroV020, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroV020.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroV020.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroV020.getEndereco()));
		sb.append("|").append(Util.preencheRegistro(registroV020.getTipo_do_c()));
		sb.append("|").append(Util.preencheRegistro(registroV020.getNi()));
		sb.append("|").append(Util.preencheRegistro(registroV020.getIdent_conta()));
		sb.append("|").append('\n');
		return sb;
	}

}
