package br.com.ecoded.ecf.fiscal.registros.blocoM;

import java.util.ArrayList;
import java.util.List;

public class RegistroM030 {

	private final String reg = "M030";
	private String dt_ini;
	private String dt_fin;
	private String per_apur;
	private List<RegistroM300> registroM300;

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

	public List<RegistroM300> getRegistroM300() {
		if (registroM300 == null) {
			registroM300 = new ArrayList<RegistroM300>();
		}
		return this.registroM300;
	}

	public String getReg() {
		return reg;
	}

}
