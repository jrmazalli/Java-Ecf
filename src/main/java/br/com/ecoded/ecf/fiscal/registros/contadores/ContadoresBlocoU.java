package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoU.BlocoUEnum;

public class ContadoresBlocoU {

	private int contRegistroU001 = 0;
	private int contRegistroU030 = 0;
	private int contRegistroU100 = 0;
	private int contRegistroU150 = 0;
	private int contRegistroU180 = 0;
	private int contRegistroU182 = 0;
	private int contRegistroU990 = 0;

	public void incrementar(BlocoUEnum registrosBlocoU) {
		contRegistroU990++;

		switch (registrosBlocoU) {
		case RegistroU001:
			contRegistroU001++;
			break;
		case RegistroU030:
			contRegistroU030++;
			break;
		case RegistroU100:
			contRegistroU100++;
			break;
		case RegistroU150:
			contRegistroU150++;
			break;
		case RegistroU180:
			contRegistroU180++;
			break;
		case RegistroU182:
			contRegistroU182++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroU001() {
		return contRegistroU001;
	}

	public void setContRegistroU001(int contRegistroU001) {
		this.contRegistroU001 = contRegistroU001;
	}

	public int getContRegistroU030() {
		return contRegistroU030;
	}

	public void setContRegistroU030(int contRegistroU030) {
		this.contRegistroU030 = contRegistroU030;
	}

	public int getContRegistroU100() {
		return contRegistroU100;
	}

	public void setContRegistroU100(int contRegistroU100) {
		this.contRegistroU100 = contRegistroU100;
	}

	public int getContRegistroU150() {
		return contRegistroU150;
	}

	public void setContRegistroU150(int contRegistroU150) {
		this.contRegistroU150 = contRegistroU150;
	}

	public int getContRegistroU180() {
		return contRegistroU180;
	}

	public void setContRegistroU180(int contRegistroU180) {
		this.contRegistroU180 = contRegistroU180;
	}

	public int getContRegistroU182() {
		return contRegistroU182;
	}

	public void setContRegistroU182(int contRegistroU182) {
		this.contRegistroU182 = contRegistroU182;
	}

	public int getContRegistroU990() {
		return contRegistroU990;
	}

	public void setContRegistroU990(int contRegistroU990) {
		this.contRegistroU990 = contRegistroU990;
	}

}
