package br.com.ecoded.ecf.fiscal.bo.blocoN;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoN.BlocoN;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoN {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoN blocoN = ecfFiscal.getBlocoN();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N030", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN500();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N500", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN600();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N600", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN610();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N610", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN615();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N615", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN620();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N620", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN630();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N630", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN650();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N650", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN660();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N660", cont));
		}

		cont = ecfFiscal.getContadoresBlocoN().getContRegistroN670();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("N670", cont));
		}

		// Qnt Registros RegistroK990
		if (!Util.isEmpty(blocoN.getRegistroN990())) {
			bloco9.getRegistro9900().add(New9900("N990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoN.getRegistroN990().getQtd_lin_n());
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
