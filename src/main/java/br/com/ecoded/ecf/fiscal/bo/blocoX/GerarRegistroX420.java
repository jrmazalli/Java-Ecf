package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX420;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroX420 {
	
	public static StringBuilder gerar(RegistroX420 registroX420, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroX420.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getTip_roy()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_dir_sw()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_dir_aut()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_marca()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_pat()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_know()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_franq()));
		sb.append("|").append(Util.preencheRegistro(registroX420.getVl_expl_int()));
		sb.append("|").append('\n');
		return sb;
	}

}
