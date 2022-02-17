package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoC.BlocoCEnum;

public class ContadoresBlocoC {

	// Bloco C
	private int contRegistroC001 = 0;
	private int contRegistroC040 = 0;
	private int contRegistroC050 = 0;
	private int contRegistroC051 = 0;
	private int contRegistroC053 = 0;
	private int contRegistroC100 = 0;
	private int contRegistroC150 = 0;
	private int contRegistroC155 = 0;
	private int contRegistroC157 = 0;
	private int contRegistroC350 = 0;
	private int contRegistroC355 = 0;
	private int contRegistroC990 = 0;

	public void incrementar(BlocoCEnum registrosBlocoC) {
		contRegistroC990++;

		switch (registrosBlocoC) {
		case RegistroC001:
			contRegistroC001++;
			break;
		case RegistroC040:
			contRegistroC040++;
			break;
		case RegistroC050:
			contRegistroC050++;
			break;
		case RegistroC051:
			contRegistroC051++;
			break;
		case RegistroC053:
			contRegistroC053++;
			break;
		case RegistroC100:
			contRegistroC100++;
			break;
		case RegistroC150:
			contRegistroC150++;
			break;
		case RegistroC155:
			contRegistroC155++;
			break;
		case RegistroC157:
			contRegistroC157++;
			break;
		case RegistroC350:
			contRegistroC350++;
			break;
		case RegistroC355:
			contRegistroC355++;
			break;
		case RegistroC990:
			contRegistroC990++;
			break;
		default:
			break;
		}
	}

	public int getContRegistroC001() {
		return contRegistroC001;
	}

	public void setContRegistroC001(int contRegistroC001) {
		this.contRegistroC001 = contRegistroC001;
	}

	public int getContRegistroC040() {
		return contRegistroC040;
	}

	public void setContRegistroC040(int contRegistroC040) {
		this.contRegistroC040 = contRegistroC040;
	}
	
	public int getContRegistroC050() {
		return contRegistroC050;
	}

	public void setContRegistroC050(int contRegistroC050) {
		this.contRegistroC050 = contRegistroC050;
	}

	public int getContRegistroC051() {
		return contRegistroC051;
	}

	public void setContRegistroC051(int contRegistroC051) {
		this.contRegistroC051 = contRegistroC051;
	}
	
	public int getContRegistroC053() {
		return contRegistroC053;
	}

	public void setContRegistroC053(int contRegistroC053) {
		this.contRegistroC053 = contRegistroC053;
	}
	
	public int getContRegistroC100() {
		return contRegistroC100;
	}

	public void setContRegistroC100(int contRegistroC100) {
		this.contRegistroC100 = contRegistroC100;
	}
	
	public int getContRegistroC150() {
		return contRegistroC150;
	}

	public void setContRegistroC150(int contRegistroC150) {
		this.contRegistroC150 = contRegistroC150;
	}

	public int getContRegistroC155() {
		return contRegistroC155;
	}

	public void setContRegistroC155(int contRegistroC155) {
		this.contRegistroC155 = contRegistroC155;
	}
	
	public int getContRegistroC157() {
		return contRegistroC157;
	}

	public void setContRegistroC157(int contRegistroC157) {
		this.contRegistroC157 = contRegistroC157;
	}

	public int getContRegistroC350() {
		return contRegistroC350;
	}

	public void setContRegistroC350(int contRegistroC350) {
		this.contRegistroC350 = contRegistroC350;
	}

	public int getContRegistroC355() {
		return contRegistroC355;
	}

	public void setContRegistroC355(int contRegistroC355) {
		this.contRegistroC355 = contRegistroC355;
	}

	public void setContRegistroC990(int contRegistroC990) {
		this.contRegistroC990 = contRegistroC990;
	}

	/**
	 * @return the contRegistroC990
	 */
	public int getContRegistroC990() {
		return contRegistroC990;
	}

}
