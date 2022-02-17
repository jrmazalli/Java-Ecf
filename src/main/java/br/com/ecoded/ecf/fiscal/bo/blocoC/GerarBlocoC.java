package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoC.BlocoC;
import br.com.ecoded.ecf.fiscal.registros.blocoC.BlocoCEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoC blocoC = ecfFiscal.getBlocoC();

		sb = sbr;

		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
		}

		// REGISTROC040
		if (!Util.isEmpty(blocoC.getRegistroC040())) {
			GerarRegistroC040.gerar(ecfFiscal, blocoC.getRegistroC040(), sb);
			ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC040);
		}

		// REGISTROC050
		if (!Util.isEmpty(blocoC.getRegistroC050())) {
			blocoC.getRegistroC050().forEach(registroC050 -> {
				GerarRegistroC050.gerar(registroC050, sb);
				ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC050);

				// REGISTROC051
				if (!Util.isEmpty(registroC050.getRegistroC051())) {
					registroC050.getRegistroC051().forEach(registroC051 -> {
						GerarRegistroC051.gerar(registroC051, sb);
						ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC051);

						// REGISTROC053
						if (!Util.isEmpty(registroC050.getRegistroC053())) {
							GerarRegistroC053.gerar(registroC050.getRegistroC053(), sb);
							ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC053);
						}
					});
				}
			});
		}

		// REGISTROC100
		if (!Util.isEmpty(blocoC.getRegistroC100())) {
			blocoC.getRegistroC100().forEach(registroC100 -> {
				GerarRegistroC100.gerar(registroC100, sb);
				ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC100);
			});
		}

		// REGISTROC150
		if (!Util.isEmpty(blocoC.getRegistroC150())) {
			blocoC.getRegistroC150().forEach(registroC150 -> {
				GerarRegistroC150.gerar(registroC150, sb);
				ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC150);

				// REGISTROC155
				if (!Util.isEmpty(registroC150.getRegistroC155())) {
					registroC150.getRegistroC155().forEach(registroC155 -> {
						GerarRegistroC155.gerar(registroC155, sb);
						ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC155);

						// REGISTROC157
						if (!Util.isEmpty(registroC150.getRegistroC157())) {
							GerarRegistroC157.gerar(registroC150.getRegistroC157(), sb);
							ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC157);
						}

					});
				}
			});

		}

		if (!Util.isEmpty(blocoC.getRegistroC350())) {
			blocoC.getRegistroC350().forEach(registroC350 -> {
				GerarRegistroC350.gerar(registroC350, sb);
				ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC350);

				// REGISTROC155
				if (!Util.isEmpty(registroC350.getRegistroC355())) {
					registroC350.getRegistroC355().forEach(registroC355 -> {
						GerarRegistroC355.gerar(registroC355, sb);
						ecfFiscal.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC355);

					});
				}
			});

		}

		// REGISTROC990
		if (ecfFiscal.getContadoresBlocoC().getContRegistroC990() > 0) {
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_c(String.valueOf(ecfFiscal.getContadoresBlocoC().getContRegistroC990() + 1));

			blocoC.setRegistroC990(registroC990);
			GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}

		return sb;
	}
}
