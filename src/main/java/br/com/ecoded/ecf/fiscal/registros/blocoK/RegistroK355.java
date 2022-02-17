package br.com.ecoded.ecf.fiscal.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

public class RegistroK355 {

	private final String reg = "K355";
	private String cod_cta;
	private String cod_ccus;
	private String vl_sld_fin;
	private String ind_vl_sld_fin;
	private List<RegistroK356> registroK356;

	public String getCod_cta() {
		return cod_cta;
	}

	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	public String getCod_ccus() {
		return cod_ccus;
	}

	public void setCod_ccus(String cod_ccus) {
		this.cod_ccus = cod_ccus;
	}

	public String getVl_sld_fin() {
		return vl_sld_fin;
	}

	public void setVl_sld_fin(String vl_sld_fin) {
		this.vl_sld_fin = vl_sld_fin;
	}

	public String getInd_vl_sld_fin() {
		return ind_vl_sld_fin;
	}

	public void setInd_vl_sld_fin(String ind_vl_sld_fin) {
		this.ind_vl_sld_fin = ind_vl_sld_fin;
	}

	public List<RegistroK356> getRegistroK356() {
		if (registroK356 == null) {
			registroK356 = new ArrayList<RegistroK356>();
		}
		return this.registroK356;
	}

	public String getReg() {
		return reg;
	}

}
