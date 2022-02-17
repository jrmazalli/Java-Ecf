package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM415;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM415 {
	
	public static StringBuilder gerar(RegistroM415 registroM415, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM415.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM415.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroM415.getNum_proc()));
		sb.append("|").append('\n');
		return sb;
	}

}
