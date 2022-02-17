package br.com.ecoded.ecf.fiscal.bo.blocoQ;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.BlocoQ;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.BlocoQEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.RegistroQ990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoQ {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoQ blocoQ = ecfFiscal.getBlocoQ();
		sb = sbr;

		// REGISTROQ001
		if (!Util.isEmpty(blocoQ.getRegistroQ001())) {
			GerarRegistroQ001.gerar(blocoQ.getRegistroQ001(), sb);
			ecfFiscal.getContadoresBlocoQ().incrementar(BlocoQEnum.RegistroQ001);
		}

		// REGISTROQ100
		if (!Util.isEmpty(blocoQ.getRegistroQ100())) {
			GerarRegistroQ100.gerar(blocoQ.getRegistroQ100(), sb);
			ecfFiscal.getContadoresBlocoQ().incrementar(BlocoQEnum.RegistroQ100);
		}

		// REGISTROQ990
		if (ecfFiscal.getContadoresBlocoQ().getContRegistroQ990() > 0) {
			RegistroQ990 registroN990 = new RegistroQ990();
			registroN990.setQtd_lin_q(String.valueOf(ecfFiscal.getContadoresBlocoQ().getContRegistroQ990() + 1));

			blocoQ.setRegistroQ990(registroN990);
			GerarRegistroQ990.gerar(blocoQ.getRegistroQ990(), sb);
		}

		return sb;
	}

}
