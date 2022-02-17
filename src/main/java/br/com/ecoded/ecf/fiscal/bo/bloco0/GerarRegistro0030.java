package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0030;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0030 {
	
	public static StringBuilder gerar(Registro0030 registro0030, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getCnae_fiscal()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getEndereco()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getNum()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getCompl()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getBairro()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getUf()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getCod_mun()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getCep()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getNum_tel()));
		sb.append("|").append(Util.preencheRegistro(registro0030.getEmail()));
		sb.append("|").append('\n');
		return sb;
	}

}
