package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY640;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY640 {

	public static StringBuilder gerar(RegistroY640 registroY640, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY640.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY640.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY640.getCond_decl()));
		sb.append("|").append(Util.preencheRegistro(registroY640.getVl_cons()));
		sb.append("|").append(Util.preencheRegistro(registroY640.getCnpj_lid()));
		sb.append("|").append(Util.preencheRegistro(registroY640.getVl_decl()));
		sb.append("|").append('\n');
		return sb;
	}
}
