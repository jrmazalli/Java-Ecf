package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoE.BlocoEEnum;

public class ContadoresBlocoE {

	private int contRegistroE001 = 0;
	private int contRegistroE010 = 0;
	private int contRegistroE015 = 0;
	private int contRegistroE020 = 0;
	private int contRegistroE030 = 0;
	private int contRegistroE155 = 0;
	private int contRegistroE355 = 0;
	private int contRegistroE990 = 0;

	public void incrementar(BlocoEEnum registrosBlocoE) {
		contRegistroE990++;

		switch (registrosBlocoE) {
		case RegistroE001:
			contRegistroE001++;
			break;
		case RegistroE010:
			contRegistroE010++;
			break;
		case RegistroE015:
			contRegistroE015++;
			break;
		case RegistroE020:
			contRegistroE020++;
			break;
		case RegistroE030:
			contRegistroE030++;
			break;
		case RegistroE155:
			contRegistroE155++;
			break;
		case RegistroE355:
			contRegistroE355++;
			break;
		default:
			break;
		}
	}

	public int getContRegistroE001() {
		return contRegistroE001;
	}

	public void setContRegistroE001(int contRegistroE001) {
		this.contRegistroE001 = contRegistroE001;
	}

	public int getContRegistroE010() {
		return contRegistroE010;
	}

	public void setContRegistroE010(int contRegistroE010) {
		this.contRegistroE010 = contRegistroE010;
	}

	public int getContRegistroE015() {
		return contRegistroE015;
	}

	public void setContRegistroE015(int contRegistroE015) {
		this.contRegistroE015 = contRegistroE015;
	}

	public int getContRegistroE020() {
		return contRegistroE020;
	}

	public void setContRegistroE020(int contRegistroE020) {
		this.contRegistroE020 = contRegistroE020;
	}

	public int getContRegistroE030() {
		return contRegistroE030;
	}

	public void setContRegistroE030(int contRegistroE030) {
		this.contRegistroE030 = contRegistroE030;
	}

	public int getContRegistroE155() {
		return contRegistroE155;
	}

	public void setContRegistroE155(int contRegistroE155) {
		this.contRegistroE155 = contRegistroE155;
	}

	public int getContRegistroE355() {
		return contRegistroE355;
	}

	public void setContRegistroE355(int contRegistroE355) {
		this.contRegistroE355 = contRegistroE355;
	}

	public int getContRegistroE990() {
		return contRegistroE990;
	}

	public void setContRegistroE990(int contRegistroE990) {
		this.contRegistroE990 = contRegistroE990;
	}

}
