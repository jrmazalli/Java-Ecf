package br.com.ecoded.ecf.fiscal.registros.blocoY;

public class RegistroY800 {

	private final String reg = "Y800";
	private String tipo_doc;
	private String descricao;
	private String hash;
	private String arq_rtf;
	private String ind_fim_rtf;

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getArq_rtf() {
		return arq_rtf;
	}

	public void setArq_rtf(String arq_rtf) {
		this.arq_rtf = arq_rtf;
	}

	public String getInd_fim_rtf() {
		return ind_fim_rtf;
	}

	public void setInd_fim_rtf(String ind_fim_rtf) {
		this.ind_fim_rtf = ind_fim_rtf;
	}

	public String getReg() {
		return reg;
	}

}
