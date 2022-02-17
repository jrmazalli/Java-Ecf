package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoE.BlocoE;
import br.com.ecoded.ecf.fiscal.registros.blocoE.BlocoEEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoE {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoE blocoE = ecfFiscal.getBlocoE();

		sb = sbr;

//		 REGISTROE001
		if (!Util.isEmpty(blocoE.getRegistroE001())) {
			GerarRegistroE001.gerar(blocoE.getRegistroE001(), sb);
			ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE001);
		}

		// REGISTROE010
		if (!Util.isEmpty(blocoE.getRegistroE010())) {
			blocoE.getRegistroE010().forEach(registroE010 -> {
				GerarRegistroE010.gerar(registroE010, sb);
				ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE010);

				// REGISTROC051
				if (!Util.isEmpty(registroE010.getRegistroE015())) {
					registroE010.getRegistroE015().forEach(registroE015 -> {
						GerarRegistroE015.gerar(registroE015, sb);
						ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE015);

					});
				}
			});

		}

		// REGISTROE020
		if (!Util.isEmpty(blocoE.getRegistroE020())) {
			blocoE.getRegistroE020().forEach(registroE020 -> {
				GerarRegistroE020.gerar(registroE020, sb);
				ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE020);
			});
		}

		if (!Util.isEmpty(blocoE.getRegistroE030())) {
			blocoE.getRegistroE030().forEach(registroE030 -> {
				GerarRegistroE030.gerar(registroE030, sb);
				ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE030);

				// REGISTROC155
				if (!Util.isEmpty(registroE030.getRegistroE155())) {
					registroE030.getRegistroE155().forEach(registroE155 -> {
						GerarRegistroE155.gerar(registroE155, sb);
						ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE155);

					});
				}
				// REGISTROE355
				if (!Util.isEmpty(registroE030.getRegistroE355())) {
					registroE030.getRegistroE355().forEach(registroE355 -> {
						GerarRegistroE355.gerar(registroE355, sb);
						ecfFiscal.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE355);

					});
				}

			});

		}

		// REGISTROE990
		if (ecfFiscal.getContadoresBlocoE().getContRegistroE990() > 0) {
			RegistroE990 registroE990 = new RegistroE990();
			registroE990.setQtd_lin_e(String.valueOf(ecfFiscal.getContadoresBlocoE().getContRegistroE990() + 1));

			blocoE.setRegistroE990(registroE990);
			GerarRegistroE990.gerar(blocoE.getRegistroE990(), sb);
		}

		return sb;
	}

}
