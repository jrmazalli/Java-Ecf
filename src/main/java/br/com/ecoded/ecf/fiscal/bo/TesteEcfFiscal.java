package br.com.ecoded.ecf.fiscal.bo;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.ecoded.ecf.fiscal.exception.EcfException;
import br.com.ecoded.ecf.fiscal.registros.EcfFiscal;
import br.com.ecoded.ecf.fiscal.util.Util;

public class TesteEcfFiscal {

	public static void main(String[] args) {

		try {

			StringBuilder sb = new StringBuilder();
			EcfFiscal ecfFiscal = new EcfFiscal();
			ecfFiscal.setBloco0(PrincipalTesteFiscal.preencheBloco0());
			ecfFiscal.setBlocoC(PrincipalTesteFiscal.preencheBlocoC());
			ecfFiscal.setBlocoE(PrincipalTesteFiscal.preencheBlocoE());
			ecfFiscal.setBlocoJ(PrincipalTesteFiscal.preencheBlocoJ());
			ecfFiscal.setBlocoK(PrincipalTesteFiscal.preencheBlocoK());
			ecfFiscal.setBlocoL(PrincipalTesteFiscal.preencheBlocoL());
			ecfFiscal.setBlocoM(PrincipalTesteFiscal.preencheBlocoM());
			ecfFiscal.setBlocoN(PrincipalTesteFiscal.preencheBlocoN());
			ecfFiscal.setBlocoP(PrincipalTesteFiscal.preencheBlocoP());
			ecfFiscal.setBlocoQ(PrincipalTesteFiscal.preencheBlocoQ());
			ecfFiscal.setBlocoT(PrincipalTesteFiscal.preencheBlocoT());
			ecfFiscal.setBlocoU(PrincipalTesteFiscal.preencheBlocoU());
			ecfFiscal.setBlocoV(PrincipalTesteFiscal.preencheBlocoV());
			ecfFiscal.setBlocoW(PrincipalTesteFiscal.preencheBlocoW());
			ecfFiscal.setBlocoX(PrincipalTesteFiscal.preencheBlocoX());
			ecfFiscal.setBlocoY(PrincipalTesteFiscal.preencheBlocoY());

			sb = GerarEcfFiscal.gerar(ecfFiscal, sb);

			System.out.println("			GERAÇÃO SPED - ECF FISCAL			");
			System.out.println("	");
			System.out.println(sb.toString());

			SimpleDateFormat formatoDt = new SimpleDateFormat("dd_MM_yyyy_HH_mm");
			String formatoData = formatoDt.format(new Date());

			String pasta = "/C/SPED-GERADO";
			String nomeArquivo = "ECF_FISCAL_" + formatoData + ".txt";
			Util.criarPastaArquivo(pasta, nomeArquivo, sb.toString());

			System.out.println("Arquivo criado na pasta:  C:/SPED_GERADO");

		} catch (EcfException e) {
			System.err.println();
			System.err.println(" Erro: " + e.getMessage());
		}

	}
}
