package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoX.BlocoX;
import br.com.ecoded.ecf.fiscal.registros.blocoX.BlocoXEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX291;
import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoX {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoX blocoX = ecfFiscal.getBlocoX();
		sb = sbr;

		// REGISTROT001
		if (!Util.isEmpty(blocoX.getRegistroX001())) {
			GerarRegistroX001.gerar(blocoX.getRegistroX001(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX001);
		}

		// REGISTROT100
		if (!Util.isEmpty(blocoX.getRegistroX280())) {
			GerarRegistroX280.gerar(blocoX.getRegistroX280(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX280);
		}

		if (!Util.isEmpty(blocoX.getRegistroX291())) {
			RegistroX291 registroX291 = blocoX.getRegistroX291();
			GerarRegistroX291.gerar(registroX291, sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX291);
		}
		
		// RegistroJ100
		if (!Util.isEmpty(blocoX.getRegistroX292())) {
			blocoX.getRegistroX292().forEach(registroX292 -> {
				GerarRegistroX292.gerar(registroX292, sb);
				ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX292);
			});
		}

		// REGISTROT300
		if (!Util.isEmpty(blocoX.getRegistroX300())) {
			GerarRegistroX300.gerar(blocoX.getRegistroX300(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX300);
		}

		if (!Util.isEmpty(blocoX.getRegistroX310())) {
			GerarRegistroX310.gerar(blocoX.getRegistroX310(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX310);
		}

		if (!Util.isEmpty(blocoX.getRegistroX320())) {
			GerarRegistroX320.gerar(blocoX.getRegistroX320(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX320);
		}

		if (!Util.isEmpty(blocoX.getRegistroX330())) {
			GerarRegistroX330.gerar(blocoX.getRegistroX330(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX330);
		}

		if (!Util.isEmpty(blocoX.getRegistroX340())) {
			GerarRegistroX340.gerar(blocoX.getRegistroX340(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX340);
		}

		if (!Util.isEmpty(blocoX.getRegistroX350())) {
			GerarRegistroX350.gerar(blocoX.getRegistroX350(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX350);
		}

		if (!Util.isEmpty(blocoX.getRegistroX351())) {
			GerarRegistroX351.gerar(blocoX.getRegistroX351(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX351);
		}

		if (!Util.isEmpty(blocoX.getRegistroX352())) {
			GerarRegistroX352.gerar(blocoX.getRegistroX352(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX352);
		}

		if (!Util.isEmpty(blocoX.getRegistroX353())) {
			GerarRegistroX353.gerar(blocoX.getRegistroX353(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX353);
		}

		if (!Util.isEmpty(blocoX.getRegistroX354())) {
			GerarRegistroX354.gerar(blocoX.getRegistroX354(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX354);
		}

		if (!Util.isEmpty(blocoX.getRegistroX355())) {
			GerarRegistroX355.gerar(blocoX.getRegistroX355(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX355);
		}

		if (!Util.isEmpty(blocoX.getRegistroX356())) {
			GerarRegistroX356.gerar(blocoX.getRegistroX356(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX356);
		}

		if (!Util.isEmpty(blocoX.getRegistroX357())) {
			GerarRegistroX357.gerar(blocoX.getRegistroX357(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX357);
		}

		if (!Util.isEmpty(blocoX.getRegistroX390())) {
			GerarRegistroX390.gerar(blocoX.getRegistroX390(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX390);
		}

		if (!Util.isEmpty(blocoX.getRegistroX400())) {
			GerarRegistroX400.gerar(blocoX.getRegistroX400(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX400);
		}

		if (!Util.isEmpty(blocoX.getRegistroX410())) {
			GerarRegistroX410.gerar(blocoX.getRegistroX410(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX410);
		}

		if (!Util.isEmpty(blocoX.getRegistroX420())) {
			GerarRegistroX420.gerar(blocoX.getRegistroX420(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX420);
		}

		if (!Util.isEmpty(blocoX.getRegistroX430())) {
			GerarRegistroX430.gerar(blocoX.getRegistroX430(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX430);
		}

		if (!Util.isEmpty(blocoX.getRegistroX450())) {
			GerarRegistroX450.gerar(blocoX.getRegistroX450(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX450);
		}

		if (!Util.isEmpty(blocoX.getRegistroX460())) {
			GerarRegistroX460.gerar(blocoX.getRegistroX460(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX460);
		}

		if (!Util.isEmpty(blocoX.getRegistroX470())) {
			GerarRegistroX470.gerar(blocoX.getRegistroX470(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX470);
		}

		if (!Util.isEmpty(blocoX.getRegistroX480())) {
			GerarRegistroX480.gerar(blocoX.getRegistroX480(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX480);
		}

		if (!Util.isEmpty(blocoX.getRegistroX490())) {
			GerarRegistroX490.gerar(blocoX.getRegistroX490(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX490);
		}

		if (!Util.isEmpty(blocoX.getRegistroX500())) {
			GerarRegistroX500.gerar(blocoX.getRegistroX500(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX500);
		}

		if (!Util.isEmpty(blocoX.getRegistroX510())) {
			GerarRegistroX510.gerar(blocoX.getRegistroX510(), sb);
			ecfFiscal.getContadoresBlocoX().incrementar(BlocoXEnum.RegistroX510);
		}

		// REGISTROT990
		if (ecfFiscal.getContadoresBlocoX().getContRegistroX990() > 0) {
			RegistroX990 registroX990 = new RegistroX990();
			registroX990.setQtd_lin_x(String.valueOf(ecfFiscal.getContadoresBlocoX().getContRegistroX990() + 1));

			blocoX.setRegistroX990(registroX990);
			GerarRegistroX990.gerar(blocoX.getRegistroX990(), sb);
		}

		return sb;
	}

}
