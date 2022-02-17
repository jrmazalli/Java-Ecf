package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM315;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM315 {
	
	public static StringBuilder gerar(RegistroM315 registroM315, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM315.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroM315.getNum_proc()));
		sb.append("|").append('\n');
		return sb;
	}

}
