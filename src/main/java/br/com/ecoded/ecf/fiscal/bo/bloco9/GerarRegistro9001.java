package br.com.ecoded.ecf.fiscal.bo.bloco9;

import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro9001 {

	public static StringBuilder gerar(Registro9001 registro9001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro9001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}
}
