package br.com.ecoded.ecf.fiscal.registros.blocoM;

public class RegistroM360 {

	private final String reg = "M360";
	private String cod_cta;
	private String cod_ccus;
	private String vl_cta;
	private String ind_vl_cta;
	private RegistroM362 registroM362;
	private RegistroM365 registroM365;

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

	public String getVl_cta() {
		return vl_cta;
	}

	public void setVl_cta(String vl_cta) {
		this.vl_cta = vl_cta;
	}

	public String getInd_vl_cta() {
		return ind_vl_cta;
	}

	public void setInd_vl_cta(String ind_vl_cta) {
		this.ind_vl_cta = ind_vl_cta;
	}

	public RegistroM362 getRegistroM362() {
		return registroM362;
	}

	public void setRegistroM362(RegistroM362 registroM362) {
		this.registroM362 = registroM362;
	}

	public RegistroM365 getRegistroM365() {
		return registroM365;
	}

	public void setRegistroM365(RegistroM365 registroM365) {
		this.registroM365 = registroM365;
	}

	public String getReg() {
		return reg;
	}

}
