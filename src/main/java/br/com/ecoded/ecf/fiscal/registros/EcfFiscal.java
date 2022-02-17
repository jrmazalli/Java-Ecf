package br.com.ecoded.ecf.fiscal.registros;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Bloco0;
import br.com.ecoded.ecf.fiscal.registros.bloco9.Bloco9;
import br.com.ecoded.ecf.fiscal.registros.blocoC.BlocoC;
import br.com.ecoded.ecf.fiscal.registros.blocoE.BlocoE;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecf.fiscal.registros.blocoK.BlocoK;
import br.com.ecoded.ecf.fiscal.registros.blocoL.BlocoL;
import br.com.ecoded.ecf.fiscal.registros.blocoM.BlocoM;
import br.com.ecoded.ecf.fiscal.registros.blocoN.BlocoN;
import br.com.ecoded.ecf.fiscal.registros.blocoP.BlocoP;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.BlocoQ;
import br.com.ecoded.ecf.fiscal.registros.blocoT.BlocoT;
import br.com.ecoded.ecf.fiscal.registros.blocoU.BlocoU;
import br.com.ecoded.ecf.fiscal.registros.blocoV.BlocoV;
import br.com.ecoded.ecf.fiscal.registros.blocoW.BlocoW;
import br.com.ecoded.ecf.fiscal.registros.blocoX.BlocoX;
import br.com.ecoded.ecf.fiscal.registros.blocoY.BlocoY;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBloco0;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoC;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoE;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoJ;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoK;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoL;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoM;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoN;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoP;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoQ;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoT;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoU;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoV;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoW;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoX;
import br.com.ecoded.ecf.fiscal.registros.contadores.ContadoresBlocoY;

public class EcfFiscal {

	private Bloco0 bloco0;
	private BlocoC blocoC;
	private BlocoE blocoE;
	private BlocoJ blocoJ;
	private BlocoK blocoK;
	private BlocoL blocoL;
	private BlocoM blocoM;
	private BlocoN blocoN;
	private BlocoP blocoP;
	private BlocoQ blocoQ;
	private BlocoT blocoT;
	private BlocoU blocoU;
	private BlocoV blocoV;
	private BlocoW blocoW;
	private BlocoX blocoX;
	private BlocoY blocoY;
	private Bloco9 bloco9;

	private ContadoresBloco0 contadoresBloco0;
	private ContadoresBlocoC contadoresBlocoC;
	private ContadoresBlocoE contadoresBlocoE;
	private ContadoresBlocoJ contadoresBlocoJ;
	private ContadoresBlocoK contadoresBlocoK;
	private ContadoresBlocoL contadoresBlocoL;
	private ContadoresBlocoM contadoresBlocoM;
	private ContadoresBlocoN contadoresBlocoN;
	private ContadoresBlocoP contadoresBlocoP;
	private ContadoresBlocoQ contadoresBlocoQ;
	private ContadoresBlocoT contadoresBlocoT;
	private ContadoresBlocoU contadoresBlocoU;
	private ContadoresBlocoV contadoresBlocoV;
	private ContadoresBlocoW contadoresBlocoW;
	private ContadoresBlocoX contadoresBlocoX;
	private ContadoresBlocoY contadoresBlocoY;

	public EcfFiscal() {
		this.contadoresBloco0 = new ContadoresBloco0();
		this.contadoresBlocoC = new ContadoresBlocoC();
		this.contadoresBlocoE = new ContadoresBlocoE();
		this.contadoresBlocoJ = new ContadoresBlocoJ();
		this.contadoresBlocoK = new ContadoresBlocoK();
		this.contadoresBlocoL = new ContadoresBlocoL();
		this.contadoresBlocoM = new ContadoresBlocoM();
		this.contadoresBlocoN = new ContadoresBlocoN();
		this.contadoresBlocoP = new ContadoresBlocoP();
		this.contadoresBlocoQ = new ContadoresBlocoQ();
		this.contadoresBlocoT = new ContadoresBlocoT();
		this.contadoresBlocoU = new ContadoresBlocoU();
		this.contadoresBlocoV = new ContadoresBlocoV();
		this.contadoresBlocoW = new ContadoresBlocoW();
		this.contadoresBlocoX = new ContadoresBlocoX();
		this.contadoresBlocoY = new ContadoresBlocoY();
	}

