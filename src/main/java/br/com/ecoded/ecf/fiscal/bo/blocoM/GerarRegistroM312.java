package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM312;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM312 {

	public static StringBuilder gerar(RegistroM312 registroM312, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM312.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM312.getNum_lcto()));
		sb.append("|").append('\n');
		return sb;
	}

}
