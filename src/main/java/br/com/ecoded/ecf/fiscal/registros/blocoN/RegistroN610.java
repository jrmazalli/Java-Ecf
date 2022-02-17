package br.com.ecoded.ecf.fiscal.registros.blocoN;

public class RegistroN610 {

	private final String reg = "N610";
	private String codigo;
	private String descricao;
	private String valor;
	private RegistroN615 registroN615;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public RegistroN615 getRegistroN615() {
		return registroN615;
	}

	public void setRegistroN615(RegistroN615 registroN615) {
		this.registroN615 = registroN615;
	}

	public String getReg() {
		return reg;
	}

}
