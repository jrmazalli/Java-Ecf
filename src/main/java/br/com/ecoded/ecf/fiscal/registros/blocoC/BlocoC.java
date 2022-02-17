package br.com.ecoded.ecf.fiscal.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

public class BlocoC {

	private RegistroC001 registroC001;
	private RegistroC040 registroC040;
	private List<RegistroC050> registroC050;
	private List<RegistroC051> registroC051;
	private RegistroC053 registroC053;
	private List<RegistroC100> registroC100;
	private List<RegistroC150> registroC150;
	private List<RegistroC155> registroC155;
	private RegistroC157 registroC157;
	private List<RegistroC350> registroC350;
	private List<RegistroC355> registroC355;
	private RegistroC990 registroC990;

	public RegistroC001 getRegistroC001() {
		return registroC001;
	}

	public void setRegistroC001(RegistroC001 registroC001) {
		this.registroC001 = registroC001;
	}

	public RegistroC040 getRegistroC040() {
		return registroC040;
	}

	public void setRegistroC040(RegistroC040 registroC040) {
		this.registroC040 = registroC040;
	}

	public List<RegistroC050> getRegistroC050() {
		if (registroC050 == null) {
			registroC050 = new ArrayList<RegistroC050>();
		}
		return this.registroC050;
	}

	public void setRegistroC050(List<RegistroC050> registroC050) {
		this.registroC050 = registroC050;
	}

	public List<RegistroC051> getRegistroC051() {
		if (registroC051 == null) {
			registroC051 = new ArrayList<RegistroC051>();
		}
		return this.registroC051;
	}

	public void setRegistroC051(List<RegistroC051> registroC051) {
		this.registroC051 = registroC051;
	}

	public RegistroC053 getRegistroC053() {
		return registroC053;
	}

	public void setRegistroC053(RegistroC053 registroC053) {
		this.registroC053 = registroC053;
	}

	public List<RegistroC100> getRegistroC100() {
		if (registroC100 == null) {
			registroC100 = new ArrayList<RegistroC100>();
		}
		return this.registroC100;
	}

	public void setRegistroC100(List<RegistroC100> registroC100) {
		this.registroC100 = registroC100;
	}

	public List<RegistroC150> getRegistroC150() {
		if (registroC150 == null) {
			registroC150 = new ArrayList<RegistroC150>();
		}
		return this.registroC150;
	}

	public void setRegistroC150(List<RegistroC150> registroC150) {
		this.registroC150 = registroC150;
	}

	public List<RegistroC155> getRegistroC155() {
		if (registroC155 == null) {
			registroC155 = new ArrayList<RegistroC155>();
		}
		return this.registroC155;
	}

	public void setRegistroC155(List<RegistroC155> registroC155) {
		this.registroC155 = registroC155;
	}

	public RegistroC157 getRegistroC157() {
		return registroC157;
	}

	public void setRegistroC157(RegistroC157 registroC157) {
		this.registroC157 = registroC157;
	}

	public List<RegistroC350> getRegistroC350() {
		if (registroC350 == null) {
			registroC350 = new ArrayList<RegistroC350>();
		}
		return this.registroC350;
	}

	public void setRegistroC350(List<RegistroC350> registroC350) {
		this.registroC350 = registroC350;
	}

	public List<RegistroC355> getRegistroC355() {
		if (registroC355 == null) {
			registroC355 = new ArrayList<RegistroC355>();
		}
		return this.registroC355;
	}

	public void setRegistroC355(List<RegistroC355> registroC355) {
		this.registroC355 = registroC355;
	}

	public RegistroC990 getRegistroC990() {
		return registroC990;
	}

	public void setRegistroC990(RegistroC990 registroC990) {
		this.registroC990 = registroC990;
	}

}
