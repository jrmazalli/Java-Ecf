package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY560;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY560 {
	
	public static StringBuilder gerar(RegistroY560 registroY560, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY560.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY560.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY560.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registroY560.getVl_compra()));
		sb.append("|").append(Util.preencheRegistro(registroY560.getVl_exp()));
		sb.append("|").append('\n');
		return sb;
	}

}
