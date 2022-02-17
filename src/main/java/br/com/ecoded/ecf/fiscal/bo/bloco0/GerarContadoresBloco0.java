package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Bloco0;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9999;

public class GerarContadoresBloco0 {

	public static EcfFiscal gerar(EcfFiscal ecfFisca) {

		Bloco0 bloco0 = ecfFisca.getBloco0();
		Bloco9 bloco9 = new Bloco9();
		Registro9999 registro9999 = new Registro9999();
		registro9999.setQtd_lin("0");
		bloco9.setRegistro9999(registro9999);
		Registro9900 registro9900 = new Registro9900();

		int cont = 0;

		// Qnt Registros Registro0000
		cont = ecfFisca.getContadoresBloco0().getContRegistro0000();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0000");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}

		// Qnt Registros Registro0001
		cont = ecfFisca.getContadoresBloco0().getContRegistro0001();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0001");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}

		// Qnt Registros Registro0007
		cont = ecfFisca.getContadoresBloco0().getContRegistro0010();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0010");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}

		// Qnt Registros Registro0020
		cont = ecfFisca.getContadoresBloco0().getContRegistro0020();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0020");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		
		cont = ecfFisca.getContadoresBloco0().getContRegistro0021();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0021");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}



		// Qnt Registros Registro0030
		cont = ecfFisca.getContadoresBloco0().getContRegistro0030();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0030");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		
		// Qnt Registros Registro0035
		cont = ecfFisca.getContadoresBloco0().getContRegistro0035();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0035");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}

		// Qnt Registros Registro0930
		cont = ecfFisca.getContadoresBloco0().getContRegistro0930();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0930");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}

		// Qnt Registros Registro0990
		cont = ecfFisca.getContadoresBloco0().getContRegistro0990();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("0990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(bloco0.getRegistro0990().getQtd_lin_0());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		ecfFisca.setBloco9(bloco9);
		return ecfFisca;
	}
}
