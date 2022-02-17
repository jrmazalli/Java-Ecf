package br.com.ecoded.ecf.fiscal.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

public class BlocoK {

	private RegistroK001 registroK001;
	private List<RegistroK030> registroK030;
	private List<RegistroK155> registroK155;
	private List<RegistroK355> registroK355;
	private List<RegistroK915> registroK915;
	private List<RegistroK935> registroK935;
	private RegistroK990 registroK990;

	public RegistroK001 getRegistroK001() {
		return registroK001;
	}

	public void setRegistroK001(RegistroK001 registroK001) {
		this.registroK001 = registroK001;
	}

	public List<RegistroK030> getRegistroK030() {
		if (registroK030 == null) {
			registroK030 = new ArrayList<RegistroK030>();
		}
		return this.registroK030;
	}

	public void setRegistroK030(List<RegistroK030> registroK030) {
		this.registroK030 = registroK030;
	}

	public List<RegistroK915> getRegistroK915() {
		if (registroK915 == null) {
			registroK915 = new ArrayList<RegistroK915>();
		}
		return this.registroK915;
	}

	public List<RegistroK935> getRegistroK935() {
		if (registroK935 == null) {
			registroK935 = new ArrayList<RegistroK935>();
		}
		return this.registroK935;
	}

	public List<RegistroK155> getRegistroK155() {
		if (registroK155 == null) {
			registroK155 = new ArrayList<RegistroK155>();
		}
		return this.registroK155;
	}

	public void setRegistroK155(List<RegistroK155> registroK155) {
		this.registroK155 = registroK155;
	}

	public List<RegistroK355> getRegistroK355() {
		if (registroK355 == null) {
			registroK355 = new ArrayList<RegistroK355>();
		}
		return this.registroK355;
	}



	public RegistroK990 getRegistroK990() {
		return registroK990;
	}

	public void setRegistroK990(RegistroK990 registroK990) {
		this.registroK990 = registroK990;
	}

}
