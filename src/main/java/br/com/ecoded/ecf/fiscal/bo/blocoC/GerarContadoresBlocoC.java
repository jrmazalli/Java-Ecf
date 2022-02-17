package br.com.ecoded.ecf.fiscal.bo.blocoC;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9900;
import br.com.ecoded.ecf.fiscal.registros.blocoC.BlocoC;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarContadoresBlocoC {

    public static EcfFiscal gerar(EcfFiscal ecdcontabil) {

        BlocoC blocoC = ecdcontabil.getBlocoC();
        Bloco9 bloco9 = ecdcontabil.getBloco9();

        int cont;
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C001", cont));
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC040();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C040", cont));
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC150();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C150", cont));
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC155();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C155", cont));
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC350();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C350", cont));
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC355();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C355", cont));
        }

        // Qnt Registros RegistroC990
        if (!Util.isEmpty(blocoC.getRegistroC990())) {
            bloco9.getRegistro9900().add(New9900("C990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoC.getRegistroC990().getQtd_lin_c());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        ecdcontabil.setBloco9(bloco9);

        return ecdcontabil;
    }

    private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
        Registro9900 vRet = new Registro9900();
        vRet.setReg_blc(Reg_blc);
        vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
        return vRet;
    }
}
