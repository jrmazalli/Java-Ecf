package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoP.BlocoPEnum;

public class ContadoresBlocoP {

	private int contRegistroP001 = 0;
	private int contRegistroP030 = 0;
	private int contRegistroP130 = 0;
	private int contRegistroP150 = 0;
	private int contRegistroP200 = 0;
	private int contRegistroP230 = 0;
	private int contRegistroP300 = 0;
	private int contRegistroP400 = 0;
	private int contRegistroP500 = 0;
	private int contRegistroP990 = 0;

	public void incrementar(BlocoPEnum registrosBlocoP) {
		contRegistroP990++;

		switch (registrosBlocoP) {
		case RegistroP001:
			contRegistroP001++;
			break;
		case RegistroP030:
			contRegistroP030++;
			break;
		case RegistroP130:
			contRegistroP130++;
			break;
		case RegistroP150:
			contRegistroP150++;
			break;
		case RegistroP200:
			contRegistroP200++;
			break;
		case RegistroP230:
			contRegistroP230++;
			break;
		case RegistroP300:
			contRegistroP300++;
			break;
		case RegistroP400:
			contRegistroP400++;
			break;
		case RegistroP500:
			contRegistroP500++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroP001() {
		return contRegistroP001;
	}

	public void setContRegistroP001(int contRegistroP001) {
		this.contRegistroP001 = contRegistroP001;
	}

	public int getContRegistroP030() {
		return contRegistroP030;
	}

	public void setContRegistroP030(int contRegistroP030) {
		this.contRegistroP030 = contRegistroP030;
	}

	public int getContRegistroP130() {
		return contRegistroP130;
	}

	public void setContRegistroP130(int contRegistroP130) {
		this.contRegistroP130 = contRegistroP130;
	}

	public int getContRegistroP150() {
		return contRegistroP150;
	}

	public void setContRegistroP150(int contRegistroP150) {
		this.contRegistroP150 = contRegistroP150;
	}

	public int getContRegistroP200() {
		return contRegistroP200;
	}

	public void setContRegistroP200(int contRegistroP200) {
		this.contRegistroP200 = contRegistroP200;
	}

	public int getContRegistroP230() {
		return contRegistroP230;
	}

	public void setContRegistroP230(int contRegistroP230) {
		this.contRegistroP230 = contRegistroP230;
	}

	public int getContRegistroP300() {
		return contRegistroP300;
	}

	public void setContRegistroP300(int contRegistroP300) {
		this.contRegistroP300 = contRegistroP300;
	}

	public int getContRegistroP400() {
		return contRegistroP400;
	}

	public void setContRegistroP400(int contRegistroP400) {
		this.contRegistroP400 = contRegistroP400;
	}

	public int getContRegistroP500() {
		return contRegistroP500;
	}

	public void setContRegistroP500(int contRegistroP500) {
		this.contRegistroP500 = contRegistroP500;
	}

	public int getContRegistroP990() {
		return contRegistroP990;
	}

	public void setContRegistroP990(int contRegistroP990) {
		this.contRegistroP990 = contRegistroP990;
	}

}
