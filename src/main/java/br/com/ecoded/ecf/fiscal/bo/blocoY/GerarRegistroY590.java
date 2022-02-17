package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY590;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY590 {
	
	public static StringBuilder gerar(RegistroY590 registroY590, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY590.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY590.getTip_ativo()));
		sb.append("|").append(Util.preencheRegistro(registroY590.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroY590.getDiscriminacao()));
		sb.append("|").append(Util.preencheRegistro(registroY590.getVl_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY590.getVl_atual()));
		sb.append("|").append('\n');
		return sb;
	}

}
