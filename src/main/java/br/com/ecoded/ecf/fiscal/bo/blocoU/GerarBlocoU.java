package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoU.BlocoU;
import br.com.ecoded.ecf.fiscal.registros.blocoU.BlocoUEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoU {
	
	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoU blocoU = ecfFiscal.getBlocoU();
		sb = sbr;

		// REGISTROU001
		if (!Util.isEmpty(blocoU.getRegistroU001())) {
			GerarRegistroU001.gerar(blocoU.getRegistroU001(), sb);
			ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU001);
		}

		// REGISTROU030
		if (!Util.isEmpty(blocoU.getRegistroU030())) {
			GerarRegistroU030.gerar(blocoU.getRegistroU030(), sb);
			ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU030);
		}

		// REGISTROU100
		if (!Util.isEmpty(blocoU.getRegistroU100())) {
			GerarRegistroU100.gerar(blocoU.getRegistroU100(), sb);
			ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU100);
		}
		
		// REGISTROU150
		if (!Util.isEmpty(blocoU.getRegistroU100())) {
			GerarRegistroU150.gerar(blocoU.getRegistroU150(), sb);
			ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU150);
		}
		
		// REGISTROU180
		if (!Util.isEmpty(blocoU.getRegistroU180())) {
			GerarRegistroU180.gerar(blocoU.getRegistroU180(), sb);
			ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU180);
		}
		
		// REGISTROU182
		if (!Util.isEmpty(blocoU.getRegistroU182())) {
			GerarRegistroU182.gerar(blocoU.getRegistroU182(), sb);
			ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU182);
		}

		// REGISTROU100
//		if (!Util.isEmpty(blocoU.getRegistroU155())) {
//			blocoU.getRegistroU155().forEach(registroU155-> {
//				GerarRegistroU155.gerar(registroU100, sb);
//				ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU155);
//
//				// REGISTROU110
//				if (!Util.isEmpty(registroU100.getRegistroU110())) {
//					registroU100.getRegistroU110().forEach(registroU110 -> {
//						GerarRegistroU156.gerar(registroU110, sb);
//						ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU156);
//					});
//				}
//
//				// REGISTROU115
//				if (!Util.isEmpty(registroU100.getRegistroU115())) {
//					registroU100.getRegistroU115().forEach(registroU115 -> {
//						GerarRegistroU355.gerar(registroU115, sb);
//						ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU355);
//					});
//				}
//
//			});
//		}

		// REGISTROU200
//		if (!Util.isEmpty(blocoU.getRegistroU155())) {
//			blocoU.getRegistroU155().forEach(registroU155 -> {
//				GerarRegistroU155.gerar(registroU155, sb);
//				ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU356);
//			});
//		}
		


		// REGISTROU210
//		if (!Util.isEmpty(blocoU.getRegistroU210())) {
//			blocoU.getRegistroU210().forEach(registroU210 -> {
//				GerarRegistroU915.gerar(registroU210, sb);
//				ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU915);
//			});
//		}

		// REGISTROU300
//		if (!Util.isEmpty(blocoU.getRegistroU300())) {
//			blocoU.getRegistroU300().forEach(registroU300 -> {
//				GerarRegistroU935.gerar(registroU300, sb);
//				ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU935);
//
//				// REGISTROU110
//				if (!Util.isEmpty(registroU300.getRegistroU310())) {
//					registroU300.getRegistroU310().forEach(registroU310 -> {
//						GerarRegistroU310.gerar(registroU310, sb);
//						ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU310);
//					});
//				}
//
//				// REGISTROU115
//				if (!Util.isEmpty(registroU300.getRegistroU315())) {
//					registroU300.getRegistroU315().forEach(registroU315 -> {
//						GerarRegistroU315.gerar(registroU315, sb);
//						ecfFiscal.getContadoresBlocoU().incrementar(BlocoUEnum.RegistroU315);
//					});
//				}
//
//			});
//		}

		// REGISTROP990
		if (ecfFiscal.getContadoresBlocoU().getContRegistroU990() > 0) {
			RegistroU990 registroU990 = new RegistroU990();
			registroU990.setQtd_lin_u(String.valueOf(ecfFiscal.getContadoresBlocoU().getContRegistroU990() + 1));

			blocoU.setRegistroU990(registroU990);
			GerarRegistroU990.gerar(blocoU.getRegistroU990(), sb);
		}

		return sb;
	}

}
