package br.com.ecoded.ecf.fiscal.registros.blocoQ;

public class RegistroQ100 {

	private final String reg = "Q100";
	private String data;
	private String num_doc;
	private String hist;
	private String vl_entrada;
	private String vl_saida;
	private String sld_fin;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	public String getHist() {
		return hist;
	}

	public void setHist(String hist) {
		this.hist = hist;
	}

	public String getVl_entrada() {
		return vl_entrada;
	}

	public void setVl_entrada(String vl_entrada) {
		this.vl_entrada = vl_entrada;
	}

	public String getVl_saida() {
		return vl_saida;
	}

	public void setVl_saida(String vl_saida) {
		this.vl_saida = vl_saida;
	}

	public String getSld_fin() {
		return sld_fin;
	}

	public void setSld_fin(String sld_fin) {
		this.sld_fin = sld_fin;
	}

	public String getReg() {
		return reg;
	}

}
