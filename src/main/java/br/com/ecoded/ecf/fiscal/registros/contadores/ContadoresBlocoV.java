package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoV.BlocoVEnum;

public class ContadoresBlocoV {

	private int contRegistroV001 = 0;
	private int contRegistroV010 = 0;
	private int contRegistroV020 = 0;
	private int contRegistroV030 = 0;
	private int contRegistroV100 = 0;
	private int contRegistroV990 = 0;

	public void incrementar(BlocoVEnum registrosBlocoV) {
		contRegistroV990++;

		switch (registrosBlocoV) {
		case RegistroV001:
			contRegistroV001++;
			break;
		case RegistroV010:
			contRegistroV010++;
			break;
		case RegistroV020:
			contRegistroV020++;
			break;
		case RegistroV030:
			contRegistroV030++;
			break;
		case RegistroV100:
			contRegistroV100++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroV001() {
		return contRegistroV001;
	}

	public void setContRegistroV001(int contRegistroV001) {
		this.contRegistroV001 = contRegistroV001;
	}

	public int getContRegistroV010() {
		return contRegistroV010;
	}

	public void setContRegistroV010(int contRegistroV010) {
		this.contRegistroV010 = contRegistroV010;
	}

	public int getContRegistroV020() {
		return contRegistroV020;
	}

	public void setContRegistroV020(int contRegistroV020) {
		this.contRegistroV020 = contRegistroV020;
	}

	public int getContRegistroV030() {
		return contRegistroV030;
	}

	public void setContRegistroV030(int contRegistroV030) {
		this.contRegistroV030 = contRegistroV030;
	}

	public int getContRegistroV100() {
		return contRegistroV100;
	}

	public void setContRegistroV100(int contRegistroV100) {
		this.contRegistroV100 = contRegistroV100;
	}

	public int getContRegistroV990() {
		return contRegistroV990;
	}

	public void setContRegistroV990(int contRegistroV990) {
		this.contRegistroV990 = contRegistroV990;
	}

}
