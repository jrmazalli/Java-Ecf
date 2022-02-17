package br.com.ecoded.ecf.fiscal.bo.blocoJ;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoJ {

	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoJ blocoJ = ecfFiscal.getBlocoJ();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoJ().getContRegistroJ001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("J001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoJ().getContRegistroJ050();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("J050", cont));
		}

		cont = ecfFiscal.getContadoresBlocoJ().getContRegistroJ051();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("J051", cont));
		}

		cont = ecfFiscal.getContadoresBlocoJ().getContRegistroJ053();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("J053", cont));
		}

		cont = ecfFiscal.getContadoresBlocoJ().getContRegistroJ100();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("J100", cont));
		}

		// Qnt Registros RegistroK990
		if (!Util.isEmpty(blocoJ.getRegistroJ990())) {
			bloco9.getRegistro9900().add(New9900("J990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoJ.getRegistroJ990().getQtd_lin_j());
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
