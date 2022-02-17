package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoL.BlocoL;
import br.com.ecoded.ecf.fiscal.registros.blocoL.BlocoLEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoL {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoL blocoL = ecfFiscal.getBlocoL();
		sb = sbr;

		// REGISTROK001
		if (!Util.isEmpty(blocoL.getRegistroL001())) {
			GerarRegistroL001.gerar(blocoL.getRegistroL001(), sb);
			ecfFiscal.getContadoresBlocoL().incrementar(BlocoLEnum.RegistroL001);
		}

		// REGISTROK030
		if (!Util.isEmpty(blocoL.getRegistroL030())) {
			blocoL.getRegistroL030().forEach(registroL030 -> {
				GerarRegistroL030.gerar(registroL030, sb);
				ecfFiscal.getContadoresBlocoL().incrementar(BlocoLEnum.RegistroL030);

			});
		}

		// REGISTROK100
		if (!Util.isEmpty(blocoL.getRegistroL100())) {
			blocoL.getRegistroL100().forEach(registroL100 -> {
				GerarRegistroL100.gerar(registroL100, sb);
				ecfFiscal.getContadoresBlocoL().incrementar(BlocoLEnum.RegistroL100);
			});
		}

		// REGISTROK200
		if (!Util.isEmpty(blocoL.getRegistroL200())) {
			blocoL.getRegistroL200().forEach(registroL200 -> {
				GerarRegistroL200.gerar(registroL200, sb);
				ecfFiscal.getContadoresBlocoL().incrementar(BlocoLEnum.RegistroL200);

				// REGISTROK210
				if (!Util.isEmpty(registroL200.getRegistroL210())) {
					registroL200.getRegistroL210().forEach(registroL210 -> {
						GerarRegistroL210.gerar(registroL210, sb);
						ecfFiscal.getContadoresBlocoL().incrementar(BlocoLEnum.RegistroL210);
					});
				}

			});
		}

		// REGISTROK300
		if (!Util.isEmpty(blocoL.getRegistroL300())) {
			blocoL.getRegistroL300().forEach(registroL300 -> {
				GerarRegistroL300.gerar(registroL300, sb);
				ecfFiscal.getContadoresBlocoL().incrementar(BlocoLEnum.RegistroL300);
			});
		}

		// REGISTROP990
		if (ecfFiscal.getContadoresBlocoL().getContRegistroL990() > 0) {
			RegistroL990 registroL990 = new RegistroL990();
			registroL990.setQtd_lin_l(String.valueOf(ecfFiscal.getContadoresBlocoL().getContRegistroL990() + 1));

			blocoL.setRegistroL990(registroL990);
			GerarRegistroL990.gerar(blocoL.getRegistroL990(), sb);
		}

		return sb;
	}

}
