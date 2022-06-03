package br.com.ecoded.ecf.fiscal.bo.blocoC;

import java.util.Optional;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC040;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistroC040 {

	public static StringBuilder gerar(EcfFiscal ecfFiscal, RegistroC040 registroC040, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registroC040.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getHash_ecd()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_sit_esp()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getNum_ord()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getNire()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getNat_livr()));
		sb.append("|").append(Util.preencheRegistro(Optional.ofNullable(registroC040.getCod_ver_lc()).orElse(Util.getCodVersao(ecfFiscal))));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_esc()));
		sb.append("|").append('\n');
		return sb;
	}
}
