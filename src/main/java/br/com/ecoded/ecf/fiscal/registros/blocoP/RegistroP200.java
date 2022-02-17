package br.com.ecoded.ecf.fiscal.registros.blocoP;

public class RegistroP200 {

	private final String reg = "P200";
	private String codigo;
	private String descricao;
	private String valor;

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

	public String getReg() {
		return reg;
	}

}