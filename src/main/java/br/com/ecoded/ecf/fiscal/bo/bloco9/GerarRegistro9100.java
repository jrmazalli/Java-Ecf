package br.com.ecoded.ecf.fiscal.bo.bloco9;

import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9100;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro9100 {
	
	public static StringBuilder gerar(Registro9100 registro9100, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro9100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getNome_regra()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getMsg_regra()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getRegistro()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCampo()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getConteudo()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getValor_esperado()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getPer_apur()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCod_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCodigo()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getNum_ordem()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCnpj_estab()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCnae()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCod_cta_b()));
		sb.append("|").append(Util.preencheRegistro(registro9100.getCod_tributo()));
		sb.append("|").append('\n');
		return sb;
	}

}
