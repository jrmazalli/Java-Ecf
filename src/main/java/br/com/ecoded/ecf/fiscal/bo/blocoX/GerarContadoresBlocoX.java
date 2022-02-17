package br.com.ecoded.ecf.fiscal.bo.blocoX;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoX.BlocoX;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoX {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoX blocoX = ecfFiscal.getBlocoX();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX280();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X280", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX291();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X291", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX291();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X291", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX292();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X292", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX300();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X300", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX310();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X310", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX320();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X320", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX330();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X330", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX340();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X340", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX350();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X350", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX351();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X351", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX352();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X352", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX353();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X353", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX354();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X354", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX355();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X355", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX356();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X356", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX357();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X357", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX390();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X390", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX400();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X400", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX410();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X410", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX420();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X420", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX430();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X430", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX450();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X450", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX460();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X460", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX470();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X470", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX480();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X480", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX490();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X490", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX500();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X500", cont));
		}

		cont = ecfFiscal.getContadoresBlocoX().getContRegistroX510();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("X510", cont));
		}

		if (!Util.isEmpty(blocoX.getRegistroX990())) {
			bloco9.getRegistro9900().add(New9900("X990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoX.getRegistroX990().getQtd_lin_x());
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
