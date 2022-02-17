package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY550;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY550 {
	
	public static StringBuilder gerar(RegistroY550 registroY550, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY550.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY550.getCnpj_exp()));
		sb.append("|").append(Util.preencheRegistro(registroY550.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registroY550.getVl_venda()));
		sb.append("|").append('\n');
		return sb;
	}

}
