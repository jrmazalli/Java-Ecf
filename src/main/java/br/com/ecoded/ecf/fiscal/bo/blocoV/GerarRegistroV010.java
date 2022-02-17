package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV010;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroV010 {
	
	public static StringBuilder gerar(RegistroV010 registroV010, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroV010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroV010.getNome_instituicao()));
		sb.append("|").append(Util.preencheRegistro(registroV010.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroV010.getTip_moeda()));
		sb.append("|").append('\n');
		return sb;
	}

}
