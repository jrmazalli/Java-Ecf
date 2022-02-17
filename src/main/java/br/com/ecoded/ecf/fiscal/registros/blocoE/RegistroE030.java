package br.com.ecoded.ecf.fiscal.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

public class RegistroE030 {

	private final String reg = "E030";
	private String dt_ini;
	private String dt_fin;
	private String per_apur;
	private List<RegistroE155> registroE155;
	private List<RegistroE355> registroE355;
	

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
	
	public List<RegistroE155> getRegistroE155() {
		if (registroE155 == null) {
			registroE155 = new ArrayList<RegistroE155>();
		}
		return registroE155;
	}
	
	public List<RegistroE355> getRegistroE355() {
		if (registroE355 == null) {
			registroE355 = new ArrayList<RegistroE355>();
		}
		return registroE355;
	}

	public String getReg() {
		return reg;
	}

}
