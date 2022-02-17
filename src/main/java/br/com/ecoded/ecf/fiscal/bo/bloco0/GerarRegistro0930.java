package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0930;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0930 {
	
	public static StringBuilder gerar(Registro0930 registro0930, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0930.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0930.getIdent_nom()));
		sb.append("|").append(Util.preencheRegistro(registro0930.getIdent_cpf_cnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0930.getIdent_qualif()));
		sb.append("|").append(Util.preencheRegistro(registro0930.getInd_crc()));
		sb.append("|").append(Util.preencheRegistro(registro0930.getEmail()));
		sb.append("|").append(Util.preencheRegistro(registro0930.getFone()));
		sb.append("|").append('\n');
		return sb;
	}

}
