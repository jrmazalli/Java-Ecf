package br.com.ecoded.ecf.fiscal.registros.blocoM;

import java.util.ArrayList;
import java.util.List;

public class RegistroM350 {

	private final String reg = "M350";
	private String codigo;
	private String descricao;
	private String tipo_lancamento;
	private String ind_relacao;
	private String valor;
	private String hist_lan_lal;
	private List<RegistroM355> registroM355;
	private List<RegistroM360> registroM360;

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

	public List<RegistroM355> getRegistroM355() {
		if (registroM355 == null) {
			registroM355 = new ArrayList<RegistroM355>();
		}
		return this.registroM355;
	}
	
	public List<RegistroM360> getRegistroM360() {
		if (registroM360 == null) {
			registroM360 = new ArrayList<RegistroM360>();
		}
		return this.registroM360;
	}

	public void setRegistroM360(List<RegistroM360> registroM360) {
		this.registroM360 = registroM360;
	}

	public String getReg() {
		return reg;
	}

}
