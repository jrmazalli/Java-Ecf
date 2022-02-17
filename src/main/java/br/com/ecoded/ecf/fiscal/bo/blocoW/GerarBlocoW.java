package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoW.BlocoW;
import br.com.ecoded.ecf.fiscal.registros.blocoW.BlocoWEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoW {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoW blocoW = ecfFiscal.getBlocoW();
		sb = sbr;

		// REGISTROT001
		if (!Util.isEmpty(blocoW.getRegistroW001())) {
			GerarRegistroW001.gerar(blocoW.getRegistroW001(), sb);
			ecfFiscal.getContadoresBlocoW().incrementar(BlocoWEnum.RegistroW001);
		}

		// REGISTROT100
		if (!Util.isEmpty(blocoW.getRegistroW100())) {
			GerarRegistroW100.gerar(blocoW.getRegistroW100(), sb);
			ecfFiscal.getContadoresBlocoW().incrementar(BlocoWEnum.RegistroW100);
		}

		// REGISTROT200
		if (!Util.isEmpty(blocoW.getRegistroW200())) {
			GerarRegistroW200.gerar(blocoW.getRegistroW200(), sb);
			ecfFiscal.getContadoresBlocoW().incrementar(BlocoWEnum.RegistroW200);
		}

		// REGISTROT250
		if (!Util.isEmpty(blocoW.getRegistroW250())) {
			GerarRegistroW250.gerar(blocoW.getRegistroW250(), sb);
			ecfFiscal.getContadoresBlocoW().incrementar(BlocoWEnum.RegistroW250);
		}

		// REGISTROT300
		if (!Util.isEmpty(blocoW.getRegistroW300())) {
			GerarRegistroW300.gerar(blocoW.getRegistroW300(), sb);
			ecfFiscal.getContadoresBlocoW().incrementar(BlocoWEnum.RegistroW300);
		}

		// REGISTROT990
		if (ecfFiscal.getContadoresBlocoW().getContRegistroW990() > 0) {
			RegistroW990 registroW990 = new RegistroW990();
			registroW990.setQtd_lin_w(String.valueOf(ecfFiscal.getContadoresBlocoW().getContRegistroW990() + 1));

			blocoW.setRegistroW990(registroW990);
			GerarRegistroW990.gerar(blocoW.getRegistroW990(), sb);
		}

		return sb;
	}

}
