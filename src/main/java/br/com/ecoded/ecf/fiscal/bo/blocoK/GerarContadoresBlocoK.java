package br.com.ecoded.ecf.fiscal.bo.blocoK;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoK.BlocoK;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoK {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoK blocoK = ecfFiscal.getBlocoK();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K030", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK155();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K155", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK156();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K156", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK355();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K355", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK356();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K200", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK915();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K915", cont));
		}

		cont = ecfFiscal.getContadoresBlocoK().getContRegistroK935();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("K935", cont));
		}

		// Qnt Registros RegistroK990
		if (!Util.isEmpty(blocoK.getRegistroK990())) {
			bloco9.getRegistro9900().add(New9900("K990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoK.getRegistroK990().getQtd_lin_k());
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
