package br.com.ecoded.ecf.fiscal.bo.blocoY;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoY.BlocoY;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoY {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoY blocoY = ecfFiscal.getBlocoY();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY520();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y520", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY540();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y540", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY550();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y550", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY560();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y560", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY570();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y570", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY580();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y580", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY590();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y590", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY600();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y600", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY612();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y615", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY612();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y612", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY620();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y620", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY630();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y630", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY640();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y640", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY650();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y650", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY660();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y660", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY671();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y671", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY672();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y672", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY680();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y680", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY681();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y681", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY682();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y682", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY690();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y690", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY720();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y720", cont));
		}

		cont = ecfFiscal.getContadoresBlocoY().getContRegistroY800();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("Y800", cont));
		}

		if (!Util.isEmpty(blocoY.getRegistroY990())) {
			bloco9.getRegistro9900().add(New9900("Y990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoY.getRegistroY990().getQtd_lin_y());
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
