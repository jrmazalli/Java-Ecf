package br.com.ecoded.ecf.fiscal.bo;

import br.com.ecoded.ecf.fiscal.bo.bloco0.GerarBloco0;
import br.com.ecoded.ecf.fiscal.bo.bloco0.GerarContadoresBloco0;
import br.com.ecoded.ecf.fiscal.bo.bloco9.GerarBloco9;
import br.com.ecoded.ecf.fiscal.bo.blocoC.GerarBlocoC;
import br.com.ecoded.ecf.fiscal.bo.blocoC.GerarContadoresBlocoC;
import br.com.ecoded.ecf.fiscal.bo.blocoE.GerarBlocoE;
import br.com.ecoded.ecf.fiscal.bo.blocoE.GerarContadoresBlocoE;
import br.com.ecoded.ecf.fiscal.bo.blocoJ.GerarBlocoJ;
import br.com.ecoded.ecf.fiscal.bo.blocoJ.GerarContadoresBlocoJ;
import br.com.ecoded.ecf.fiscal.bo.blocoK.GerarBlocoK;
import br.com.ecoded.ecf.fiscal.bo.blocoL.GerarBlocoL;
import br.com.ecoded.ecf.fiscal.bo.blocoL.GerarContadoresBlocoL;
import br.com.ecoded.ecf.fiscal.bo.blocoM.GerarBlocoM;
import br.com.ecoded.ecf.fiscal.bo.blocoM.GerarContadoresBlocoM;
import br.com.ecoded.ecf.fiscal.bo.blocoN.GerarBlocoN;
import br.com.ecoded.ecf.fiscal.bo.blocoN.GerarContadoresBlocoN;
import br.com.ecoded.ecf.fiscal.bo.blocoP.GerarBlocoP;
import br.com.ecoded.ecf.fiscal.bo.blocoP.GerarContadoresBlocoP;
import br.com.ecoded.ecf.fiscal.bo.blocoQ.GerarBlocoQ;
import br.com.ecoded.ecf.fiscal.bo.blocoQ.GerarContadoresBlocoQ;
import br.com.ecoded.ecf.fiscal.bo.blocoT.GerarBlocoT;
import br.com.ecoded.ecf.fiscal.bo.blocoT.GerarContadoresBlocoT;
import br.com.ecoded.ecf.fiscal.bo.blocoU.GerarBlocoU;
import br.com.ecoded.ecf.fiscal.bo.blocoU.GerarContadoresBlocoU;
import br.com.ecoded.ecf.fiscal.bo.blocoV.GerarBlocoV;
import br.com.ecoded.ecf.fiscal.bo.blocoV.GerarContadoresBlocoV;
import br.com.ecoded.ecf.fiscal.bo.blocoW.GerarBlocoW;
import br.com.ecoded.ecf.fiscal.bo.blocoW.GerarContadoresBlocoW;
import br.com.ecoded.ecf.fiscal.bo.blocoX.GerarBlocoX;
import br.com.ecoded.ecf.fiscal.bo.blocoX.GerarContadoresBlocoX;
import br.com.ecoded.ecf.fiscal.bo.blocoY.GerarBlocoY;
import br.com.ecoded.ecf.fiscal.bo.blocoY.GerarContadoresBlocoY;
import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Registro9001;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarEcfFiscal {

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sb) {

		// BLOCO0
		if (!Util.isEmpty(ecfFiscal.getBloco0())) {
			GerarBloco0.gerar(ecfFiscal, sb);
			GerarContadoresBloco0.gerar(ecfFiscal);
		}

		// BLOCOC
		if (!Util.isEmpty(ecfFiscal.getBlocoC())) {
			GerarBlocoC.gerar(ecfFiscal, sb);
			GerarContadoresBlocoC.gerar(ecfFiscal);
		}

		// BLOCOE
		if (!Util.isEmpty(ecfFiscal.getBlocoE())) {
			GerarBlocoE.gerar(ecfFiscal, sb);
			GerarContadoresBlocoE.gerar(ecfFiscal);
		}

		// BLOCOJ
		if (!Util.isEmpty(ecfFiscal.getBlocoJ())) {
			GerarBlocoJ.gerar(ecfFiscal, sb);
			GerarContadoresBlocoJ.gerar(ecfFiscal);
		}

		// BLOCOK
		if (!Util.isEmpty(ecfFiscal.getBlocoK())) {
			GerarBlocoK.gerar(ecfFiscal, sb);
			GerarContadoresBlocoJ.gerar(ecfFiscal);
		}
		
		//BLOCOL
		if (!Util.isEmpty(ecfFiscal.getBlocoL())) {
			GerarBlocoL.gerar(ecfFiscal, sb);
			GerarContadoresBlocoL.gerar(ecfFiscal);
		}
		
		//BLOCOM
		if (!Util.isEmpty(ecfFiscal.getBlocoM())) {
			GerarBlocoM.gerar(ecfFiscal, sb);
			GerarContadoresBlocoM.gerar(ecfFiscal);
		}
		
		//BLOCON
		if (!Util.isEmpty(ecfFiscal.getBlocoN())) {
			GerarBlocoN.gerar(ecfFiscal, sb);
			GerarContadoresBlocoN.gerar(ecfFiscal);
		}
		
		//BLOCOP
		if (!Util.isEmpty(ecfFiscal.getBlocoP())) {
			GerarBlocoP.gerar(ecfFiscal, sb);
			GerarContadoresBlocoP.gerar(ecfFiscal);
		}
		
		//BLOCOQ
		if (!Util.isEmpty(ecfFiscal.getBlocoQ())) {
			GerarBlocoQ.gerar(ecfFiscal, sb);
			GerarContadoresBlocoQ.gerar(ecfFiscal);
		}
		
		//BLOCOT
		if (!Util.isEmpty(ecfFiscal.getBlocoT())) {
			GerarBlocoT.gerar(ecfFiscal, sb);
			GerarContadoresBlocoT.gerar(ecfFiscal);
		}
		
		//BLOCOU
		if (!Util.isEmpty(ecfFiscal.getBlocoU())) {
			GerarBlocoU.gerar(ecfFiscal, sb);
			GerarContadoresBlocoU.gerar(ecfFiscal);
		}
		
		//BLOCOV
		if (!Util.isEmpty(ecfFiscal.getBlocoV())) {
			GerarBlocoV.gerar(ecfFiscal, sb);
			GerarContadoresBlocoV.gerar(ecfFiscal);
		}
		
		//BLOCOW
		if (!Util.isEmpty(ecfFiscal.getBlocoW())) {
			GerarBlocoW.gerar(ecfFiscal, sb);
			GerarContadoresBlocoW.gerar(ecfFiscal);
		}
		
		//BLOCOX
		if (!Util.isEmpty(ecfFiscal.getBlocoX())) {
			GerarBlocoX.gerar(ecfFiscal, sb);
			GerarContadoresBlocoX.gerar(ecfFiscal);
		}
		
		//BLOCOY
		if (!Util.isEmpty(ecfFiscal.getBlocoY())) {
			GerarBlocoY.gerar(ecfFiscal, sb);
			GerarContadoresBlocoY.gerar(ecfFiscal);
		}

		// BLOCO9
		Registro9001 registro9001 = new Registro9001();
		registro9001.setInd_dad("0");
		ecfFiscal.getBloco9().setRegistro9001(registro9001);
		GerarBloco9.gerar(ecfFiscal.getBloco9(), sb);

		// Nova Linha ao Final do Arquivo:
		sb.append(System.lineSeparator());

		return sb;
	}
}
