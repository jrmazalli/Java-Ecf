package br.com.ecoded.ecf.fiscal.bo.blocoW;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoW.BlocoW;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoW {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoW blocoW = ecfFiscal.getBlocoW();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoW().getContRegistroW001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("W001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoW().getContRegistroW100();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("W100", cont));
		}

		cont = ecfFiscal.getContadoresBlocoW().getContRegistroW200();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("W200", cont));
		}

		cont = ecfFiscal.getContadoresBlocoW().getContRegistroW250();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("W250", cont));
		}

		cont = ecfFiscal.getContadoresBlocoW().getContRegistroW300();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("W300", cont));
		}

		if (!Util.isEmpty(blocoW.getRegistroW990())) {
			bloco9.getRegistro9900().add(New9900("W990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoW.getRegistroW990().getQtd_lin_w());
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
