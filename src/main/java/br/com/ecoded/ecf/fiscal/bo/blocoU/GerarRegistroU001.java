package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroU001 {
	
	public static StringBuilder gerar(RegistroU001 registroU001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroU001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroU001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}

}
