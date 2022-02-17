package br.com.ecoded.ecf.fiscal.registros.blocoL;

import java.util.ArrayList;
import java.util.List;

public class RegistroL200 {

	private final String reg = "L200";
	private String ind_aval_estoq;
	private List<RegistroL210> registroL210;

	public String getInd_aval_estoq() {
		return ind_aval_estoq;
	}

	public void setInd_aval_estoq(String ind_aval_estoq) {
		this.ind_aval_estoq = ind_aval_estoq;
	}

	public List<RegistroL210> getRegistroL210() {
		if (registroL210 == null) {
			registroL210 = new ArrayList<RegistroL210>();
		}
		return this.registroL210;
	}

	public void setRegistroL210(List<RegistroL210> registroL210) {
		this.registroL210 = registroL210;
	}

	public String getReg() {
		return reg;
	}

}
