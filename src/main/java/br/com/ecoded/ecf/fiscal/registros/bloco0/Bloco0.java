package br.com.ecoded.ecf.fiscal.registros.bloco0;

import java.util.ArrayList;
import java.util.List;

public class Bloco0 {

	private Registro0000 registro0000;
	private Registro0001 registro0001;
	private Registro0010 registro0010;
	private Registro0020 registro0020;
	private Registro0021 registro0021;
	private Registro0030 registro0030;
	private Registro0035 registro0035;
	private List<Registro0930> registro0930;
	private Registro0990 registro0990;

	public Registro0000 getRegistro0000() {
		return registro0000;
	}

	public void setRegistro0000(Registro0000 registro0000) {
		this.registro0000 = registro0000;
	}

	public Registro0001 getRegistro0001() {
		return registro0001;
	}

	public void setRegistro0001(Registro0001 registro0001) {
		this.registro0001 = registro0001;
	}

	public Registro0010 getRegistro0010() {
		return registro0010;
	}

	public void setRegistro0010(Registro0010 registro0010) {
		this.registro0010 = registro0010;
	}

	public Registro0020 getRegistro0020() {
		return registro0020;
	}

	public void setRegistro0020(Registro0020 registro0020) {
		this.registro0020 = registro0020;
	}

	public Registro0021 getRegistro0021() {
		return registro0021;
	}

	public void setRegistro0021(Registro0021 registro0021) {
		this.registro0021 = registro0021;
	}

	public Registro0030 getRegistro0030() {
		return registro0030;
	}

	public void setRegistro0030(Registro0030 registro0030) {
		this.registro0030 = registro0030;
	}

	public Registro0035 getRegistro0035() {
		return registro0035;
	}

	public void setRegistro0035(Registro0035 registro0035) {
		this.registro0035 = registro0035;
	}

	public List<Registro0930> getRegistro0930() {
		if (registro0930 == null) {
			registro0930 = new ArrayList<Registro0930>();
		}
		return this.registro0930;
	}

	public void setRegistro0930(List<Registro0930> registro0930) {
		this.registro0930 = registro0930;
	}

	public Registro0990 getRegistro0990() {
		return registro0990;
	}

	public void setRegistro0990(Registro0990 registro0990) {
		this.registro0990 = registro0990;
	}

}
