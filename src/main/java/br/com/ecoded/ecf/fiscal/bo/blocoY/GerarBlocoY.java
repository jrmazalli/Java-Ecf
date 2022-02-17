package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoY.BlocoY;
import br.com.ecoded.ecf.fiscal.registros.blocoY.BlocoYEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoY {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoY blocoY = ecfFiscal.getBlocoY();
		sb = sbr;

		// REGISTROY001
		if (!Util.isEmpty(blocoY.getRegistroY001())) {
			GerarRegistroY001.gerar(blocoY.getRegistroY001(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY001);
		}

		if (!Util.isEmpty(blocoY.getRegistroY520())) {
			blocoY.getRegistroY520().forEach(registroY520 -> {
				GerarRegistroY520.gerar(registroY520, sb);
				ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY520);
			});
		}

		if (!Util.isEmpty(blocoY.getRegistroY540())) {
			blocoY.getRegistroY540().forEach(registroY540 -> {
				GerarRegistroY540.gerar(registroY540, sb);
				ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY540);
			});
		}

		if (!Util.isEmpty(blocoY.getRegistroY560())) {
			blocoY.getRegistroY560().forEach(registroY560 -> {
				GerarRegistroY560.gerar(registroY560, sb);
				ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY560);
			});
		}

		if (!Util.isEmpty(blocoY.getRegistroY570())) {
			blocoY.getRegistroY570().forEach(registroY570 -> {
				GerarRegistroY570.gerar(registroY570, sb);
				ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY570);
			});
		}

		if (!Util.isEmpty(blocoY.getRegistroY580())) {
			GerarRegistroY580.gerar(blocoY.getRegistroY580(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY580);
		}

		if (!Util.isEmpty(blocoY.getRegistroY590())) {
			GerarRegistroY590.gerar(blocoY.getRegistroY590(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY590);
		}

		if (!Util.isEmpty(blocoY.getRegistroY600())) {
			blocoY.getRegistroY600().forEach(registroY600 -> {
				GerarRegistroY600.gerar(registroY600, sb);
				ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY600);

				if (!Util.isEmpty(registroY600.getRegistroY612())) {
					GerarRegistroY612.gerar(registroY600.getRegistroY612(), sb);
					ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY612);
				}
			});
		}

		if (!Util.isEmpty(blocoY.getRegistroY620())) {
			GerarRegistroY620.gerar(blocoY.getRegistroY620(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY620);
		}
		if (!Util.isEmpty(blocoY.getRegistroY630())) {
			GerarRegistroY630.gerar(blocoY.getRegistroY630(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY630);
		}
		if (!Util.isEmpty(blocoY.getRegistroY640())) {
			GerarRegistroY640.gerar(blocoY.getRegistroY640(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY640);
		}
		if (!Util.isEmpty(blocoY.getRegistroY650())) {
			GerarRegistroY650.gerar(blocoY.getRegistroY650(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY650);
		}
		if (!Util.isEmpty(blocoY.getRegistroY660())) {
			GerarRegistroY660.gerar(blocoY.getRegistroY660(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY600);
		}
		if (!Util.isEmpty(blocoY.getRegistroY671())) {
			GerarRegistroY671.gerar(blocoY.getRegistroY671(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY671);
		}
		if (!Util.isEmpty(blocoY.getRegistroY672())) {
			GerarRegistroY672.gerar(blocoY.getRegistroY672(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY672);
		}

		if (!Util.isEmpty(blocoY.getRegistroY680())) {
			GerarRegistroY680.gerar(blocoY.getRegistroY680(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY680);

//			if (!Util.isEmpty(registroY680.getRegistroY681())) {
//				GerarRegistroY681.gerar(registroY680.getRegistroY681(), sb);
//				ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY681);
//			}
		}

		if (!Util.isEmpty(blocoY.getRegistroY690())) {
			GerarRegistroY690.gerar(blocoY.getRegistroY690(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY690);
		}

		if (!Util.isEmpty(blocoY.getRegistroY720())) {
			GerarRegistroY720.gerar(blocoY.getRegistroY720(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY720);
		}

		if (!Util.isEmpty(blocoY.getRegistroY800())) {
			GerarRegistroY800.gerar(blocoY.getRegistroY800(), sb);
			ecfFiscal.getContadoresBlocoY().incrementar(BlocoYEnum.RegistroY800);
		}

		// REGISTROP990
		if (ecfFiscal.getContadoresBlocoY().getContRegistroY990() > 0) {
			RegistroY990 registroY990 = new RegistroY990();
			registroY990.setQtd_lin_y(String.valueOf(ecfFiscal.getContadoresBlocoY().getContRegistroY990() + 1));

			blocoY.setRegistroY990(registroY990);
			GerarRegistroY990.gerar(blocoY.getRegistroY990(), sb);
		}

		return sb;
	}

}
