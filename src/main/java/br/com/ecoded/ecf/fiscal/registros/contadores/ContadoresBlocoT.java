package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoT.BlocoTEnum;

public class ContadoresBlocoT {

	private int contRegistroT001 = 0;
	private int contRegistroT030 = 0;
	private int contRegistroT120 = 0;
	private int contRegistroT150 = 0;
	private int contRegistroT170 = 0;
	private int contRegistroT181 = 0;
	private int contRegistroT990 = 0;

	public void incrementar(BlocoTEnum registrosBlocoT) {
		contRegistroT990++;

		switch (registrosBlocoT) {
		case RegistroT001:
			contRegistroT001++;
			break;
		case RegistroT030:
			contRegistroT030++;
			break;
		case RegistroT120:
			contRegistroT120++;
			break;
		case RegistroT150:
			contRegistroT150++;
			break;
		case RegistroT170:
			contRegistroT170++;
			break;
		case RegistroT181:
			contRegistroT181++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroT001() {
		return contRegistroT001;
	}

	public void setContRegistroT001(int contRegistroT001) {
		this.contRegistroT001 = contRegistroT001;
	}

	public int getContRegistroT030() {
		return contRegistroT030;
	}

	public void setContRegistroT030(int contRegistroT030) {
		this.contRegistroT030 = contRegistroT030;
	}

	public int getContRegistroT120() {
		return contRegistroT120;
	}

	public void setContRegistroT120(int contRegistroT120) {
		this.contRegistroT120 = contRegistroT120;
	}

	public int getContRegistroT150() {
		return contRegistroT150;
	}

	public void setContRegistroT150(int contRegistroT150) {
		this.contRegistroT150 = contRegistroT150;
	}

	public int getContRegistroT170() {
		return contRegistroT170;
	}

	public void setContRegistroT170(int contRegistroT170) {
		this.contRegistroT170 = contRegistroT170;
	}

	public int getContRegistroT181() {
		return contRegistroT181;
	}

	public void setContRegistroT181(int contRegistroT181) {
		this.contRegistroT181 = contRegistroT181;
	}

	public int getContRegistroT990() {
		return contRegistroT990;
	}

	public void setContRegistroT990(int contRegistroT990) {
		this.contRegistroT990 = contRegistroT990;
	}

}
