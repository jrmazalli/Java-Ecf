package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY672;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroY672 {
	
	public static StringBuilder gerar(RegistroY672 registroY672, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroY672.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_capital_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_capital()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_estoque_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_estoques()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_caixa_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_caixa()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_aplic_fin_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_aplic_fin()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_cta_rec_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_cta_rec()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_cta_pag_ant()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_cta_pag()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_compra_merc()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_compra_ativo()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getVl_receitas()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getTot_ativo()));
		sb.append("|").append(Util.preencheRegistro(registroY672.getInd_aval_estoq()));
		sb.append("|").append('\n');
		return sb;
	}

}
