package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoW.BlocoWEnum;

public class ContadoresBlocoW {

	private int contRegistroW001 = 0;
	private int contRegistroW100 = 0;
	private int contRegistroW200 = 0;
	private int contRegistroW250 = 0;
	private int contRegistroW300 = 0;
	private int contRegistroW990 = 0;

	public void incrementar(BlocoWEnum registrosBlocoW) {
		contRegistroW990++;

		switch (registrosBlocoW) {
		case RegistroW001:
			contRegistroW001++;
			break;
		case RegistroW100:
			contRegistroW100++;
			break;
		case RegistroW200:
			contRegistroW200++;
			break;
		case RegistroW250:
			contRegistroW250++;
			break;
		case RegistroW300:
			contRegistroW300++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroW001() {
		return contRegistroW001;
	}

	public void setContRegistroW001(int contRegistroW001) {
		this.contRegistroW001 = contRegistroW001;
	}

	public int getContRegistroW100() {
		return contRegistroW100;
	}

	public void setContRegistroW100(int contRegistroW100) {
		this.contRegistroW100 = contRegistroW100;
	}

	public int getContRegistroW200() {
		return contRegistroW200;
	}

	public void setContRegistroW200(int contRegistroW200) {
		this.contRegistroW200 = contRegistroW200;
	}

	public int getContRegistroW250() {
		return contRegistroW250;
	}

	public void setContRegistroW250(int contRegistroW250) {
		this.contRegistroW250 = contRegistroW250;
	}

	public int getContRegistroW300() {
		return contRegistroW300;
	}

	public void setContRegistroW300(int contRegistroW300) {
		this.contRegistroW300 = contRegistroW300;
	}

	public int getContRegistroW990() {
		return contRegistroW990;
	}

	public void setContRegistroW990(int contRegistroW990) {
		this.contRegistroW990 = contRegistroW990;
	}

}
