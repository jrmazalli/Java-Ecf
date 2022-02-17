package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC157;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC157 {
	
	public static StringBuilder gerar(RegistroC157 registroC157, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC157.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC157.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC157.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroC157.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC157.getInd_vl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC157.getLinha_ecd()));
		sb.append("|").append('\n');
		return sb;
	}

}
