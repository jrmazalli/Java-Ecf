package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoN.BlocoN;
import br.com.ecoded.ecf.fiscal.registros.blocoN.BlocoNEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN600;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN610;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN615;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN620;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN660;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoN {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoN blocoN = ecfFiscal.getBlocoN();
		sb = sbr;

		// REGISTRON001
		if (!Util.isEmpty(blocoN.getRegistroN001())) {
			GerarRegistroN001.gerar(blocoN.getRegistroN001(), sb);
			ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN001);
		}

		// REGISTRON030
		if (!Util.isEmpty(blocoN.getRegistroN030())) {
			blocoN.getRegistroN030().forEach(registroN030 -> {
				GerarRegistroN030.gerar(registroN030, sb);
				ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN030);
			});
		}

		// REGISTRON500
		if (!Util.isEmpty(blocoN.getRegistroN500())) {
			blocoN.getRegistroN500().forEach(registroN500 -> {
				GerarRegistroN500.gerar(registroN500, sb);
				ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN500);
			});
		}

		// REGISTRON600
		if (!Util.isEmpty(blocoN.getRegistroN600())) {
			RegistroN600 registroN600 = blocoN.getRegistroN600();
			GerarRegistroN600.gerar(registroN600, sb);
			ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN600);

			// REGISTRON610
			if (!Util.isEmpty(registroN600.getRegistroN610())) {
				RegistroN610 registroN610 = registroN600.getRegistroN610();
				GerarRegistroN610.gerar(registroN610, sb);
				ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN610);

				// REGISTRON615
				if (!Util.isEmpty(registroN610.getRegistroN615())) {
					RegistroN615 registroN615 = registroN610.getRegistroN615();
					GerarRegistroN615.gerar(registroN615, sb);
					ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN615);
				}
			}

			// REGISTRON620
			if (!Util.isEmpty(registroN600.getRegistroN620())) {
				RegistroN620 registroN620 = registroN600.getRegistroN620();
				GerarRegistroN620.gerar(registroN620, sb);
				ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN620);

			}

			// REGISTRON630
			if (!Util.isEmpty(registroN600.getRegistroN630())) {
				registroN600.getRegistroN630().forEach(registroN630 -> {
					GerarRegistroN630.gerar(registroN630, sb);
					ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN630);
				});
			}

			// REGISTRON650
			if (!Util.isEmpty(registroN600.getRegistroN650())) {
				registroN600.getRegistroN650().forEach(registroN650 -> {
					GerarRegistroN650.gerar(registroN650, sb);
					ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN650);
				});
			}

			// REGISTRON660
			if (!Util.isEmpty(registroN600.getRegistroN660())) {
				RegistroN660 registroN660 = registroN600.getRegistroN660();
				GerarRegistroN660.gerar(registroN660, sb);
				ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN660);

			}

			// REGISTRON670
			if (!Util.isEmpty(registroN600.getRegistroN670())) {
				registroN600.getRegistroN670().forEach(registroN670 -> {
					GerarRegistroN670.gerar(registroN670, sb);
					ecfFiscal.getContadoresBlocoN().incrementar(BlocoNEnum.RegistroN670);
				});
			}

		}

		// REGISTRON990
		if (ecfFiscal.getContadoresBlocoN().getContRegistroN990() > 0) {
			RegistroN990 registroN990 = new RegistroN990();
			registroN990.setQtd_lin_n(String.valueOf(ecfFiscal.getContadoresBlocoN().getContRegistroN990() + 1));

			blocoN.setRegistroN990(registroN990);
			GerarRegistroN990.gerar(blocoN.getRegistroN990(), sb);
		}

		return sb;
	}

}
