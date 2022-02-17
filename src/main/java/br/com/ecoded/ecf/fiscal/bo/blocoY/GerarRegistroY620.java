package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY620;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY620 {

	public static StringBuilder gerar(RegistroY620 registroY620, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY620.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getDt_evento()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getInd_relac()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getPais()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getNome_emp()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getValor_reais()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getValor_estr()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getPerc_cap_tot()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getPerc_cap_vot()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getRes_eq_pat()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getData_aquis()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getInd_proc_cart()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getNum_proc_cart()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getNome_cart()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getInd_proc_rfb()));
		sb.append("|").append(Util.preencheRegistro(registroY620.getNum_proc_rfb()));
		sb.append("|").append('\n');
		return sb;
	}

}
