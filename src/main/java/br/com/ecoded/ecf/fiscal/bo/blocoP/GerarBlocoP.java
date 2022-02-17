package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoP.BlocoP;
import br.com.ecoded.ecf.fiscal.registros.blocoP.BlocoPEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoP {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoP blocoP = ecfFiscal.getBlocoP();
		sb = sbr;

		// REGISTROP001
		if (!Util.isEmpty(blocoP.getRegistroP001())) {
			GerarRegistroP001.gerar(blocoP.getRegistroP001(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP001);
		}

		// REGISTROP030
		if (!Util.isEmpty(blocoP.getRegistroP030())) {
			GerarRegistroP030.gerar(blocoP.getRegistroP030(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP030);
		}

		// REGISTROP100
		if (!Util.isEmpty(blocoP.getRegistroP100())) {
			GerarRegistroP100.gerar(blocoP.getRegistroP100(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP100);
		}

		// REGISTROP130
		if (!Util.isEmpty(blocoP.getRegistroP150())) {
			GerarRegistroP150.gerar(blocoP.getRegistroP150(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP150);
		}

		// REGISTROP150
		if (!Util.isEmpty(blocoP.getRegistroP130())) {
			GerarRegistroP130.gerar(blocoP.getRegistroP130(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP130);
		}

		// REGISTROP200
		if (!Util.isEmpty(blocoP.getRegistroP200())) {
			GerarRegistroP200.gerar(blocoP.getRegistroP200(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP200);
		}

		// REGISTROP230
		if (!Util.isEmpty(blocoP.getRegistroP230())) {
			GerarRegistroP230.gerar(blocoP.getRegistroP230(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP230);
		}

		// REGISTROP300
		if (!Util.isEmpty(blocoP.getRegistroP300())) {
			GerarRegistroP300.gerar(blocoP.getRegistroP300(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP300);
		}

		// REGISTROP400
		if (!Util.isEmpty(blocoP.getRegistroP400())) {
			GerarRegistroP400.gerar(blocoP.getRegistroP400(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP400);
		}

		// REGISTROP500
		if (!Util.isEmpty(blocoP.getRegistroP500())) {
			GerarRegistroP500.gerar(blocoP.getRegistroP500(), sb);
			ecfFiscal.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP500);
		}

		// REGISTROP990
		if (ecfFiscal.getContadoresBlocoP().getContRegistroP990() > 0) {
			RegistroP990 registroP990 = new RegistroP990();
			registroP990.setQtd_lin_p(String.valueOf(ecfFiscal.getContadoresBlocoP().getContRegistroP990() + 1));

			blocoP.setRegistroP990(registroP990);
			GerarRegistroP990.gerar(blocoP.getRegistroP990(), sb);
		}

		return sb;
	}

}
