package br.com.ecoded.ecf.fiscal.bo.bloco0;

import java.util.Optional;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0000;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarRegistro0000 {

	public static StringBuilder gerar(EcfFiscal ecfFiscal, Registro0000 registro0000, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0000.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getNome_esc()));
		sb.append("|").append(Util.preencheRegistro(Optional.ofNullable(registro0000.getCod_ver()).orElse(Util.getCodVersao(ecfFiscal))));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getNome()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_sit_ini_per()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getSit_especial()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getPat_reman_cis()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getDt_sit_esp()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getRetificadora()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getNum_rec()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getTip_ecf()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCod_scp()));
		sb.append("|").append('\n');
		return sb;
	}
}

