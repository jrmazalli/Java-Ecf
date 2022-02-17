package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Bloco0Enum;

public class ContadoresBloco0 {

	// BLOCO 0
	private int contRegistro0000 = 0;
	private int contRegistro0001 = 0;
	private int contRegistro0010 = 0;
	private int contRegistro0020 = 0;
	private int contRegistro0021 = 0;
	private int contRegistro0030 = 0;
	private int contRegistro0035 = 0;
	private int contRegistro0930 = 0;
	private int contRegistro0990 = 0;

	public void incrementar(Bloco0Enum registroBloco0) {

		contRegistro0990++;

		switch (registroBloco0) {
		case Registro0000:
			contRegistro0000++;
			break;
		case Registro0001:
			contRegistro0001++;
			break;
		case Registro0010:
			contRegistro0010++;
			break;
		case Registro0020:
			contRegistro0020++;
			break;
		case Registro0021:
			contRegistro0021++;
			break;
		case Registro0030:
			contRegistro0030++;
			break;
		case Registro0035:
			contRegistro0035++;
			break;
		case Registro0930:
			contRegistro0930++;
			break;
		default:
			break;
		}
	}

	public int getContRegistro0000() {
		return contRegistro0000;
	}

	public void setContRegistro0000(int contRegistro0000) {
		this.contRegistro0000 = contRegistro0000;
	}

	public int getContRegistro0001() {
		return contRegistro0001;
	}

	public void setContRegistro0001(int contRegistro0001) {
		this.contRegistro0001 = contRegistro0001;
	}

	public int getContRegistro0010() {
		return contRegistro0010;
	}

	public void setContRegistro0010(int contRegistro0010) {
		this.contRegistro0010 = contRegistro0010;
	}

	public int getContRegistro0020() {
		return contRegistro0020;
	}

	public void setContRegistro0020(int contRegistro0020) {
		this.contRegistro0020 = contRegistro0020;
	}

	public int getContRegistro0021() {
		return contRegistro0021;
	}

	public void setContRegistro0021(int contRegistro0021) {
		this.contRegistro0021 = contRegistro0021;
	}

	public int getContRegistro0030() {
		return contRegistro0030;
	}

	public void setContRegistro0030(int contRegistro0030) {
		this.contRegistro0030 = contRegistro0030;
	}

	public int getContRegistro0035() {
		return contRegistro0035;
	}

	public void setContRegistro0035(int contRegistro0035) {
		this.contRegistro0035 = contRegistro0035;
	}

	public int getContRegistro0930() {
		return contRegistro0930;
	}

	public void setContRegistro0930(int contRegistro0930) {
		this.contRegistro0930 = contRegistro0930;
	}

	public void setContRegistro0990(int contRegistro0990) {
		this.contRegistro0990 = contRegistro0990;
	}

	/**
	 * @return the contRegistro0990
	 */
	public int getContRegistro0990() {
		return contRegistro0990;
	}

}
