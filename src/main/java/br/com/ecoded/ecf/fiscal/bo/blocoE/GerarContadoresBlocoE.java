package br.com.ecoded.ecf.fiscal.bo.blocoE;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoE.BlocoE;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoE {
	
	 public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

	        BlocoE blocoE = ecfFiscal.getBlocoE();
	        Bloco9 bloco9 = ecfFiscal.getBloco9();

	        int cont;
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE001();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E001", cont));
	        }
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE010();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E010", cont));
	        }
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE015();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E015", cont));
	        }
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE020();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E020", cont));
	        }
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE030();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E030", cont));
	        }
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE155();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E155", cont));
	        }
	        cont = ecfFiscal.getContadoresBlocoE().getContRegistroE355();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("E355", cont));
	        }

	        // Qnt Registros RegistroE990
	        if (!Util.isEmpty(blocoE.getRegistroE990())) {
	            bloco9.getRegistro9900().add(New9900("E990", 1));
	        }

	        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
	                + Integer.valueOf(blocoE.getRegistroE990().getQtd_lin_e());
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
