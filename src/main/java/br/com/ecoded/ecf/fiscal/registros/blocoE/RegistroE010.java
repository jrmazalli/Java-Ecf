package br.com.ecoded.ecf.fiscal.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

public class RegistroE010 {

	private final String reg = "E010";
	private String cod_nat;
	private String cod_cta_ref;
	private String desc_cta_ref;
	private String val_cta_ref;
	private String ind_val_cta_ref;
	private List<RegistroE015> registroE015;

	public String getCod_nat() {
		return cod_nat;
	}

	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}

	public String getCod_cta_ref() {
		return cod_cta_ref;
	}

	public void setCod_cta_ref(String cod_cta_ref) {
		this.cod_cta_ref = cod_cta_ref;
	}

	public String getDesc_cta_ref() {
		return desc_cta_ref;
	}

	public void setDesc_cta_ref(String desc_cta_ref) {
		this.desc_cta_ref = desc_cta_ref;
	}

	public String getVal_cta_ref() {
		return val_cta_ref;
	}

	public void setVal_cta_ref(String val_cta_ref) {
		this.val_cta_ref = val_cta_ref;
	}

	public String getInd_val_cta_ref() {
		return ind_val_cta_ref;
	}

	public void setInd_val_cta_ref(String ind_val_cta_ref) {
		this.ind_val_cta_ref = ind_val_cta_ref;
	}
	
	public List<RegistroE015> getRegistroE015() {
		if (registroE015 == null) {
			registroE015 = new ArrayList<RegistroE015>();
		}
		return registroE015;
	}

	public String getReg() {
		return reg;
	}

}
