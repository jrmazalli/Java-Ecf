package br.com.ecoded.ecf.fiscal.registros.contadores;

import br.com.ecoded.ecf.fiscal.registros.blocoM.BlocoMEnum;

public class ContadoresBlocoM {

	private int contRegistroM001 = 0;
	private int contRegistroM010 = 0;
	private int contRegistroM030 = 0;
	private int contRegistroM300 = 0;
	private int contRegistroM305 = 0;
	private int contRegistroM310 = 0;
	private int contRegistroM312 = 0;
	private int contRegistroM315 = 0;
	private int contRegistroM350 = 0;
	private int contRegistroM355 = 0;
	private int contRegistroM360 = 0;
	private int contRegistroM362 = 0;
	private int contRegistroM365 = 0;
	private int contRegistroM410 = 0;
	private int contRegistroM415 = 0;
	private int contRegistroM500 = 0;
	private int contRegistroM510 = 0;
	private int contRegistroM990 = 0;

	public void incrementar(BlocoMEnum registrosBlocoM) {
		contRegistroM990++;

		switch (registrosBlocoM) {
		case RegistroM001:
			contRegistroM001++;
			break;
		case RegistroM010:
			contRegistroM010++;
			break;
		case RegistroM030:
			contRegistroM030++;
			break;
		case RegistroM300:
			contRegistroM300++;
			break;
		case RegistroM305:
			contRegistroM305++;
			break;
		case RegistroM310:
			contRegistroM310++;
			break;
		case RegistroM312:
			contRegistroM312++;
			break;
		case RegistroM315:
			contRegistroM315++;
			break;
		case RegistroM350:
			contRegistroM350++;
			break;
		case RegistroM355:
			contRegistroM355++;
			break;
		case RegistroM360:
			contRegistroM360++;
			break;
		case RegistroM362:
			contRegistroM362++;
			break;
		case RegistroM365:
			contRegistroM365++;
			break;
		case RegistroM410:
			contRegistroM410++;
			break;
		case RegistroM415:
			contRegistroM415++;
			break;
		case RegistroM500:
			contRegistroM500++;
			break;
		case RegistroM510:
			contRegistroM510++;
			break;
		default:
			break;
		}
	}

	public int getContRegistroM001() {
		return contRegistroM001;
	}

	public void setContRegistroM001(int contRegistroM001) {
		this.contRegistroM001 = contRegistroM001;
	}

	public int getContRegistroM010() {
		return contRegistroM010;
	}

	public void setContRegistroM010(int contRegistroM010) {
		this.contRegistroM010 = contRegistroM010;
	}

	public int getContRegistroM030() {
		return contRegistroM030;
	}

	public void setContRegistroM030(int contRegistroM030) {
		this.contRegistroM030 = contRegistroM030;
	}

	public int getContRegistroM300() {
		return contRegistroM300;
	}

	public void setContRegistroM300(int contRegistroM300) {
		this.contRegistroM300 = contRegistroM300;
	}

	public int getContRegistroM305() {
		return contRegistroM305;
	}

	public void setContRegistroM305(int contRegistroM305) {
		this.contRegistroM305 = contRegistroM305;
	}

	public int getContRegistroM310() {
		return contRegistroM310;
	}

	public void setContRegistroM310(int contRegistroM310) {
		this.contRegistroM310 = contRegistroM310;
	}

	public int getContRegistroM312() {
		return contRegistroM312;
	}

	public void setContRegistroM312(int contRegistroM312) {
		this.contRegistroM312 = contRegistroM312;
	}

	public int getContRegistroM315() {
		return contRegistroM315;
	}

	public void setContRegistroM315(int contRegistroM315) {
		this.contRegistroM315 = contRegistroM315;
	}

	public int getContRegistroM350() {
		return contRegistroM350;
	}

	public void setContRegistroM350(int contRegistroM350) {
		this.contRegistroM350 = contRegistroM350;
	}

	public int getContRegistroM355() {
		return contRegistroM355;
	}

	public void setContRegistroM355(int contRegistroM355) {
		this.contRegistroM355 = contRegistroM355;
	}

	public int getContRegistroM360() {
		return contRegistroM360;
	}

	public void setContRegistroM360(int contRegistroM360) {
		this.contRegistroM360 = contRegistroM360;
	}

	public int getContRegistroM362() {
		return contRegistroM362;
	}

	public void setContRegistroM362(int contRegistroM362) {
		this.contRegistroM362 = contRegistroM362;
	}

	public int getContRegistroM365() {
		return contRegistroM365;
	}

	public void setContRegistroM365(int contRegistroM365) {
		this.contRegistroM365 = contRegistroM365;
	}

	public int getContRegistroM410() {
		return contRegistroM410;
	}

	public void setContRegistroM410(int contRegistroM410) {
		this.contRegistroM410 = contRegistroM410;
	}

	public int getContRegistroM415() {
		return contRegistroM415;
	}

	public void setContRegistroM415(int contRegistroM415) {
		this.contRegistroM415 = contRegistroM415;
	}

	public int getContRegistroM500() {
		return contRegistroM500;
	}

	public void setContRegistroM500(int contRegistroM500) {
		this.contRegistroM500 = contRegistroM500;
	}

	public int getContRegistroM510() {
		return contRegistroM510;
	}

	public void setContRegistroM510(int contRegistroM510) {
		this.contRegistroM510 = contRegistroM510;
	}

	public int getContRegistroM990() {
		return contRegistroM990;
	}

	public void setContRegistroM990(int contRegistroM990) {
		this.contRegistroM990 = contRegistroM990;
	}

}
