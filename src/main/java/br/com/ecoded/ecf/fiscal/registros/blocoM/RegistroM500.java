package br.com.ecoded.ecf.fiscal.registros.blocoM;

public class RegistroM500 {

	private final String reg = "M500";
	private String cod_cta_b;
	private String cod_tributo;
	private String sd_ini_lal;
	private String ind_sd_ini_lal;
	private String vl_lcto_parte_a;
	private String ind_vl_lcto_parte_a;
	private String vl_lcto_parte_b;
	private String ind_vl_lcto_parte_b;
	private String sd_fim_lal;
	private String ind_sd_fim_lal;
	private RegistroM510 registroM510;

	public String getCod_cta_b() {
		return cod_cta_b;
	}

	public void setCod_cta_b(String cod_cta_b) {
		this.cod_cta_b = cod_cta_b;
	}

	public String getCod_tributo() {
		return cod_tributo;
	}

	public void setCod_tributo(String cod_tributo) {
		this.cod_tributo = cod_tributo;
	}

	public String getSd_ini_lal() {
		return sd_ini_lal;
	}

	public void setSd_ini_lal(String sd_ini_lal) {
		this.sd_ini_lal = sd_ini_lal;
	}

	public String getInd_sd_ini_lal() {
		return ind_sd_ini_lal;
	}

	public void setInd_sd_ini_lal(String ind_sd_ini_lal) {
		this.ind_sd_ini_lal = ind_sd_ini_lal;
	}

	public String getVl_lcto_parte_a() {
		return vl_lcto_parte_a;
	}

	public void setVl_lcto_parte_a(String vl_lcto_parte_a) {
		this.vl_lcto_parte_a = vl_lcto_parte_a;
	}

	public String getInd_vl_lcto_parte_a() {
		return ind_vl_lcto_parte_a;
	}

	public void setInd_vl_lcto_parte_a(String ind_vl_lcto_parte_a) {
		this.ind_vl_lcto_parte_a = ind_vl_lcto_parte_a;
	}

	public String getVl_lcto_parte_b() {
		return vl_lcto_parte_b;
	}

	public void setVl_lcto_parte_b(String vl_lcto_parte_b) {
		this.vl_lcto_parte_b = vl_lcto_parte_b;
	}

	public String getInd_vl_lcto_parte_b() {
		return ind_vl_lcto_parte_b;
	}

	public void setInd_vl_lcto_parte_b(String ind_vl_lcto_parte_b) {
		this.ind_vl_lcto_parte_b = ind_vl_lcto_parte_b;
	}

	public String getSd_fim_lal() {
		return sd_fim_lal;
	}

	public void setSd_fim_lal(String sd_fim_lal) {
		this.sd_fim_lal = sd_fim_lal;
	}

	public String getInd_sd_fim_lal() {
		return ind_sd_fim_lal;
	}

	public void setInd_sd_fim_lal(String ind_sd_fim_lal) {
		this.ind_sd_fim_lal = ind_sd_fim_lal;
	}

	public RegistroM510 getRegistroM510() {
		return registroM510;
	}

	public void setRegistroM510(RegistroM510 registroM510) {
		this.registroM510 = registroM510;
	}

	public String getReg() {
		return reg;
	}

}
