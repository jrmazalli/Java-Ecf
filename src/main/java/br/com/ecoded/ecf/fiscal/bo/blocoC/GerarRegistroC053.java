package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC053;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC053 {
	
	public static StringBuilder gerar(RegistroC053 registroC053, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC053.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC053.getCod_idt()));
		sb.append("|").append(Util.preencheRegistro(registroC053.getCod_cnt_corr()));
		sb.append("|").append(Util.preencheRegistro(registroC053.getNat_sub_cnt()));
		sb.append("|").append('\n');
		return sb;
	}

}