	public Bloco0 getBloco0() {
		return bloco0;
	}

	public void setBloco0(Bloco0 bloco0) {
		this.bloco0 = bloco0;
	}

	public BlocoC getBlocoC() {
		return blocoC;
	}

	public void setBlocoC(BlocoC blocoC) {
		this.blocoC = blocoC;
	}

	public BlocoJ getBlocoJ() {
		return blocoJ;
	}

	public void setBlocoJ(BlocoJ blocoJ) {
		this.blocoJ = blocoJ;
	}

	public BlocoK getBlocoK() {
		return blocoK;
	}

	public void setBlocoK(BlocoK blocoK) {
		this.blocoK = blocoK;
	}

	public BlocoE getBlocoE() {
		return blocoE;
	}

	public void setBlocoE(BlocoE blocoE) {
		this.blocoE = blocoE;
	}

	public BlocoL getBlocoL() {
		return blocoL;
	}

	public void setBlocoL(BlocoL blocoL) {
		this.blocoL = blocoL;
	}

	public BlocoM getBlocoM() {
		return blocoM;
	}

	public void setBlocoM(BlocoM blocoM) {
		this.blocoM = blocoM;
	}

	public BlocoN getBlocoN() {
		return blocoN;
	}

	public void setBlocoN(BlocoN blocoN) {
		this.blocoN = blocoN;
	}

	public BlocoP getBlocoP() {
		return blocoP;
	}

	public void setBlocoP(BlocoP blocoP) {
		this.blocoP = blocoP;
	}

	public BlocoQ getBlocoQ() {
		return blocoQ;
	}

	public void setBlocoQ(BlocoQ blocoQ) {
		this.blocoQ = blocoQ;
	}

	public BlocoT getBlocoT() {
		return blocoT;
	}

	public void setBlocoT(BlocoT blocoT) {
		this.blocoT = blocoT;
	}

	public BlocoU getBlocoU() {
		return blocoU;
	}

	public void setBlocoU(BlocoU blocoU) {
		this.blocoU = blocoU;
	}

	public BlocoV getBlocoV() {
		return blocoV;
	}

	public void setBlocoV(BlocoV blocoV) {
		this.blocoV = blocoV;
	}

	public BlocoW getBlocoW() {
		return blocoW;
	}

	public void setBlocoW(BlocoW blocoW) {
		this.blocoW = blocoW;
	}

	public BlocoX getBlocoX() {
		return blocoX;
	}

	public void setBlocoX(BlocoX blocoX) {
		this.blocoX = blocoX;
	}

	public BlocoY getBlocoY() {
		return blocoY;
	}

	public void setBlocoY(BlocoY blocoY) {
		this.blocoY = blocoY;
	}

	public Bloco9 getBloco9() {
		return bloco9;
	}

	public void setBloco9(Bloco9 bloco9) {
		this.bloco9 = bloco9;
	}

	public ContadoresBloco0 getContadoresBloco0() {
		return contadoresBloco0;
	}

	public void setContadoresBloco0(ContadoresBloco0 contadoresBloco0) {
		this.contadoresBloco0 = contadoresBloco0;
	}

	public ContadoresBlocoC getContadoresBlocoC() {
		return contadoresBlocoC;
	}

	public void setContadoresBlocoC(ContadoresBlocoC contadoresBlocoC) {
		this.contadoresBlocoC = contadoresBlocoC;
	}

	public ContadoresBlocoL getContadoresBlocoI() {
		return contadoresBlocoL;
	}

