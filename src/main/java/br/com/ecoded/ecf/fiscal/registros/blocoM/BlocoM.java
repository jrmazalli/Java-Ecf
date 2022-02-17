package br.com.ecoded.ecf.fiscal.registros.blocoM;

import java.util.ArrayList;
import java.util.List;

public class BlocoM {

	private RegistroM001 registroM001;
	private List<RegistroM010> registroM010;
	private List<RegistroM030> registroM030;
	private List<RegistroM350> registroM350;

	private List<RegistroM410> registroM410;
	private List<RegistroM500> registroM500;
	private RegistroM990 registroM990;

	public RegistroM001 getRegistroM001() {
		return registroM001;
	}

	public void setRegistroM001(RegistroM001 registroM001) {
		this.registroM001 = registroM001;
	}

	public List<RegistroM010> getRegistroM010() {
		if (registroM010 == null) {
			registroM010 = new ArrayList<RegistroM010>();
		}
		return this.registroM010;
	}

	public void setRegistroM010(List<RegistroM010> registroM010) {
		this.registroM010 = registroM010;
	}

	public List<RegistroM030> getRegistroM030() {
		if (registroM030 == null) {
			registroM030 = new ArrayList<RegistroM030>();
		}
		return this.registroM030;
	}

	public void setRegistroM030(List<RegistroM030> registroM030) {
		this.registroM030 = registroM030;
	}

	public List<RegistroM350> getRegistroM350() {
		if (registroM350 == null) {
			registroM350 = new ArrayList<RegistroM350>();
		}
		return this.registroM350;
	}

	public void setRegistroM350(List<RegistroM350> registroM350) {
		this.registroM350 = registroM350;
	}

	public List<RegistroM410> getRegistroM410() {
		if (registroM410 == null) {
			registroM410 = new ArrayList<RegistroM410>();
		}
		return this.registroM410;
	}

	public void setRegistroM410(List<RegistroM410> registroM410) {
		this.registroM410 = registroM410;
	}

	public List<RegistroM500> getRegistroM500() {
		if (registroM500 == null) {
			registroM500 = new ArrayList<RegistroM500>();
		}
		return this.registroM500;
	}

	public void setRegistroM500(List<RegistroM500> registroM500) {
		this.registroM500 = registroM500;
	}

	public RegistroM990 getRegistroM990() {
		return registroM990;
	}

	public void setRegistroM990(RegistroM990 registroM990) {
		this.registroM990 = registroM990;
	}

}
