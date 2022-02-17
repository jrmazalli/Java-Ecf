package br.com.ecoded.ecf.fiscal.registros.blocoN;

import java.util.ArrayList;
import java.util.List;

public class BlocoN {

	private RegistroN001 registroN001;
	private List<RegistroN030> registroN030;
	private List<RegistroN500> registroN500;
	private RegistroN600 registroN600;
	private RegistroN990 registroN990;

	public RegistroN001 getRegistroN001() {
		return registroN001;
	}

	public void setRegistroN001(RegistroN001 registroN001) {
		this.registroN001 = registroN001;
	}

	public List<RegistroN030> getRegistroN030() {
		if (registroN030 == null) {
			registroN030 = new ArrayList<RegistroN030>();
		}
		return this.registroN030;
	}

	public void setRegistroN030(List<RegistroN030> registroN030) {
		this.registroN030 = registroN030;
	}

	public List<RegistroN500> getRegistroN500() {
		if (registroN500 == null) {
			registroN500 = new ArrayList<RegistroN500>();
		}
		return registroN500;
	}

	public RegistroN600 getRegistroN600() {
		return registroN600;
	}

	public void setRegistroN600(RegistroN600 registroN600) {
		this.registroN600 = registroN600;
	}

	public void setRegistroN500(List<RegistroN500> registroN500) {
		this.registroN500 = registroN500;
	}

	public RegistroN990 getRegistroN990() {
		return registroN990;
	}

	public void setRegistroN990(RegistroN990 registroN990) {
		this.registroN990 = registroN990;
	}

}
