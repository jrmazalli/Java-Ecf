package br.com.ecoded.ecf.fiscal.registros.blocoN;

import java.util.ArrayList;
import java.util.List;

public class RegistroN600 {

	private final String reg = "N600";
	private String codigo;
	private String descricao;
	private String valor;
	private RegistroN610 registroN610;
	private RegistroN620 registroN620;
	private List<RegistroN630> registroN630;
	private List<RegistroN650> registroN650;
	private RegistroN660 registroN660;
	private List<RegistroN670> registroN670;

	public List<RegistroN630> getRegistroN630() {
		if (registroN630 == null) {
			registroN630 = new ArrayList<RegistroN630>();
		}
		return registroN630;
	}

	public List<RegistroN650> getRegistroN650() {
		if (registroN650 == null) {
			registroN650 = new ArrayList<RegistroN650>();
		}
		return registroN650;
	}

	public List<RegistroN670> getRegistroN670() {
		if (registroN670 == null) {
			registroN670 = new ArrayList<RegistroN670>();
		}
		return registroN670;
	}

	public RegistroN610 getRegistroN610() {
		return registroN610;
	}

	public void setRegistroN610(RegistroN610 registroN610) {
		this.registroN610 = registroN610;
	}

	public RegistroN620 getRegistroN620() {
		return registroN620;
	}

	public void setRegistroN620(RegistroN620 registroN620) {
		this.registroN620 = registroN620;
	}

	public RegistroN660 getRegistroN660() {
		return registroN660;
	}

	public void setRegistroN660(RegistroN660 registroN660) {
		this.registroN660 = registroN660;
	}

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
