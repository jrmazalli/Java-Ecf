package br.com.ecoded.ecf.fiscal.bo.bloco0;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Bloco0;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Bloco0Enum;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBloco0 {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {

		Bloco0 bloco0 = ecfFiscal.getBloco0();

		sb = sbr;

		// REGISTRO0000
		if (!Util.isEmpty(bloco0.getRegistro0000())) {
			GerarRegistro0000.gerar(ecfFiscal, bloco0.getRegistro0000(), sb);
			ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0000);
		}

		// REGISTRO0001
		if (!Util.isEmpty(bloco0.getRegistro0001())) {
			GerarRegistro0001.gerar(bloco0.getRegistro0001(), sb);
			ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0001);
		}

		// REGISTRO0010
		if (!Util.isEmpty(bloco0.getRegistro0010())) {
			GerarRegistro0010.gerar(bloco0.getRegistro0010(), sb);
			ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0010);
		}

		// REGISTRO0020
		if (!Util.isEmpty(bloco0.getRegistro0020())) {
			GerarRegistro0020.gerar(bloco0.getRegistro0020(), sb);
			ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0020);

			// REGISTRO0021
			if (!Util.isEmpty(bloco0.getRegistro0020().getRegistro0021())) {
				GerarRegistro0021.gerar(bloco0.getRegistro0020().getRegistro0021(), sb);
				ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0021);
			}
		}

		// REGISTRO0030
		if (!Util.isEmpty(bloco0.getRegistro0030())) {
			GerarRegistro0030.gerar(bloco0.getRegistro0030(), sb);
			ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0030);

			// REGISTRO0035
			if (!Util.isEmpty(bloco0.getRegistro0030().getRegistro0035())) {
				GerarRegistro0035.gerar(bloco0.getRegistro0030().getRegistro0035(), sb);
				ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0035);
			}
		}

		// REGISTRO0930
		if (!Util.isEmpty(bloco0.getRegistro0930())) {
			bloco0.getRegistro0930().forEach(registro0930 -> {
				GerarRegistro0930.gerar(registro0930, sb);
				ecfFiscal.getContadoresBloco0().incrementar(Bloco0Enum.Registro0930);
			});
		}

		// REGISTRO0990
		if (ecfFiscal.getContadoresBloco0().getContRegistro0990() > 0) {
			Registro0990 registro0990 = new Registro0990();
			registro0990.setQtd_lin_0(String.valueOf(ecfFiscal.getContadoresBloco0().getContRegistro0990() + 1));

			bloco0.setRegistro0990(registro0990);
			GerarRegistro0990.gerar(bloco0.getRegistro0990(), sb);
		}

		return sb;
	}
}
