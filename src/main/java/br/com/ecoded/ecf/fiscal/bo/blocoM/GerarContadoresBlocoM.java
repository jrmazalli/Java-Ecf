package br.com.ecoded.ecf.fiscal.bo.blocoM;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoM.BlocoM;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoM {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoM blocoM = ecfFiscal.getBlocoM();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM010();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M010", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M030", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM300();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M300", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM305();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M305", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM310();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M310", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM312();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M312", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM315();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M315", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM350();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M350", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM355();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M355", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM360();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M360", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM362();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M362", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM365();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M365", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM410();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M410", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM415();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M415", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM500();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M500", cont));
		}

		cont = ecfFiscal.getContadoresBlocoM().getContRegistroM510();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("M510", cont));
		}

		// Qnt Registros RegistroK990
		if (!Util.isEmpty(blocoM.getRegistroM990())) {
			bloco9.getRegistro9900().add(New9900("M990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoM.getRegistroM990().getQtd_lin_m());
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
