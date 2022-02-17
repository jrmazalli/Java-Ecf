package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM365;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroM365 {
	
	public static StringBuilder gerar(RegistroM365 registroM365, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroM365.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM365.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroM365.getNum_proc()));
		sb.append("|").append('\n');
		return sb;
	}

}
