package br.com.ecoded.ecf.fiscal.registros.blocoJ;

import java.util.ArrayList;
import java.util.List;

public class BlocoJ {

	private RegistroJ001 registroJ001;
	private List<RegistroJ050> registroJ050;
	private List<RegistroJ100> registroJ100;
	private RegistroJ990 registroJ990;

	public RegistroJ001 getRegistroJ001() {
		return registroJ001;
	}

	public void setRegistroJ001(RegistroJ001 registroJ001) {
		this.registroJ001 = registroJ001;
	}

	public List<RegistroJ050> getRegistroJ050() {
		if (registroJ050 == null) {
			registroJ050 = new ArrayList<RegistroJ050>();
		}
		return this.registroJ050;
	}

	public void setRegistroJ050(List<RegistroJ050> registroJ050) {
		this.registroJ050 = registroJ050;
	}

	public List<RegistroJ100> getRegistroJ100() {
		if (registroJ100 == null) {
			registroJ100 = new ArrayList<RegistroJ100>();
		}
		return this.registroJ100;
	}

	public void setRegistroJ100(List<RegistroJ100> registroJ100) {
		this.registroJ100 = registroJ100;
	}

	public RegistroJ990 getRegistroJ990() {
		return registroJ990;
	}

	public void setRegistroJ990(RegistroJ990 registroJ990) {
		this.registroJ990 = registroJ990;
	}

}
