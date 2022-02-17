package br.com.ecoded.ecf.fiscal.bo.blocoL;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoL.BlocoL;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoL {
	
	 public static EcfFiscal gerar(EcfFiscal ecfFiscal) {

	        BlocoL blocoL = ecfFiscal.getBlocoL();
	        Bloco9 bloco9 = ecfFiscal.getBloco9();

	        int cont;
	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL001();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("L001", cont));
	        }
	        
	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL030();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("L030", cont));
	        }
	        
	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL100();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("L100", cont));
	        }
	        
//	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL110();
//	        if (cont > 0) {
//	            bloco9.getRegistro9900().add(New9900("L110", cont));
//	        }
//	        
//	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL115();
//	        if (cont > 0) {
//	            bloco9.getRegistro9900().add(New9900("L115", cont));
//	        }
	        
	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL200();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("L200", cont));
	        }
	        
	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL210();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("L210", cont));
	        }
	        
	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL300();
	        if (cont > 0) {
	            bloco9.getRegistro9900().add(New9900("L300", cont));
	        }
	        
//	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL310();
//	        if (cont > 0) {
//	            bloco9.getRegistro9900().add(New9900("K310", cont));
//	        }
//	        
//	        cont = ecfFiscal.getContadoresBlocoL().getContRegistroL315();
//	        if (cont > 0) {
//	            bloco9.getRegistro9900().add(New9900("K315", cont));
//	        }

	        // Qnt Registros RegistroK990
	        if (!Util.isEmpty(blocoL.getRegistroL990())) {
	            bloco9.getRegistro9900().add(New9900("L990", 1));
	        }

	        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
	                + Integer.valueOf(blocoL.getRegistroL990().getQtd_lin_l());
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
