package br.com.ecoded.ecf.fiscal.registros.blocoL;

import java.util.ArrayList;
import java.util.List;

public class BlocoL {

	private RegistroL001 registroL001;
	private List<RegistroL030> registroL030;
	private List<RegistroL100> registroL100;
	private List<RegistroL200> registroL200;
	private List<RegistroL300> registroL300;
	private RegistroL990 registroL990;

	public RegistroL001 getRegistroL001() {
		return registroL001;
	}

	public void setRegistroL001(RegistroL001 registroL001) {
		this.registroL001 = registroL001;
	}

	public List<RegistroL030> getRegistroL030() {
		if (registroL030 == null) {
			registroL030 = new ArrayList<RegistroL030>();
		}
		return this.registroL030;
	}

	public List<RegistroL100> getRegistroL100() {
		if (registroL100 == null) {
			registroL100 = new ArrayList<RegistroL100>();
		}
		return this.registroL100;
	}

	public void setRegistroL100(List<RegistroL100> registroL100) {
		this.registroL100 = registroL100;
	}

	public List<RegistroL200> getRegistroL200() {
		if (registroL200 == null) {
			registroL200 = new ArrayList<RegistroL200>();
		}
		return this.registroL200;
	}

	public void setRegistroL200(List<RegistroL200> registroL200) {
		this.registroL200 = registroL200;
	}

	public List<RegistroL300> getRegistroL300() {
		if (registroL300 == null) {
			registroL300 = new ArrayList<RegistroL300>();
		}
		return this.registroL300;
	}

	public void setRegistroL300(List<RegistroL300> registroL300) {
		this.registroL300 = registroL300;
	}

	public RegistroL990 getRegistroL990() {
		return registroL990;
	}

	public void setRegistroL990(RegistroL990 registroL990) {
		this.registroL990 = registroL990;
	}

}
