package br.com.ecoded.ecf.fiscal.bo.blocoT;

import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.registros.blocoT.BlocoT;
import br.com.ecoded.ecf.fiscal.registros.blocoT.BlocoTEnum;
import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT990;
import br.com.ecoded.ecf.fiscal.util.Util;

public class GerarBlocoT {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcfFiscal ecfFiscal, StringBuilder sbr) {
		BlocoT blocoT = ecfFiscal.getBlocoT();
		sb = sbr;

		// REGISTROT001
		if (!Util.isEmpty(blocoT.getRegistroT001())) {
			GerarRegistroT001.gerar(blocoT.getRegistroT001(), sb);
			ecfFiscal.getContadoresBlocoT().incrementar(BlocoTEnum.RegistroT001);
		}

		// REGISTROT030
		if (!Util.isEmpty(blocoT.getRegistroT030())) {
			GerarRegistroT030.gerar(blocoT.getRegistroT030(), sb);
			ecfFiscal.getContadoresBlocoT().incrementar(BlocoTEnum.RegistroT030);
		}
		
		// REGISTROT120
		if (!Util.isEmpty(blocoT.getRegistroT120())) {
			GerarRegistroT120.gerar(blocoT.getRegistroT120(), sb);
			ecfFiscal.getContadoresBlocoT().incrementar(BlocoTEnum.RegistroT120);
		}
		
		// REGISTROT150
		if (!Util.isEmpty(blocoT.getRegistroT150())) {
			GerarRegistroT150.gerar(blocoT.getRegistroT150(), sb);
			ecfFiscal.getContadoresBlocoT().incrementar(BlocoTEnum.RegistroT150);
		}
		
		// REGISTROT170
		if (!Util.isEmpty(blocoT.getRegistroT170())) {
			GerarRegistroT170.gerar(blocoT.getRegistroT170(), sb);
			ecfFiscal.getContadoresBlocoT().incrementar(BlocoTEnum.RegistroT170);
		}
		
		// REGISTROT181
		if (!Util.isEmpty(blocoT.getRegistroT181())) {
			GerarRegistroT181.gerar(blocoT.getRegistroT181(), sb);
			ecfFiscal.getContadoresBlocoT().incrementar(BlocoTEnum.RegistroT181);
		}

		// REGISTROT990
		if (ecfFiscal.getContadoresBlocoT().getContRegistroT990() > 0) {
			RegistroT990 registroN990 = new RegistroT990();
			registroN990.setQtd_lin_t(String.valueOf(ecfFiscal.getContadoresBlocoT().getContRegistroT990() + 1));

			blocoT.setRegistroT990(registroN990);
			GerarRegistroT990.gerar(blocoT.getRegistroT990(), sb);
		}

		return sb;
	}

}
