package br.com.ecoded.ecf.fiscal.bo.blocoV;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoV.BlocoV;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoV {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoV blocoV = ecfFiscal.getBlocoV();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoV().getContRegistroV001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("V001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoV().getContRegistroV010();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("V010", cont));
		}

		cont = ecfFiscal.getContadoresBlocoV().getContRegistroV020();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("V020", cont));
		}

		cont = ecfFiscal.getContadoresBlocoV().getContRegistroV030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("V030", cont));
		}

		cont = ecfFiscal.getContadoresBlocoV().getContRegistroV100();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("V100", cont));
		}

		if (!Util.isEmpty(blocoV.getRegistroV990())) {
			bloco9.getRegistro9900().add(New9900("V990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoV.getRegistroV990().getQtd_lin_m());
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
