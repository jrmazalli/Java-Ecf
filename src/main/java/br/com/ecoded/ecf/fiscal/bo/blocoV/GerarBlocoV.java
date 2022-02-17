package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoV.BlocoV;
import br.com.ecoded.ecf.fiscal.registros.blocoV.BlocoVEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoV {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoV blocoV = ecfFiscal.getBlocoV();
		sb = sbr;

		// REGISTROT001
		if (!Util.isEmpty(blocoV.getRegistroV001())) {
			GerarRegistroV001.gerar(blocoV.getRegistroV001(), sb);
			ecfFiscal.getContadoresBlocoV().incrementar(BlocoVEnum.RegistroV001);
		}

		// REGISTROT010
		if (!Util.isEmpty(blocoV.getRegistroV010())) {
			GerarRegistroV010.gerar(blocoV.getRegistroV010(), sb);
			ecfFiscal.getContadoresBlocoV().incrementar(BlocoVEnum.RegistroV010);
		}

		// REGISTROT020
		if (!Util.isEmpty(blocoV.getRegistroV020())) {
			GerarRegistroV020.gerar(blocoV.getRegistroV020(), sb);
			ecfFiscal.getContadoresBlocoV().incrementar(BlocoVEnum.RegistroV020);
		}

		// REGISTROT030
		if (!Util.isEmpty(blocoV.getRegistroV030())) {
			GerarRegistroV030.gerar(blocoV.getRegistroV030(), sb);
			ecfFiscal.getContadoresBlocoV().incrementar(BlocoVEnum.RegistroV030);
		}

		// REGISTROT120
		if (!Util.isEmpty(blocoV.getRegistroV100())) {
			GerarRegistroV100.gerar(blocoV.getRegistroV100(), sb);
			ecfFiscal.getContadoresBlocoV().incrementar(BlocoVEnum.RegistroV100);
		}

		// REGISTROT990
		if (ecfFiscal.getContadoresBlocoV().getContRegistroV990() > 0) {
			RegistroV990 registroV990 = new RegistroV990();
			registroV990.setQtd_lin_m(String.valueOf(ecfFiscal.getContadoresBlocoV().getContRegistroV990() + 1));

			blocoV.setRegistroV990(registroV990);
			GerarRegistroV990.gerar(blocoV.getRegistroV990(), sb);
		}

		return sb;
	}

}
