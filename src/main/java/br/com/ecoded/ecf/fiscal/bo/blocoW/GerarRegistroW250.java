package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW250;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroW250 {
	
	public static StringBuilder gerar(RegistroW250 registroW250, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroW250.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getJur_diferente()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getTin()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getJurisdicao_tin()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getNi()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getJurisdicao_ni()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getTipo_ni()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getTip_end()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getEndereco()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getNum_tel()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getEmail()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_1()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_2()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_3()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_4()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_5()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_6()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_7()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_8()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_9()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_10()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_11()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_12()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getAtiv_13()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getDesc_outros()));
		sb.append("|").append(Util.preencheRegistro(registroW250.getObservacao()));
		sb.append("|").append('\n');
		return sb;
	}

}
