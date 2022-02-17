package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoK.BlocoKEnum;

public class ContadoresBlocoK {

	// Bloco K
	private int contRegistroK001 = 0;
	private int contRegistroK030 = 0;
	private int contRegistroK155 = 0;
	private int contRegistroK156 = 0;
	private int contRegistroK355 = 0;
	private int contRegistroK356 = 0;
	private int contRegistroK915 = 0;
	private int contRegistroK935 = 0;
	private int contRegistroK990 = 0;

	public void incrementar(BlocoKEnum registrosBlocoM) {
		contRegistroK990++;

		switch (registrosBlocoM) {
		case RegistroK001:
			contRegistroK001++;
			break;
		case RegistroK030:
			contRegistroK030++;
			break;
		case RegistroK155:
			contRegistroK155++;
			break;
		case RegistroK156:
			contRegistroK156++;
			break;
		case RegistroK355:
			contRegistroK355++;
			break;
		case RegistroK356:
			contRegistroK356++;
			break;
		case RegistroK915:
			contRegistroK915++;
			break;
		case RegistroK935:
			contRegistroK935++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroK001() {
		return contRegistroK001;
	}

	public void setContRegistroK001(int contRegistroK001) {
		this.contRegistroK001 = contRegistroK001;
	}

	public int getContRegistroK030() {
		return contRegistroK030;
	}

	public void setContRegistroK030(int contRegistroK030) {
		this.contRegistroK030 = contRegistroK030;
	}

	public int getContRegistroK155() {
		return contRegistroK155;
	}

	public void setContRegistroK155(int contRegistroK155) {
		this.contRegistroK155 = contRegistroK155;
	}

	public int getContRegistroK156() {
		return contRegistroK156;
	}

	public void setContRegistroK156(int contRegistroK156) {
		this.contRegistroK156 = contRegistroK156;
	}

	public int getContRegistroK355() {
		return contRegistroK355;
	}

	public void setContRegistroK355(int contRegistroK355) {
		this.contRegistroK355 = contRegistroK355;
	}

	public int getContRegistroK356() {
		return contRegistroK356;
	}

	public void setContRegistroK356(int contRegistroK356) {
		this.contRegistroK356 = contRegistroK356;
	}

	public int getContRegistroK915() {
		return contRegistroK915;
	}

	public void setContRegistroK915(int contRegistroK915) {
		this.contRegistroK915 = contRegistroK915;
	}

	public int getContRegistroK935() {
		return contRegistroK935;
	}

	public void setContRegistroK935(int contRegistroK935) {
		this.contRegistroK935 = contRegistroK935;
	}

	public void setContRegistroK990(int contRegistroK990) {
		this.contRegistroK990 = contRegistroK990;
	}

	public int getContRegistroK990() {
		return contRegistroK990;
	}

}
