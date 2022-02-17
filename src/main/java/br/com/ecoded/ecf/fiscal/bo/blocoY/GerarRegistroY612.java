package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY612;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY612 {

	public static StringBuilder gerar(RegistroY612 registroY612, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY612.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY612.getCpf()));
		sb.append("|").append(Util.preencheRegistro(registroY612.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroY612.getQualif()));
		sb.append("|").append(Util.preencheRegistro(registroY612.getVl_rem_trab()));
		sb.append("|").append(Util.preencheRegistro(registroY612.getVl_dem_rend()));
		sb.append("|").append(Util.preencheRegistro(registroY612.getVl_ir_ret()));
		sb.append("|").append('\n');
		return sb;
	}

}
