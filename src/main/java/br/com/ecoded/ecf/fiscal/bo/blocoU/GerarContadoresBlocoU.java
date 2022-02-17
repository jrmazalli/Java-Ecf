package br.com.ecoded.ecf.fiscal.bo.blocoU;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoU.BlocoU;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoU {
	
	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoU blocoU = ecfFiscal.getBlocoU();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoU().getContRegistroU001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("U001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoU().getContRegistroU030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("U030", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoU().getContRegistroU100();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("U100", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoU().getContRegistroU150();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("U150", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoU().getContRegistroU180();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("U180", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoU().getContRegistroU182();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("U182", cont));
		}

		if (!Util.isEmpty(blocoU.getRegistroU990())) {
			bloco9.getRegistro9900().add(New9900("U990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoU.getRegistroU990().getQtd_lin_u());
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
