package br.com.ecoded.ecf.fiscal.registros.blocoP;

public class RegistroP150 {

	private final String reg = "P150";
	private String codigo;
	private String descricao;
	private String tipo;
	private String nivel;
	private String cod_nat;
	private String cod_cta_sup;
	private String valor;
	private String ind_valor;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCod_nat() {
		return cod_nat;
	}

	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}

	public String getCod_cta_sup() {
		return cod_cta_sup;
	}

	public void setCod_cta_sup(String cod_cta_sup) {
		this.cod_cta_sup = cod_cta_sup;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getInd_valor() {
		return ind_valor;
	}

	public void setInd_valor(String ind_valor) {
		this.ind_valor = ind_valor;
	}

	public String getReg() {
		return reg;
	}

}
