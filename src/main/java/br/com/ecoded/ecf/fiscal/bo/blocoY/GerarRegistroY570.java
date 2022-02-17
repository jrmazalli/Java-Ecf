package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY570;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY570 {

	public static StringBuilder gerar(RegistroY570 registroY570, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY570.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getCnpj_fon()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getNome_emp()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getInd_org_pub()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getCod_rec()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getVl_rend()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getIr_ret()));
		sb.append("|").append(Util.preencheRegistro(registroY570.getCsll_ret()));
		sb.append("|").append('\n');
		return sb;
	}

}
