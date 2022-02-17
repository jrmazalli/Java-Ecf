package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY520;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY520 {
	
	public static StringBuilder gerar(RegistroY520 registroY520, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY520.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY520.getTip_ext()));
		sb.append("|").append(Util.preencheRegistro(registroY520.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroY520.getForma()));
		sb.append("|").append(Util.preencheRegistro(registroY520.getNat_oper()));
		sb.append("|").append(Util.preencheRegistro(registroY520.getVl_periodo()));
		sb.append("|").append('\n');
		return sb;
	}

}
