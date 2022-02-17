package br.com.ecoded.ecf.fiscal.bo.blocoP;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoP.BlocoP;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoP {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoP blocoP = ecfFiscal.getBlocoP();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P030", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P030", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP130();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P130", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP150();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P150", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP200();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P200", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP230();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P230", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP300();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P300", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP400();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P400", cont));
		}

		cont = ecfFiscal.getContadoresBlocoP().getContRegistroP500();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("P500", cont));
		}

		if (!Util.isEmpty(blocoP.getRegistroP990())) {
			bloco9.getRegistro9900().add(New9900("P990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoP.getRegistroP990().getQtd_lin_p());
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
