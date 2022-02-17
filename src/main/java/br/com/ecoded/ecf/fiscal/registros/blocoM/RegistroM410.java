package br.com.ecoded.ecf.fiscal.registros.blocoM;

public class RegistroM410 {

	private final String reg = "M410";
	private String cod_cta_b;
	private String cod_tributo;
	private String val_lan_lalb_pb;
	private String ind_val_lan_lalb_pb;
	private String cod_cta_b_ctp;
	private String hist_lan_lalb;
	private String ind_lan_ant;
	private RegistroM415 registroM415;

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

	public String getVal_lan_lalb_pb() {
		return val_lan_lalb_pb;
	}

	public void setVal_lan_lalb_pb(String val_lan_lalb_pb) {
		this.val_lan_lalb_pb = val_lan_lalb_pb;
	}

	public String getInd_val_lan_lalb_pb() {
		return ind_val_lan_lalb_pb;
	}

	public void setInd_val_lan_lalb_pb(String ind_val_lan_lalb_pb) {
		this.ind_val_lan_lalb_pb = ind_val_lan_lalb_pb;
	}

	public String getCod_cta_b_ctp() {
		return cod_cta_b_ctp;
	}

	public void setCod_cta_b_ctp(String cod_cta_b_ctp) {
		this.cod_cta_b_ctp = cod_cta_b_ctp;
	}

	public String getHist_lan_lalb() {
		return hist_lan_lalb;
	}

	public void setHist_lan_lalb(String hist_lan_lalb) {
		this.hist_lan_lalb = hist_lan_lalb;
	}

	public String getInd_lan_ant() {
		return ind_lan_ant;
	}

	public void setInd_lan_ant(String ind_lan_ant) {
		this.ind_lan_ant = ind_lan_ant;
	}

	public RegistroM415 getRegistroM415() {
		return registroM415;
	}

	public void setRegistroM415(RegistroM415 registroM415) {
		this.registroM415 = registroM415;
	}

	public String getReg() {
		return reg;
	}

}
