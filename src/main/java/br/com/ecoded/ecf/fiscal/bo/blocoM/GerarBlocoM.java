package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoM.BlocoM;
import br.com.ecoded.ecf.fiscal.registros.blocoM.BlocoMEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoM {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoM blocoM = ecfFiscal.getBlocoM();
		sb = sbr;

		// REGISTROM001
		if (!Util.isEmpty(blocoM.getRegistroM001())) {
			GerarRegistroM001.gerar(blocoM.getRegistroM001(), sb);
			ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM001);
		}

		// REGISTROM010
		if (!Util.isEmpty(blocoM.getRegistroM010())) {
			blocoM.getRegistroM010().forEach(registroM010 -> {
				GerarRegistroM010.gerar(registroM010, sb);
				ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM010);
			});
		}

		// REGISTROM030
		if (!Util.isEmpty(blocoM.getRegistroM030())) {
			blocoM.getRegistroM030().forEach(registroM030 -> {
				GerarRegistroM030.gerar(registroM030, sb);
				ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM030);

				// REGISTRO0150
				if (!Util.isEmpty(registroM030.getRegistroM300())) {
					registroM030.getRegistroM300().forEach(registroM300 -> {
						GerarRegistroM300.gerar(registroM300, sb);
						ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM300);

						if (!Util.isEmpty(registroM300.getRegistroM305())) {
							registroM300.getRegistroM305().forEach(registroM305 -> {
								GerarRegistroM305.gerar(registroM305, sb);
								ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM305);
							});
						}

						if (!Util.isEmpty(registroM300.getRegistroM310())) {
							registroM300.getRegistroM310().forEach(registroM310 -> {
								GerarRegistroM310.gerar(registroM310, sb);
								ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM310);

								// REGISTROM312
								if (!Util.isEmpty(registroM310.getRegistroM312())) {
									GerarRegistroM312.gerar(registroM310.getRegistroM312(), sb);
									ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM312);
								}

								// REGISTROM315
								if (!Util.isEmpty(registroM310.getRegistroM315())) {
									GerarRegistroM315.gerar(registroM310.getRegistroM315(), sb);
									ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM315);
								}
							});
						}
					});
				}
			});
		}

		// REGISTROM350
		if (!Util.isEmpty(blocoM.getRegistroM350())) {
			blocoM.getRegistroM350().forEach(registroM350 -> {
				GerarRegistroM350.gerar(registroM350, sb);
				ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM350);

				// REGISTROM355
				if (!Util.isEmpty(registroM350.getRegistroM355())) {
					registroM350.getRegistroM355().forEach(registroM355 -> {
						GerarRegistroM355.gerar(registroM355, sb);
						ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM355);
					});
				}
				
				
				// REGISTROM360
				if (!Util.isEmpty(registroM350.getRegistroM360())) {
					registroM350.getRegistroM360().forEach(registroM360 -> {
						GerarRegistroM360.gerar(registroM360, sb);
						ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM360);

						// REGISTROM362
						if (!Util.isEmpty(registroM360.getRegistroM362())) {
							GerarRegistroM362.gerar(registroM360.getRegistroM362(), sb);
							ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM362);
						}
						// REGISTROM365
						if (!Util.isEmpty(registroM360.getRegistroM365())) {
							GerarRegistroM365.gerar(registroM360.getRegistroM365(), sb);
							ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM365);
						}
					});
				}

			});
		}


		// REGISTROM410
		if (!Util.isEmpty(blocoM.getRegistroM410())) {
			blocoM.getRegistroM410().forEach(registroM410 -> {
				GerarRegistroM410.gerar(registroM410, sb);
				ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM410);
			});
		}

		// REGISTROM500
		if (!Util.isEmpty(blocoM.getRegistroM500())) {
			blocoM.getRegistroM500().forEach(registroM500 -> {
				GerarRegistroM500.gerar(registroM500, sb);
				ecfFiscal.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM500);
			});
		}

		// REGISTROM990
		if (ecfFiscal.getContadoresBlocoM().getContRegistroM990() > 0) {
			RegistroM990 registroM990 = new RegistroM990();
			registroM990.setQtd_lin_m(String.valueOf(ecfFiscal.getContadoresBlocoM().getContRegistroM990() + 1));

			blocoM.setRegistroM990(registroM990);
			GerarRegistroM990.gerar(blocoM.getRegistroM990(), sb);
		}
		return sb;
	}

}
