package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoK.BlocoK;
import br.com.ecoded.ecf.fiscal.registros.blocoK.BlocoKEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoK {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoK blocoK = ecfFiscal.getBlocoK();
		sb = sbr;

		// REGISTROK001
		if (!Util.isEmpty(blocoK.getRegistroK001())) {
			GerarRegistroK001.gerar(blocoK.getRegistroK001(), sb);
			ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK001);
		}

		// REGISTROK030
		if (!Util.isEmpty(blocoK.getRegistroK030())) {
			blocoK.getRegistroK030().forEach(registroK030 -> {
				GerarRegistroK030.gerar(registroK030, sb);
				ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK030);
			});
		}

		// REGISTROK030
		if (!Util.isEmpty(blocoK.getRegistroK155())) {
			blocoK.getRegistroK155().forEach(registroK155 -> {
				GerarRegistroK155.gerar(registroK155, sb);
				ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK155);

				if (!Util.isEmpty(registroK155.getRegistroK156())) {
					registroK155.getRegistroK156().forEach(registroK156 -> {
						GerarRegistroK156.gerar(registroK156, sb);
						ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK156);
					});
				}

			});
		}

		// REGISTROK030
		if (!Util.isEmpty(blocoK.getRegistroK355())) {
			blocoK.getRegistroK355().forEach(registroK355 -> {
				GerarRegistroK355.gerar(registroK355, sb);
				ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK355);

				if (!Util.isEmpty(registroK355.getRegistroK356())) {
					registroK355.getRegistroK356().forEach(registroK356 -> {
						GerarRegistroK356.gerar(registroK356, sb);
						ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK356);
					});
				}

			});
		}

		// REGISTROK030
		if (!Util.isEmpty(blocoK.getRegistroK915())) {
			blocoK.getRegistroK915().forEach(registroK915 -> {
				GerarRegistroK915.gerar(registroK915, sb);
				ecfFiscal.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK915);
			});
		}

		// REGISTROP990
		if (ecfFiscal.getContadoresBlocoK().getContRegistroK990() > 0) {
			RegistroK990 registroK990 = new RegistroK990();
			registroK990.setQtd_lin_k(String.valueOf(ecfFiscal.getContadoresBlocoK().getContRegistroK990() + 1));

			blocoK.setRegistroK990(registroK990);
			GerarRegistroK990.gerar(blocoK.getRegistroK990(), sb);
		}

		return sb;
	}
}
