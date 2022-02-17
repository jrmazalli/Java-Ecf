package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.BlocoJEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoJ {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoJ blocoJ = ecfFiscal.getBlocoJ();
		sb = sbr;

		// REGISTROJ001
		if (!Util.isEmpty(blocoJ.getRegistroJ001())) {
			GerarRegistroJ001.gerar(blocoJ.getRegistroJ001(), sb);
			ecfFiscal.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ001);
		}

		// RegistroJ050
		if (!Util.isEmpty(blocoJ.getRegistroJ050())) {
			blocoJ.getRegistroJ050().forEach(registroJ050 -> {
				GerarRegistroJ050.gerar(registroJ050, sb);
				ecfFiscal.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ050);

				if (!Util.isEmpty(registroJ050.getRegistroJ051())) {
					registroJ050.getRegistroJ051().forEach(registroJ051 -> {
						GerarRegistroJ051.gerar(registroJ051, sb);
						ecfFiscal.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ051);
					});
				}

				if (!Util.isEmpty(registroJ050.getRegistroJ053())) {
					registroJ050.getRegistroJ053().forEach(registroJ053 -> {
						GerarRegistroJ053.gerar(registroJ053, sb);
						ecfFiscal.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ053);
					});
				}

			});
		}

		// RegistroJ100
		if (!Util.isEmpty(blocoJ.getRegistroJ100())) {
			blocoJ.getRegistroJ100().forEach(registroJ100 -> {
				GerarRegistroJ100.gerar(registroJ100, sb);
				ecfFiscal.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ100);
			});
		}

		// REGISTROJ990
		if (ecfFiscal.getContadoresBlocoJ().getContRegistroJ990() > 0) {
			RegistroJ990 registroJ990 = new RegistroJ990();
			registroJ990.setQtd_lin_j(String.valueOf(ecfFiscal.getContadoresBlocoJ().getContRegistroJ990() + 1));

			blocoJ.setRegistroJ990(registroJ990);
			GerarRegistroJ990.gerar(blocoJ.getRegistroJ990(), sb);
		}

		return sb;
	}
}
