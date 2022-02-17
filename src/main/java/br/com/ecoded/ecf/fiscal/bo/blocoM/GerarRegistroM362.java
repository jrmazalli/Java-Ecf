package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM362;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM362 {
	
	public static StringBuilder gerar(RegistroM362 registroM362, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM362.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM362.getNum_lcto()));
		sb.append("|").append('\n');
		return sb;
	}

}
