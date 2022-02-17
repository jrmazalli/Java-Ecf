package br.com.ecoded.ecf.fiscal.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

public class RegistroC350 {

	private final String reg = "C350";
	private String dt_res;
	private List<RegistroC355> registroC355;

	public String getDt_res() {
		return dt_res;
	}

	public void setDt_res(String dt_res) {
		this.dt_res = dt_res;
	}

	public List<RegistroC355> getRegistroC355() {
		if (registroC355 == null) {
			registroC355 = new ArrayList<RegistroC355>();
		}
		return registroC355;
	}

	public String getReg() {
		return reg;
	}

}
