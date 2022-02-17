package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoJ.BlocoJEnum;

public class ContadoresBlocoJ {

	// Bloco J
	private int contRegistroJ001 = 0;
	private int contRegistroJ050 = 0;
	private int contRegistroJ051 = 0;
	private int contRegistroJ053 = 0;
	private int contRegistroJ100 = 0;
	private int contRegistroJ990 = 0;

	public void incrementar(BlocoJEnum registrosBlocoJ) {
		contRegistroJ990++;

		switch (registrosBlocoJ) {
		case RegistroJ001:
			contRegistroJ001++;
			break;
		case RegistroJ050:
			contRegistroJ050++;
			break;
		case RegistroJ051:
			contRegistroJ051++;
			break;
		case RegistroJ053:
			contRegistroJ053++;
			break;
		case RegistroJ100:
			contRegistroJ100++;
			break;
		default:
			break;
		}
	}

	public int getContRegistroJ001() {
		return contRegistroJ001;
	}

	public void setContRegistroJ001(int contRegistroJ001) {
		this.contRegistroJ001 = contRegistroJ001;
	}

	public int getContRegistroJ050() {
		return contRegistroJ050;
	}

	public void setContRegistroJ050(int contRegistroJ050) {
		this.contRegistroJ050 = contRegistroJ050;
	}

	public int getContRegistroJ051() {
		return contRegistroJ051;
	}

	public void setContRegistroJ051(int contRegistroJ051) {
		this.contRegistroJ051 = contRegistroJ051;
	}

	public int getContRegistroJ053() {
		return contRegistroJ053;
	}

	public void setContRegistroJ053(int contRegistroJ053) {
		this.contRegistroJ053 = contRegistroJ053;
	}

	public int getContRegistroJ100() {
		return contRegistroJ100;
	}

	public int getContRegistroJ990() {
		return contRegistroJ990;
	}

	/**
	 * @param contRegistroJ990 the contRegistroJ990 to set
	 */
	public void setContRegistroJ990(int contRegistroJ990) {
		this.contRegistroJ990 = contRegistroJ990;
	}

}
