package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoT.BlocoT;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoT {
	
	public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

		BlocoT blocoT = ecfFiscal.getBlocoT();
		Bloco9 bloco9 = ecfFiscal.getBloco9();

		int cont;
		cont = ecfFiscal.getContadoresBlocoT().getContRegistroT001();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("T001", cont));
		}

		cont = ecfFiscal.getContadoresBlocoT().getContRegistroT030();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("T030", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoT().getContRegistroT120();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("T120", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoT().getContRegistroT150();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("T150", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoT().getContRegistroT170();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("T170", cont));
		}
		
		cont = ecfFiscal.getContadoresBlocoT().getContRegistroT181();
		if (cont > 0) {
			bloco9.getRegistro9900().add(New9900("T181", cont));
		}

		if (!Util.isEmpty(blocoT.getRegistroT990())) {
			bloco9.getRegistro9900().add(New9900("T990", 1));
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoT.getRegistroT990().getQtd_lin_t());
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
