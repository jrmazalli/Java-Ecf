package br.com.ecoded.ecf.fiscal.registros.blocoM;

import java.util.ArrayList;
import java.util.List;

public class RegistroM300 {

	private final String reg = "M300";
	private String codigo;
	private String descricao;
	private String tipo_lancamento;
	private String ind_relacao;
	private String valor;
	private String hist_lan_lal;
	private List<RegistroM305> registroM305;
	private List<RegistroM310> registroM310;

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

	public String getTipo_lancamento() {
		return tipo_lancamento;
	}

	public void setTipo_lancamento(String tipo_lancamento) {
		this.tipo_lancamento = tipo_lancamento;
	}

	public String getInd_relacao() {
		return ind_relacao;
	}

	public void setInd_relacao(String ind_relacao) {
		this.ind_relacao = ind_relacao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getHist_lan_lal() {
		return hist_lan_lal;
	}

	public void setHist_lan_lal(String hist_lan_lal) {
		this.hist_lan_lal = hist_lan_lal;
	}

	public List<RegistroM305> getRegistroM305() {
		if (registroM305 == null) {
			registroM305 = new ArrayList<RegistroM305>();
		}
		return this.registroM305;
	}

	public List<RegistroM310> getRegistroM310() {
		if (registroM310 == null) {
			registroM310 = new ArrayList<RegistroM310>();
		}
		return this.registroM310;
	}

	public String getReg() {
		return reg;
	}

}
