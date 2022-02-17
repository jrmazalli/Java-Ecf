package br.com.ecoded.ecf.fiscal.bo.blocoQ;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.BlocoQ;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoQ {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoQ blocoQ = ecfFiscal.getBlocoQ();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoQ().getContRegistroQ001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Q001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoQ().getContRegistroQ100();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Q100", cont));
		}

		if (!Util.isEmpty(blocoQ.getRegistroQ990())) {
			bloco9.getRegistro9900().add(New9900("Q990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoQ.getRegistroQ990().getQtd_lin_q());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		ecfFiscal.setBloco9(bloco9);

		return ecfFiscal;
	}

	private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
		Registro9900 vRet = new Registro9900();
		vRet.setReg_blc(Reg_blc);
		vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
		return vRet;
	}

}
