package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoN.BlocoNEnum;

public class ContadoresBlocoN {

	private int contRegistroN001 = 0;
	private int contRegistroN030 = 0;
	private int contRegistroN500 = 0;
	private int contRegistroN600 = 0;
	private int contRegistroN610 = 0;
	private int contRegistroN615 = 0;
	private int contRegistroN620 = 0;
	private int contRegistroN630 = 0;
	private int contRegistroN650 = 0;
	private int contRegistroN660 = 0;
	private int contRegistroN670 = 0;
	private int contRegistroN990 = 0;

	public void incrementar(BlocoNEnum registrosBlocoN) {
		contRegistroN990++;

		switch (registrosBlocoN) {
		case RegistroN001:
			contRegistroN001++;
			break;
		case RegistroN030:
			contRegistroN030++;
			break;
		case RegistroN500:
			contRegistroN500++;
			break;
		case RegistroN600:
			contRegistroN600++;
			break;
		case RegistroN610:
			contRegistroN610++;
			break;
		case RegistroN615:
			contRegistroN615++;
			break;
		case RegistroN620:
			contRegistroN620++;
			break;
		case RegistroN630:
			contRegistroN630++;
			break;
		case RegistroN650:
			contRegistroN650++;
			break;
		case RegistroN660:
			contRegistroN660++;
			break;
		case RegistroN670:
			contRegistroN670++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroN001() {
		return contRegistroN001;
	}

	public void setContRegistroN001(int contRegistroN001) {
		this.contRegistroN001 = contRegistroN001;
	}

	public int getContRegistroN030() {
		return contRegistroN030;
	}

	public void setContRegistroN030(int contRegistroN030) {
		this.contRegistroN030 = contRegistroN030;
	}

	public int getContRegistroN500() {
		return contRegistroN500;
	}

	public void setContRegistroN500(int contRegistroN500) {
		this.contRegistroN500 = contRegistroN500;
	}

	public int getContRegistroN600() {
		return contRegistroN600;
	}

	public void setContRegistroN600(int contRegistroN600) {
		this.contRegistroN600 = contRegistroN600;
	}

	public int getContRegistroN610() {
		return contRegistroN610;
	}

	public void setContRegistroN610(int contRegistroN610) {
		this.contRegistroN610 = contRegistroN610;
	}

	public int getContRegistroN615() {
		return contRegistroN615;
	}

	public void setContRegistroN615(int contRegistroN615) {
		this.contRegistroN615 = contRegistroN615;
	}

	public int getContRegistroN620() {
		return contRegistroN620;
	}

	public void setContRegistroN620(int contRegistroN620) {
		this.contRegistroN620 = contRegistroN620;
	}

	public int getContRegistroN630() {
		return contRegistroN630;
	}

	public void setContRegistroN630(int contRegistroN630) {
		this.contRegistroN630 = contRegistroN630;
	}

	public int getContRegistroN650() {
		return contRegistroN650;
	}

	public void setContRegistroN650(int contRegistroN650) {
		this.contRegistroN650 = contRegistroN650;
	}

	public int getContRegistroN660() {
		return contRegistroN660;
	}

	public void setContRegistroN660(int contRegistroN660) {
		this.contRegistroN660 = contRegistroN660;
	}

	public int getContRegistroN670() {
		return contRegistroN670;
	}

	public void setContRegistroN670(int contRegistroN670) {
		this.contRegistroN670 = contRegistroN670;
	}

	public int getContRegistroN990() {
		return contRegistroN990;
	}

	public void setContRegistroN990(int contRegistroN990) {
		this.contRegistroN990 = contRegistroN990;
	}

}
