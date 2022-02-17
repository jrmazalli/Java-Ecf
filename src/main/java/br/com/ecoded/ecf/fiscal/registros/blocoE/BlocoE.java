package br.com.ecoded.ecf.fiscal.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

public class BlocoE {

	private RegistroE001 registroE001;
	private List<RegistroE010> registroE010;
	private List<RegistroE015> registroE015;
	private List<RegistroE020> registroE020;
	private List<RegistroE030> registroE030;
	private List<RegistroE155> registroE155;
	private List<RegistroE355> registroE355;
	private RegistroE990 registroE990;

	public RegistroE001 getRegistroE001() {
		return registroE001;
	}

	public void setRegistroE001(RegistroE001 registroE001) {
		this.registroE001 = registroE001;
	}

	public List<RegistroE010> getRegistroE010() {
		if (registroE010 == null) {
			registroE010 = new ArrayList<RegistroE010>();
		}
		return this.registroE010;
	}

	public void setRegistroE010(List<RegistroE010> registroE010) {
		this.registroE010 = registroE010;
	}

	public List<RegistroE015> getRegistroE015() {
		if (registroE015 == null) {
			registroE015 = new ArrayList<RegistroE015>();
		}
		return this.registroE015;
	}

	public void setRegistroE015(List<RegistroE015> registroE015) {
		this.registroE015 = registroE015;
	}

	public List<RegistroE020> getRegistroE020() {
		if (registroE020 == null) {
			registroE020 = new ArrayList<RegistroE020>();
		}
		return this.registroE020;
	}

	public void setRegistroE020(List<RegistroE020> registroE020) {
		this.registroE020 = registroE020;
	}

	public List<RegistroE030> getRegistroE030() {
		if (registroE030 == null) {
			registroE030 = new ArrayList<RegistroE030>();
		}
		return this.registroE030;
	}

	public void setRegistroE030(List<RegistroE030> registroE030) {
		this.registroE030 = registroE030;
	}

	public List<RegistroE155> getRegistroE155() {
		if (registroE155 == null) {
			registroE155 = new ArrayList<RegistroE155>();
		}
		return this.registroE155;
	}

	public void setRegistroE155(List<RegistroE155> registroE155) {
		this.registroE155 = registroE155;
	}

	public List<RegistroE355> getRegistroE355() {
		if (registroE355 == null) {
			registroE355 = new ArrayList<RegistroE355>();
		}
		return this.registroE355;
	}

	public void setRegistroE355(List<RegistroE355> registroE355) {
		this.registroE355 = registroE355;
	}

	public RegistroE990 getRegistroE990() {
		return registroE990;
	}

	public void setRegistroE990(RegistroE990 registroE990) {
		this.registroE990 = registroE990;
	}

}
