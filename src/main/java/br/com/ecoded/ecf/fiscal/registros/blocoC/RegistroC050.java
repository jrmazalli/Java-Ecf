package br.com.ecoded.ecf.fiscal.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

public class RegistroC050 {

	private final String reg = "C050";
	private String dt_alt;
	private String cod_nat;
	private String ind_cta;
	private String nivel;
	private String cod_cta;
	private String cod_cta_sup;
	private String cta;
	private List<RegistroC051> registroC051;
	private RegistroC053 registroC053;

	public String getDt_alt() {
		return dt_alt;
	}

	public void setDt_alt(String dt_alt) {
		this.dt_alt = dt_alt;
	}

	public String getCod_nat() {
		return cod_nat;
	}

	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}

	public String getInd_cta() {
		return ind_cta;
	}

	public void setInd_cta(String ind_cta) {
		this.ind_cta = ind_cta;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCod_cta() {
		return cod_cta;
	}

	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	public String getCod_cta_sup() {
		return cod_cta_sup;
	}

	public void setCod_cta_sup(String cod_cta_sup) {
		this.cod_cta_sup = cod_cta_sup;
	}

	public String getCta() {
		return cta;
	}

	public void setCta(String cta) {
		this.cta = cta;
	}

	public List<RegistroC051> getRegistroC051() {
		if (registroC051 == null) {
			registroC051 = new ArrayList<RegistroC051>();
		}
		return registroC051;
	}

	public RegistroC053 getRegistroC053() {
		return registroC053;
	}

	public String getReg() {
		return reg;
	}

}