	public void setContadoresBlocoI(ContadoresBlocoL contadoresBlocoL) {
		this.contadoresBlocoL = contadoresBlocoL;
	}

	public ContadoresBlocoJ getContadoresBlocoJ() {
		return contadoresBlocoJ;
	}

	public void setContadoresBlocoJ(ContadoresBlocoJ contadoresBlocoJ) {
		this.contadoresBlocoJ = contadoresBlocoJ;
	}

	public ContadoresBlocoK getContadoresBlocoK() {
		return contadoresBlocoK;
	}

	public void setContadoresBlocoK(ContadoresBlocoK contadoresBlocoK) {
		this.contadoresBlocoK = contadoresBlocoK;
	}

	public ContadoresBlocoE getContadoresBlocoE() {
		return contadoresBlocoE;
	}

	public void setContadoresBlocoE(ContadoresBlocoE contadoresBlocoE) {
		this.contadoresBlocoE = contadoresBlocoE;
	}

	public ContadoresBlocoL getContadoresBlocoL() {
		return contadoresBlocoL;
	}

	public void setContadoresBlocoL(ContadoresBlocoL contadoresBlocoL) {
		this.contadoresBlocoL = contadoresBlocoL;
	}

	public ContadoresBlocoM getContadoresBlocoM() {
		return contadoresBlocoM;
	}

	public void setContadoresBlocoM(ContadoresBlocoM contadoresBlocoM) {
		this.contadoresBlocoM = contadoresBlocoM;
	}

	public ContadoresBlocoN getContadoresBlocoN() {
		return contadoresBlocoN;
	}

	public void setContadoresBlocoN(ContadoresBlocoN contadoresBlocoN) {
		this.contadoresBlocoN = contadoresBlocoN;
	}

	public ContadoresBlocoP getContadoresBlocoP() {
		return contadoresBlocoP;
	}

	public void setContadoresBlocoP(ContadoresBlocoP contadoresBlocoP) {
		this.contadoresBlocoP = contadoresBlocoP;
	}

	public ContadoresBlocoQ getContadoresBlocoQ() {
		return contadoresBlocoQ;
	}

	public void setContadoresBlocoQ(ContadoresBlocoQ contadoresBlocoQ) {
		this.contadoresBlocoQ = contadoresBlocoQ;
	}

	public ContadoresBlocoT getContadoresBlocoT() {
		return contadoresBlocoT;
	}

	public void setContadoresBlocoT(ContadoresBlocoT contadoresBlocoT) {
		this.contadoresBlocoT = contadoresBlocoT;
	}

	public ContadoresBlocoU getContadoresBlocoU() {
		return contadoresBlocoU;
	}

	public void setContadoresBlocoU(ContadoresBlocoU contadoresBlocoU) {
		this.contadoresBlocoU = contadoresBlocoU;
	}

	public ContadoresBlocoV getContadoresBlocoV() {
		return contadoresBlocoV;
	}

	public void setContadoresBlocoV(ContadoresBlocoV contadoresBlocoV) {
		this.contadoresBlocoV = contadoresBlocoV;
	}

	public ContadoresBlocoW getContadoresBlocoW() {
		return contadoresBlocoW;
	}

	public void setContadoresBlocoW(ContadoresBlocoW contadoresBlocoW) {
		this.contadoresBlocoW = contadoresBlocoW;
	}

	public ContadoresBlocoX getContadoresBlocoX() {
		return contadoresBlocoX;
	}

	public void setContadoresBlocoX(ContadoresBlocoX contadoresBlocoX) {
		this.contadoresBlocoX = contadoresBlocoX;
	}

	public ContadoresBlocoY getContadoresBlocoY() {
		return contadoresBlocoY;
	}

	public void setContadoresBlocoY(ContadoresBlocoY contadoresBlocoY) {
		this.contadoresBlocoY = contadoresBlocoY;
	}

}
