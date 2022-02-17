package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY800;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY800 {
	
	public static StringBuilder gerar(RegistroY800 registroY800, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY800.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY800.getTipo_doc()));
		sb.append("|").append(Util.preencheRegistro(registroY800.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroY800.getHash()));
		sb.append("|").append(Util.preencheRegistro(registroY800.getArq_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroY800.getInd_fim_rtf()));
		sb.append("|").append('\n');
		return sb;
	}

}
