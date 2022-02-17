package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoL.BlocoLEnum;

public class ContadoresBlocoL {

	// Bloco I
	private int contRegistroL001 = 0;
	private int contRegistroL030 = 0;
	private int contRegistroL100 = 0;
	private int contRegistroL200 = 0;
	private int contRegistroL210 = 0;
	private int contRegistroL300 = 0;
	private int contRegistroL990 = 0;

	public void incrementar(BlocoLEnum registrosBlocoL) {
		contRegistroL990++;

		switch (registrosBlocoL) {
		case RegistroL001:
			contRegistroL001++;
			break;
		case RegistroL030:
			contRegistroL030++;
			break;
		case RegistroL100:
			contRegistroL100++;
			break;
		case RegistroL200:
			contRegistroL200++;
			break;
		case RegistroL210:
			contRegistroL210++;
			break;
		case RegistroL300:
			contRegistroL300++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroL001() {
		return contRegistroL001;
	}

	public void setContRegistroL001(int contRegistroL001) {
		this.contRegistroL001 = contRegistroL001;
	}

	public int getContRegistroL030() {
		return contRegistroL030;
	}

	public void setContRegistroL030(int contRegistroL030) {
		this.contRegistroL030 = contRegistroL030;
	}

	public int getContRegistroL100() {
		return contRegistroL100;
	}

	public void setContRegistroL100(int contRegistroL100) {
		this.contRegistroL100 = contRegistroL100;
	}

	public int getContRegistroL200() {
		return contRegistroL200;
	}

	public void setContRegistroL200(int contRegistroL200) {
		this.contRegistroL200 = contRegistroL200;
	}

	public int getContRegistroL210() {
		return contRegistroL210;
	}

	public void setContRegistroL210(int contRegistroL210) {
		this.contRegistroL210 = contRegistroL210;
	}

	public int getContRegistroL300() {
		return contRegistroL300;
	}

	public void setContRegistroL300(int contRegistroL300) {
		this.contRegistroL300 = contRegistroL300;
	}

	public void setContRegistroL990(int contRegistroL990) {
		this.contRegistroL990 = contRegistroL990;
	}

	public int getContRegistroL990() {
		return contRegistroL990;
	}

}
