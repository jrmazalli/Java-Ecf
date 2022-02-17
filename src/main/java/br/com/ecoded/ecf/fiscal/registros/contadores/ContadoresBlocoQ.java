package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoQ.BlocoQEnum;

public class ContadoresBlocoQ {

	private int contRegistroQ001 = 0;
	private int contRegistroQ100 = 0;
	private int contRegistroQ990 = 0;

	public void incrementar(BlocoQEnum registrosBlocoQ) {
		contRegistroQ990++;

		switch (registrosBlocoQ) {
		case RegistroQ001:
			contRegistroQ001++;
			break;
		case RegistroQ100:
			contRegistroQ100++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroQ001() {
		return contRegistroQ001;
	}

	public void setContRegistroQ001(int contRegistroQ001) {
		this.contRegistroQ001 = contRegistroQ001;
	}

	public int getContRegistroQ100() {
		return contRegistroQ100;
	}

	public void setContRegistroQ100(int contRegistroQ100) {
		this.contRegistroQ100 = contRegistroQ100;
	}

	public int getContRegistroQ990() {
		return contRegistroQ990;
	}

	public void setContRegistroQ990(int contRegistroQ990) {
		this.contRegistroQ990 = contRegistroQ990;
	}

}
