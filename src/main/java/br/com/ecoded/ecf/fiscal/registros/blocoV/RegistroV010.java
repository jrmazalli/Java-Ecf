package br.com.ecoded.ecf.fiscal.registros.blocoV;

public class RegistroV010 {

	private final String reg = "V010";
	private String nome_instituicao;
	private String pais;
	private String tip_moeda;

	public String getNome_instituicao() {
		return nome_instituicao;
	}

	public void setNome_instituicao(String nome_instituicao) {
		this.nome_instituicao = nome_instituicao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTip_moeda() {
		return tip_moeda;
	}

	public void setTip_moeda(String tip_moeda) {
		this.tip_moeda = tip_moeda;
	}

	public String getReg() {
		return reg;
	}

}
