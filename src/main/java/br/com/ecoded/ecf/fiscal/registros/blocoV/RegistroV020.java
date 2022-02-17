package br.com.ecoded.ecf.fiscal.registros.blocoV;

public class RegistroV020 {

	private final String reg = "V020";
	private String nome;
	private String endereco;
	private String tipo_do_c;
	private String ni;
	private String ident_conta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipo_do_c() {
		return tipo_do_c;
	}

	public void setTipo_do_c(String tipo_do_c) {
		this.tipo_do_c = tipo_do_c;
	}

	public String getNi() {
		return ni;
	}

	public void setNi(String ni) {
		this.ni = ni;
	}

	public String getIdent_conta() {
		return ident_conta;
	}

	public void setIdent_conta(String ident_conta) {
		this.ident_conta = ident_conta;
	}

	public String getReg() {
		return reg;
	}

}
