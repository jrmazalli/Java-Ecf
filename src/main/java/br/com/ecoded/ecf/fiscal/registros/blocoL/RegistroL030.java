package br.com.ecoded.ecf.fiscal.registros.blocoL;

import java.util.ArrayList;
import java.util.List;

public class RegistroL030 {

	private final String reg = "L030";
	private String dt_ini;
	private String dt_fin;
	private String per_apur;
	private List<RegistroL100> registroL100;
	private List<RegistroL200> registroL200;
	private List<RegistroL210> registroL210;
	private List<RegistroL300> registroL300;

	public String getDt_ini() {
		return dt_ini;
	}

	public void setDt_ini(String dt_ini) {
		this.dt_ini = dt_ini;
	}

	public String getDt_fin() {
		return dt_fin;
	}

	public void setDt_fin(String dt_fin) {
		this.dt_fin = dt_fin;
	}

	public String getPer_apur() {
		return per_apur;
	}

	public void setPer_apur(String per_apur) {
		this.per_apur = per_apur;
	}

	public List<RegistroL100> getRegistroL100() {
		if (registroL100 == null) {
			registroL100 = new ArrayList<RegistroL100>();
		}
		return registroL100;
	}

	public List<RegistroL200> getRegistroL200() {
		if (registroL200 == null) {
			registroL200 = new ArrayList<RegistroL200>();
		}
		return registroL200;
	}

	public List<RegistroL210> getRegistroL210() {
		if (registroL210 == null) {
			registroL210 = new ArrayList<RegistroL210>();
		}
		return registroL210;
	}

	public List<RegistroL300> getRegistroL300() {
		if (registroL300 == null) {
			registroL300 = new ArrayList<RegistroL300>();
		}
		return registroL300;
	}

	public String getReg() {
		return reg;
	}

}
