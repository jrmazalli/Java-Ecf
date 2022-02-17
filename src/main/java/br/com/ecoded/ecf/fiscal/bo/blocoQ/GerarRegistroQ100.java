package br.com.ecoded.ecf.fiscal.bo.blocoQ;

import br.com.ecoded.ecf.fiscal.registros.blocoQ.RegistroQ100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroQ100 {
	
	public static StringBuilder gerar(RegistroQ100 registroQ100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroQ100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroQ100.getData()));
		sb.append("|").append(Util.preencheRegistro(registroQ100.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroQ100.getHist()));
		sb.append("|").append(Util.preencheRegistro(registroQ100.getVl_entrada()));
		sb.append("|").append(Util.preencheRegistro(registroQ100.getVl_saida()));
		sb.append("|").append(Util.preencheRegistro(registroQ100.getSld_fin()));
		sb.append("|").append('\n');
		return sb;
	}

}
