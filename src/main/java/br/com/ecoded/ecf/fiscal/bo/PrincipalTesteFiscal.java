package br.com.ecoded.ecf.fiscal.bo;

import br.com.ecoded.ecf.fiscal.registros.bloco0.Bloco0;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0000;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0001;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0010;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0020;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0030;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0930;
import br.com.ecoded.ecf.fiscal.registros.bloco0.Registro0990;
import br.com.ecoded.ecf.fiscal.registros.blocoC.BlocoC;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC001;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC040;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC050;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC051;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC100;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC150;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC155;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC350;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC355;
import br.com.ecoded.ecf.fiscal.registros.blocoC.RegistroC990;
import br.com.ecoded.ecf.fiscal.registros.blocoE.BlocoE;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE001;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE010;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE015;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE020;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE030;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE155;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE355;
import br.com.ecoded.ecf.fiscal.registros.blocoE.RegistroE990;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ001;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ050;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ051;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ100;
import br.com.ecoded.ecf.fiscal.registros.blocoJ.RegistroJ990;
import br.com.ecoded.ecf.fiscal.registros.blocoK.BlocoK;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK001;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK030;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK155;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK156;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK355;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK356;
import br.com.ecoded.ecf.fiscal.registros.blocoK.RegistroK990;
import br.com.ecoded.ecf.fiscal.registros.blocoL.BlocoL;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL001;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL030;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL100;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL200;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL210;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL300;
import br.com.ecoded.ecf.fiscal.registros.blocoL.RegistroL990;
import br.com.ecoded.ecf.fiscal.registros.blocoM.BlocoM;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM001;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM010;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM030;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM300;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM305;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM310;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM350;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM360;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM410;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM500;
import br.com.ecoded.ecf.fiscal.registros.blocoM.RegistroM990;
import br.com.ecoded.ecf.fiscal.registros.blocoN.BlocoN;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN001;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN030;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN500;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN600;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN630;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN650;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN670;
import br.com.ecoded.ecf.fiscal.registros.blocoN.RegistroN990;
import br.com.ecoded.ecf.fiscal.registros.blocoP.BlocoP;
import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP001;
import br.com.ecoded.ecf.fiscal.registros.blocoP.RegistroP990;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.BlocoQ;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.RegistroQ001;
import br.com.ecoded.ecf.fiscal.registros.blocoQ.RegistroQ990;
import br.com.ecoded.ecf.fiscal.registros.blocoT.BlocoT;
import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT001;
import br.com.ecoded.ecf.fiscal.registros.blocoT.RegistroT990;
import br.com.ecoded.ecf.fiscal.registros.blocoU.BlocoU;
import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU001;
import br.com.ecoded.ecf.fiscal.registros.blocoU.RegistroU990;
import br.com.ecoded.ecf.fiscal.registros.blocoV.BlocoV;
import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV001;
import br.com.ecoded.ecf.fiscal.registros.blocoV.RegistroV990;
import br.com.ecoded.ecf.fiscal.registros.blocoW.BlocoW;
import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW001;
import br.com.ecoded.ecf.fiscal.registros.blocoW.RegistroW990;
import br.com.ecoded.ecf.fiscal.registros.blocoX.BlocoX;
import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX292;
import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX430;
import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX450;
import br.com.ecoded.ecf.fiscal.registros.blocoX.RegistroX990;
import br.com.ecoded.ecf.fiscal.registros.blocoY.BlocoY;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY520;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY540;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY550;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY560;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY570;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY600;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY671;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY720;
import br.com.ecoded.ecf.fiscal.registros.blocoY.RegistroY990;

public class PrincipalTesteFiscal {

	public static Bloco0 preencheBloco0() {
		Bloco0 bloco0 = new Bloco0();
		bloco0 = preencheRegistro0000(bloco0);
		bloco0 = preencheRegistro0001(bloco0);
		bloco0 = preencheRegistro0010(bloco0);
		// bloco0 = preencheRegistro0007(bloco0);
		bloco0 = preencheRegistro0020(bloco0);
		bloco0 = preencheRegistro0030(bloco0);
		// bloco0 = preencheRegistro0150(bloco0);
		// bloco0 = preencheRegistro0180(bloco0);
		bloco0 = preencheRegistro0990(bloco0);

		return bloco0;
	}

	public static Bloco0 preencheRegistro0000(Bloco0 bloco0) {
		Registro0000 registro0000 = new Registro0000();
		registro0000.setNome_esc("LECF");
		registro0000.setCod_ver("0006");
		registro0000.setCnpj("00000000000000");
		registro0000.setNome("CLIENTE TESTE LTDA");
		registro0000.setInd_sit_ini_per("0");
		registro0000.setSit_especial("0");
		registro0000.setPat_reman_cis("");
		registro0000.setDt_sit_esp("");
		registro0000.setDt_ini("01012021");
		registro0000.setDt_fin("31122021");
		registro0000.setRetificadora("N");
		registro0000.setNum_rec("");
		registro0000.setTip_ecf("0");
		registro0000.setCod_scp("");
		bloco0.setRegistro0000(registro0000);

		return bloco0;
	}

	public static Bloco0 preencheRegistro0001(Bloco0 bloco0) {
		Registro0001 registro0001 = new Registro0001();
		registro0001.setInd_dad("0");
		bloco0.setRegistro0001(registro0001);
		return bloco0;
	}

	public static Bloco0 preencheRegistro0010(Bloco0 bloco0) {
		Registro0010 registro0010 = new Registro0010();
		registro0010.setHash_ecf_anterior("N");
		registro0010.setOpt_refis("N");
		registro0010.setOpt_paes("1");
		registro0010.setForma_trib("T");
		registro0010.setForma_apur("01");
		registro0010.setCod_qualif_pj("RRRR");
		registro0010.setForma_trib_per("");
		registro0010.setMes_bal_red("");
		registro0010.setTip_esc_pre("");
		registro0010.setTip_ent("");
		registro0010.setForma_apur_i("");
		registro0010.setApur_csll("");
		registro0010.setInd_rec_receita("");
		bloco0.setRegistro0010(registro0010);
		return bloco0;
	}

	public static Bloco0 preencheRegistro0020(Bloco0 bloco0) {
		Registro0020 registro0020 = new Registro0020();
		registro0020.setInd_aliq_csll("1");
		registro0020.setInd_qte_scp("");
		registro0020.setInd_adm_fun_clu("N");
		registro0020.setInd_part_cons("N");
		registro0020.setInd_op_ext("S");
		registro0020.setInd_op_vinc("N");
		registro0020.setInd_pj_enquad("N");
		registro0020.setInd_part_ext("N");
		registro0020.setInd_ativ_rural("N");
		registro0020.setInd_luc_exp("N");
		registro0020.setInd_red_isen("N");
		registro0020.setInd_fin("N");
		registro0020.setInd_doa_eleit("N");
		registro0020.setInd_part_colig("N");
		registro0020.setInd_vend_exp("S");
		registro0020.setInd_rec_ext("N");
		registro0020.setInd_ativ_ext("N");
		registro0020.setInd_com_exp("S");
		registro0020.setInd_pgt_ext("N");
		registro0020.setInd_ecom_ti("N");
		registro0020.setInd_roy_rec("N");
		registro0020.setInd_roy_pag("N");
		registro0020.setInd_rend_serv("S");
		registro0020.setInd_pgto_rem("S");
		registro0020.setInd_inov_tec("N");
		registro0020.setInd_cap_inf("N");
		registro0020.setInd_pj_hab("N");
		registro0020.setInd_polo_am("N");
		registro0020.setInd_zon_exp("N");
		registro0020.setInd_area_com("N");
		registro0020.setInd_pais_a_pais("N");
		registro0020.setInd_derex("N");
		bloco0.setRegistro0020(registro0020);
		return bloco0;
	}
	
	public static Bloco0 preencheRegistro0930(Bloco0 bloco0) {
		Registro0030 registro0030 = new Registro0030();
		registro0030.setCod_nat("2054");
		registro0030.setCnae_fiscal("4030000");
		registro0030.setEndereco("RUA TESTE");
		registro0030.setNum("2050");
		registro0030.setCompl("");
		registro0030.setBairro("PORTO");
		registro0030.setUf("SP");
		registro0030.setCod_mun("0000000");
		registro0030.setCep("00000000");
		registro0030.setNum_tel("18 33021000");
		registro0030.setEmail("admin@ecoded.com.br");
		bloco0.setRegistro0030(registro0030);
		return bloco0;
	}
	

	public static Bloco0 preencheRegistro0030(Bloco0 bloco0) {
		Registro0930 registro0930 = new Registro0930();
		registro0930.setIdent_nom("TESTE CONTADOR");
		registro0930.setIdent_cpf_cnpj("00000000000");
		registro0930.setIdent_qualif("900");
		registro0930.setInd_crc("000000O0");
		registro0930.setEmail("admin@ecoded.com.br");
		registro0930.setFone("1833221000");
		bloco0.getRegistro0930().add(registro0930);
		//bloco0.setRegistro0930(registro0930);
		return bloco0;
	}
	
	

	// ENCERRAMENTO DO BLOCO 0 - INFORMAR QUANTIDADE DE LINHAS
	public static Bloco0 preencheRegistro0990(Bloco0 bloco0) {
		Registro0990 registro0990 = new Registro0990();
		bloco0.setRegistro0990(registro0990);
		return bloco0;
	}

	// BLOCO C
	public static BlocoC preencheBlocoC() {
		BlocoC blocoC = new BlocoC();
		blocoC = preencheRegistroC001(blocoC);
		blocoC = preencheRegistroC040(blocoC);
		// blocoC = preencheRegistroC050(blocoC);
		blocoC = preencheRegistroC050(blocoC);
		blocoC = preencheRegistroC100(blocoC);
		blocoC = preencheRegistroC150(blocoC);
		blocoC = preencheRegistroC350(blocoC);
		blocoC = preencheRegistroC990(blocoC);
		return blocoC;
	}

//  ABERTURA DO BLOCO I
	public static BlocoC preencheRegistroC001(BlocoC blocoC) {
		RegistroC001 registroC001 = new RegistroC001();
		registroC001.setInd_dad("1");

		blocoC.setRegistroC001(registroC001);
		return blocoC;
	}

	public static BlocoC preencheRegistroC040(BlocoC blocoC) {
		RegistroC040 registroC040 = new RegistroC040();
		registroC040.setHash_ecd("8152EA2A0D523373D2D160449314DAA94CC7ABBC");
		registroC040.setDt_ini("01012021");
		registroC040.setDt_fin("31122021");
		registroC040.setInd_sit_esp("");
		registroC040.setCnpj("0320900000000");
		registroC040.setNum_ord("21");
		registroC040.setNire("51300005123");
		registroC040.setNat_livr("Escrituracao Contabil Digital do Livro Diario Geral");
		registroC040.setCod_ver_lc("8.00");
		registroC040.setInd_esc("G");
		blocoC.setRegistroC040(registroC040);
		return blocoC;
	}

	public static BlocoC preencheRegistroC050(BlocoC blocoC) {
		RegistroC050 registroC050 = new RegistroC050();
		registroC050.setDt_alt("31122020");
		registroC050.setCod_nat("01");
		registroC050.setInd_cta("S");
		registroC050.setNivel("1");
		registroC050.setCod_cta("1");
		registroC050.setCod_cta_sup("");
		registroC050.setCta("ATIVO");

		RegistroC051 registroC051 = new RegistroC051();
		registroC051.setCod_ent_ref("1");
		registroC051.setCod_ccus("");
		registroC051.setCod_cta_ref("1.01.01.01.01");

//		RegistroC053 registroC053 = new RegistroC053();
//		registroC053.setCod_idt("");
//		registroC053.setCod_cnt_corr("");
//		registroC053.setNat_sub_cnt("");

		registroC050.getRegistroC051().add(registroC051);
//		blocoC.setRegistroC053(registroC053);

		return blocoC;
	}

	public static BlocoC preencheRegistroC100(BlocoC blocoC) {
		RegistroC100 registroC100 = new RegistroC100();
		registroC100.setDt_alt("31122016");
		registroC100.setCod_ccus("1");
		registroC100.setCcus("GERAL");
		blocoC.getRegistroC100().add(registroC100);
		return blocoC;
	}

	public static BlocoC preencheRegistroC150(BlocoC blocoC) {
		RegistroC150 registroC150 = new RegistroC150();
		registroC150.setDt_ini("01012019");
		registroC150.setDt_fin("31012019");
		blocoC.getRegistroC150().add(registroC150);

		RegistroC155 registroC155 = new RegistroC155();
		registroC155.setCod_cta("1.1.01.01.001");
		registroC155.setCod_ccus("");
		registroC155.setVl_sld_ini("10000,00");
		registroC155.setInd_vl_sld_ini("");
		registroC155.setVl_deb("0,00");
		registroC155.setVl_cred("0,00");
		registroC155.setVl_sld_fin("10000,00");
		registroC155.setInd_vl_sld_fin("D");
		registroC155.setLinha_ecd("");

//		RegistroC157 registroC157 = new RegistroC157();
//		registroC157.setCod_cta("");
//		registroC157.setCod_ccus("");
//		registroC157.setVl_sld_fin("");
//		registroC157.setInd_vl_sld_fin("");
//		registroC157.setLinha_ecd("");

		registroC150.getRegistroC155().add(registroC155);
//		blocoC.setRegistroC157(registroC157);

		return blocoC;
	}

	public static BlocoC preencheRegistroC350(BlocoC blocoC) {
		RegistroC350 registroC350 = new RegistroC350();
		registroC350.setDt_res("31122019");

		blocoC.getRegistroC350().add(registroC350);

		RegistroC355 registroC355 = new RegistroC355();
		registroC355.setCod_cta("3.1.02.01.011");
		registroC355.setCod_ccus("");
		registroC355.setVl_cta("83701122,39");
		registroC355.setInd_vl_cta("C");
		registroC355.setLinha_ecd("587658");

		registroC350.getRegistroC355().add(registroC355);

		return blocoC;
	}

	public static BlocoC preencheRegistroC990(BlocoC blocoC) {
		RegistroC990 registroC990 = new RegistroC990();
		blocoC.setRegistroC990(registroC990);
		return blocoC;
	}

	// INICIA BLOCO E
	public static BlocoE preencheBlocoE() {
		BlocoE blocoE = new BlocoE();
		blocoE = preencheRegistroE001(blocoE);
		blocoE = preencheRegistroE010(blocoE);
		blocoE = preencheRegistroE020(blocoE);
		blocoE = preencheRegistroE030(blocoE);
		blocoE = preencheRegistroE990(blocoE);

		return blocoE;
	}

	private static BlocoE preencheRegistroE001(BlocoE blocoE) {
		RegistroE001 registroE001 = new RegistroE001();
		registroE001.setInd_dad("0");
		blocoE.setRegistroE001(registroE001);
		return blocoE;
	}

	private static BlocoE preencheRegistroE010(BlocoE blocoE) {
		RegistroE010 registroE010 = new RegistroE010();
		registroE010.setCod_nat("01");
		registroE010.setCod_cta_ref("1");
		registroE010.setDesc_cta_ref("ATIVO");
		registroE010.setVal_cta_ref("655342901,81");
		registroE010.setInd_val_cta_ref("D");
		// blocoE.setRegistroE010(registroE010);
		blocoE.getRegistroE010().add(registroE010);

		RegistroE015 registroE015 = new RegistroE015();
		registroE015.setCod_cta("1.1.01.01.001");
		registroE015.setCod_ccus("");
		registroE015.setDesc_cta("CAIXA GERAL");
		registroE015.setVal_cta("2855,17");
		registroE015.setInd_val_cta("D");

		registroE010.getRegistroE015().add(registroE015);

		return blocoE;
	}

	private static BlocoE preencheRegistroE020(BlocoE blocoE) {
		RegistroE020 registroE020 = new RegistroE020();
		registroE020.setCod_cta_b("1.02.02.03.0001");
		registroE020.setDesc_cta_lal("IMOVEIS RURAIS PARA INVESTIMENTO - AVJ");
		registroE020.setDt_ap_lal("31122012");
		registroE020.setDt_lim_lal("239");
		registroE020.setTributo("Ajuste a valor presente de elementos do ativo (art. 4º, Lei nº 12.973, de 13 de maio de 2014).");
		registroE020.setVl_saldo_fin("1386593,3");
		registroE020.setInd_vl_saldo_fin("D");
		registroE020.setCod_pb_rfb("");
		blocoE.getRegistroE020().add(registroE020);

		return blocoE;
	}

	private static BlocoE preencheRegistroE030(BlocoE blocoE) {
		RegistroE030 registroE030 = new RegistroE030();
		registroE030.setDt_ini("01012019");
		registroE030.setDt_fin("31032019");
		registroE030.setPer_apur("T01");

		blocoE.getRegistroE030().add(registroE030);

		RegistroE155 registroE155 = new RegistroE155();
		registroE155.setCod_cta("1.1.01.01.001");
		registroE155.setCod_ccus("");
		registroE155.setVl_sld_ini("2855,17");
		registroE155.setInd_vl_sld_ini("D");
		registroE155.setVl_deb("81398,37");
		registroE155.setVl_cred("83498,68");
		registroE155.setVl_sld_fin("754,86");
		registroE155.setInd_vl_sld_fin("D");

		registroE030.getRegistroE155().add(registroE155);

		RegistroE355 registroE355 = new RegistroE355();
		registroE355.setCod_cta("3.3.01.02.027");
		registroE355.setCod_ccus("");
		registroE355.setVl_sld_fin("71,61");
		registroE355.setInd_vl_sld_fin("D");

		registroE030.getRegistroE155().add(registroE155);

		return blocoE;
	}

	// FIM BLOCO E
	public static BlocoE preencheRegistroE990(BlocoE blocoE) {
		RegistroE990 registroE990 = new RegistroE990();
		blocoE.setRegistroE990(registroE990);
		return blocoE;
	}

	public static BlocoJ preencheBlocoJ() {
		BlocoJ blocoJ = new BlocoJ();
		blocoJ = preencheRegistroJ001(blocoJ);
		blocoJ = preencheRegistroJ050(blocoJ);
		blocoJ = preencheRegistroJ100(blocoJ);
		// blocoJ = preencheRegistroJ150(blocoJ);
		// blocoJ = preencheRegistroJ180(blocoJ);
		blocoJ = preencheRegistroJ990(blocoJ);

		return blocoJ;
	}

	public static BlocoJ preencheRegistroJ001(BlocoJ blocoJ) {
		RegistroJ001 registroJ001 = new RegistroJ001();
		registroJ001.setInd_dad("0");
		blocoJ.setRegistroJ001(registroJ001);
		return blocoJ;
	}

	public static BlocoJ preencheRegistroJ050(BlocoJ blocoJ) {
		RegistroJ050 registroJ050 = new RegistroJ050();
		registroJ050.setDt_alt("01102016");
		registroJ050.setCod_nat("01");
		registroJ050.setInd_cta("S");
		registroJ050.setNivel("1");
		registroJ050.setCod_cta("1");
		registroJ050.setCod_cta_sup("");
		registroJ050.setCta("ATIVO");

		// blocoJ.setRegistroJ050(registroJ050);
		blocoJ.getRegistroJ050().add(registroJ050);

		RegistroJ051 registroJ051 = new RegistroJ051();
		registroJ051.setCod_ccus("");
		registroJ051.setCod_cta_ref("1.01.01.01.01");

		registroJ050.getRegistroJ051().add(registroJ051);

//		RegistroJ053 registroJ053 = new RegistroJ053();
//		registroJ053.setCod_idt("");
//		registroJ053.setCod_cnt_corr("");
//		registroJ053.setNat_sub_cnt("");

		// registroJ050.getRegistroJ053().add(registroJ053);

		return blocoJ;
	}

	public static BlocoJ preencheRegistroJ100(BlocoJ blocoJ) {
		RegistroJ100 registroJ100 = new RegistroJ100();
		registroJ100.setDt_alt("01102016");
		registroJ100.setCod_ccus("13");
		registroJ100.setCcus("TESTE S/A");

		blocoJ.getRegistroJ100().add(registroJ100);
		return blocoJ;
	}

	// ENCERRAMENTO DO BLOCO J - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoJ preencheRegistroJ990(BlocoJ blocoJ) {
		RegistroJ990 registroJ990 = new RegistroJ990();
		blocoJ.setRegistroJ990(registroJ990);
		return blocoJ;
	}

	public static BlocoK preencheBlocoK() {
		BlocoK blocoK = new BlocoK();
		blocoK = preencheRegistroK001(blocoK);
		blocoK = preencheRegistroK030(blocoK);
		blocoK = preencheRegistroK155(blocoK);
		blocoK = preencheRegistroK355(blocoK);
		// blocoK = preencheRegistroK180(blocoK);
		blocoK = preencheRegistroK990(blocoK);

		return blocoK;
	}

	public static BlocoK preencheRegistroK001(BlocoK blocoK) {
		RegistroK001 registroK001 = new RegistroK001();
		registroK001.setInd_dad("0");
		blocoK.setRegistroK001(registroK001);
		return blocoK;
	}

	public static BlocoK preencheRegistroK030(BlocoK blocoK) {
		RegistroK030 registroK030 = new RegistroK030();
		registroK030.setDt_ini("01012018");
		registroK030.setDt_fin("31032018");
		registroK030.setPer_apur("T01");

		blocoK.getRegistroK030().add(registroK030);

		return blocoK;
	}

	public static BlocoK preencheRegistroK155(BlocoK blocoK) {
		RegistroK155 registroK155 = new RegistroK155();
		registroK155.setCod_cta("1.1.01.01.001");
		registroK155.setCod_ccus("");
		registroK155.setVl_sld_ini("2855,17");
		registroK155.setInd_vl_sld_ini("D");
		registroK155.setVl_deb("81398,37");
		registroK155.setVl_cred("83498,68");
		registroK155.setVl_sld_fin("754,86");
		registroK155.setInd_vl_sld_fin("D");

		blocoK.getRegistroK155().add(registroK155);

		RegistroK156 registroK156 = new RegistroK156();
		registroK156.setCod_cta_ref("1.01.01.01.01");
		registroK156.setVl_sld_ini("2855,17");
		registroK156.setInd_vl_sld_ini("D");
		registroK156.setVl_deb("81398,37");
		registroK156.setVl_cred("83498,68");
		registroK156.setVl_sld_fin("754,86");
		registroK156.setInd_vl_sld_fin("D");

		registroK155.getRegistroK156().add(registroK156);

		return blocoK;
	}

	public static BlocoK preencheRegistroK355(BlocoK blocoK) {
		RegistroK355 registroK355 = new RegistroK355();
		registroK355.setCod_cta("3.1.02.01.007");
		registroK355.setCod_ccus("");
		registroK355.setVl_sld_fin("282718,65");
		registroK355.setInd_vl_sld_fin("C");

		blocoK.getRegistroK355().add(registroK355);

		RegistroK356 registroK356 = new RegistroK356();
		registroK356.setCod_cta_ref("3.01.01.05.01.99");
		registroK356.setVl_sld_fin("282718,65");
		registroK356.setInd_vl_sld_fin("C");

		registroK355.getRegistroK356().add(registroK356);

		return blocoK;
	}

	// ENCERRAMENTO DO BLOCO K - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoK preencheRegistroK990(BlocoK blocoK) {
		RegistroK990 registroK990 = new RegistroK990();
		blocoK.setRegistroK990(registroK990);
		return blocoK;
	}

	public static BlocoL preencheBlocoL() {
		BlocoL blocoL = new BlocoL();
		blocoL = preencheRegistroL001(blocoL);
		blocoL = preencheRegistroL030(blocoL);
		blocoL = preencheRegistroL100(blocoL);
		blocoL = preencheRegistroL200(blocoL);
		blocoL = preencheRegistroL300(blocoL);
		blocoL = preencheRegistroL990(blocoL);

		return blocoL;
	}

	public static BlocoL preencheRegistroL001(BlocoL blocoL) {
		RegistroL001 registroL001 = new RegistroL001();
		registroL001.setInd_dad("0");
		blocoL.setRegistroL001(registroL001);
		return blocoL;
	}

	public static BlocoL preencheRegistroL030(BlocoL blocoL) {
		RegistroL030 registroL030 = new RegistroL030();
		registroL030.setDt_ini("01012018");
		registroL030.setDt_fin("31032018");
		registroL030.setPer_apur("T01");

		blocoL.getRegistroL030().add(registroL030);

		return blocoL;
	}

	public static BlocoL preencheRegistroL100(BlocoL blocoL) {
		RegistroL100 registroL100 = new RegistroL100();
		registroL100.setCodigo("1");
		registroL100.setDescricao("ATIVO");
		registroL100.setTipo("S");
		registroL100.setNivel("1");
		registroL100.setCod_nat("01");
		registroL100.setCod_cta_sup("");
		registroL100.setVal_cta_ref_ini("655342901,81");
		registroL100.setInd_val_cta_ref_ini("D");
		registroL100.setVal_cta_ref_deb("2183725423,06");
		registroL100.setVal_cta_ref_cred("1965802082,5");
		registroL100.setVal_cta_ref_fin("873266242,37");
		registroL100.setInd_val_cta_ref_fin("D");

		blocoL.getRegistroL100().add(registroL100);

		return blocoL;
	}

	public static BlocoL preencheRegistroL200(BlocoL blocoL) {
		RegistroL200 registroL200 = new RegistroL200();
		registroL200.setInd_aval_estoq("1");

		blocoL.getRegistroL200().add(registroL200);

		RegistroL210 registroL210 = new RegistroL210();
		registroL210.setCodigo("1");
		registroL210.setDescricao("CUSTO DOS PRODUTOS DE FABRICACAO PROPRIA VENDIDOS");
		registroL210.setValor("");

		registroL200.getRegistroL210().add(registroL210);

		return blocoL;
	}

	public static BlocoL preencheRegistroL300(BlocoL blocoL) {
		RegistroL300 registroL300 = new RegistroL300();
		registroL300.setCodigo("3");
		registroL300.setDescricao("RESULTADO L͑UIDO DO PER͏DO");
		registroL300.setTipo("S");
		registroL300.setNivel("1");
		registroL300.setCod_nat("04");
		registroL300.setCod_cta_sup("");
		registroL300.setValor("1874694,63");
		registroL300.setInd_valor("D");

		blocoL.getRegistroL300().add(registroL300);

		return blocoL;
	}

	// ENCERRAMENTO DO BLOCO L - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoL preencheRegistroL990(BlocoL blocoL) {
		RegistroL990 registroL990 = new RegistroL990();
		blocoL.setRegistroL990(registroL990);
		return blocoL;
	}

	public static BlocoM preencheBlocoM() {
		BlocoM blocoM = new BlocoM();
		blocoM = preencheRegistroM001(blocoM);
		blocoM = preencheRegistroM010(blocoM);
		blocoM = preencheRegistroM030(blocoM);
		blocoM = preencheRegistroM350(blocoM);
		blocoM = preencheRegistroM410(blocoM);
		blocoM = preencheRegistroM500(blocoM);
		blocoM = preencheRegistroM990(blocoM);

		return blocoM;
	}

	public static BlocoM preencheRegistroM001(BlocoM blocoM) {
		RegistroM001 registroM001 = new RegistroM001();
		registroM001.setInd_dad("0");
		blocoM.setRegistroM001(registroM001);
		return blocoM;
	}

	public static BlocoM preencheRegistroM010(BlocoM blocoM) {
		RegistroM010 registroM010 = new RegistroM010();
		registroM010.setCod_cta_b("1.02.02.03.0001");
		registroM010.setDesc_cta_lal("IMOVEIS RURAIS PARA INVESTIMENTO - AVJ");
		registroM010.setDt_ap_lal("31122012");
		registroM010.setCod_pb_rfb("2.900");
		registroM010.setDt_lim_lal("");
		registroM010.setCod_tributo("I");
		registroM010.setVl_saldo_ini("313028864,35");
		registroM010.setInd_vl_saldo_ini("C");
		registroM010.setCnpj_sit_esp("");

		blocoM.getRegistroM010().add(registroM010);

		return blocoM;
	}

	public static BlocoM preencheRegistroM030(BlocoM blocoM) {
		RegistroM030 registroM030 = new RegistroM030();
		registroM030.setDt_ini("01012018");
		registroM030.setDt_fin("31032018");
		registroM030.setPer_apur("T01");

		blocoM.getRegistroM030().add(registroM030);

		RegistroM300 registroM300 = new RegistroM300();
		registroM300.setCodigo("1");
		registroM300.setDescricao("ATIVIDADE GERAL");
		registroM300.setTipo_lancamento("R");
		registroM300.setInd_relacao("");
		registroM300.setValor("");
		registroM300.setHist_lan_lal("");

		// blocoM.getRegistroM300().add(registroM300);
		registroM030.getRegistroM300().add(registroM300);

		RegistroM305 registroM305 = new RegistroM305();
		registroM305.setCod_cta_b("1600");
		registroM305.setVl_cta("10429,97");
		registroM305.setInd_vl_cta("C");

		registroM300.getRegistroM305().add(registroM305);

		RegistroM310 registroM310 = new RegistroM310();
		registroM310.setCod_cta("3.3.01.01.005");
		registroM310.setCod_ccus("");
		registroM310.setVl_cta("24454,21");
		registroM310.setInd_vl_cta("D");

		registroM300.getRegistroM310().add(registroM310);

		return blocoM;
	}

	public static BlocoM preencheRegistroM350(BlocoM blocoM) {

		RegistroM350 registroM350 = new RegistroM350();
		registroM350.setCodigo("1");
		registroM350.setDescricao("ATIVIDADE GERAL");
		registroM350.setTipo_lancamento("R");
		registroM350.setInd_relacao("");
		registroM350.setValor("");
		registroM350.setHist_lan_lal("");

		blocoM.getRegistroM350().add(registroM350);

		RegistroM360 registroM360 = new RegistroM360();
		registroM360.setCod_cta("3.3.01.01.005");
		registroM360.setCod_ccus("");
		registroM360.setVl_cta("24454,21");
		registroM360.setInd_vl_cta("D");

		registroM350.getRegistroM360().add(registroM360);

		return blocoM;
	}

	public static BlocoM preencheRegistroM410(BlocoM blocoM) {
		RegistroM410 registroM410 = new RegistroM410();
		registroM410.setCod_cta_b("1600");
		registroM410.setCod_tributo("I");
		registroM410.setVal_lan_lalb_pb("2294189,16");
		registroM410.setInd_val_lan_lalb_pb("DB");
		registroM410.setCod_cta_b_ctp("");
		registroM410.setHist_lan_lalb("PREJUIZO DO EXERCICIO");
		registroM410.setInd_lan_ant("N");

		blocoM.getRegistroM410().add(registroM410);

		return blocoM;
	}

	public static BlocoM preencheRegistroM500(BlocoM blocoM) {
		RegistroM500 registroM500 = new RegistroM500();
		registroM500.setCod_cta_b("1.02.02.03.0001");
		registroM500.setCod_tributo("I");
		registroM500.setSd_ini_lal("313028864,35");
		registroM500.setInd_sd_ini_lal("C");
		registroM500.setVl_lcto_parte_a("129629750,6");
		registroM500.setInd_vl_lcto_parte_a("C");
		registroM500.setInd_vl_lcto_parte_b("0");
		registroM500.setInd_vl_lcto_parte_b("C");
		registroM500.setSd_fim_lal("442658614,95");
		registroM500.setInd_sd_fim_lal("C");

		blocoM.getRegistroM500().add(registroM500);

		return blocoM;
	}

	// ENCERRAMENTO DO BLOCO M - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoM preencheRegistroM990(BlocoM blocoM) {
		RegistroM990 registroM990 = new RegistroM990();
		blocoM.setRegistroM990(registroM990);
		return blocoM;
	}

	public static BlocoN preencheBlocoN() {
		BlocoN blocoN = new BlocoN();
		blocoN = preencheRegistroN001(blocoN);
		blocoN = preencheRegistroN030(blocoN);
		blocoN = preencheRegistroN500(blocoN);
		blocoN = preencheRegistroN600(blocoN);
		blocoN = preencheRegistroN990(blocoN);

		return blocoN;
	}

	public static BlocoN preencheRegistroN001(BlocoN blocoN) {
		RegistroN001 registroN001 = new RegistroN001();
		registroN001.setInd_dad("0");
		blocoN.setRegistroN001(registroN001);
		return blocoN;
	}

	public static BlocoN preencheRegistroN030(BlocoN blocoN) {
		RegistroN030 registroN030 = new RegistroN030();
		registroN030.setDt_ini("01012019");
		registroN030.setDt_fin("31032019");
		registroN030.setPer_apur("T01");

		blocoN.getRegistroN030().add(registroN030);

		return blocoN;
	}

	public static BlocoN preencheRegistroN500(BlocoN blocoN) {
		RegistroN500 registroN500 = new RegistroN500();
		registroN500.setCodigo("1");
		registroN500.setDescricao("Valor da base de calculo do IRPJ");
		registroN500.setValor("3867250,18");

		blocoN.getRegistroN500().add(registroN500);

		return blocoN;
	}

	public static BlocoN preencheRegistroN600(BlocoN blocoN) {
		
		RegistroN600 registroN600 = new RegistroN600();
		registroN600.setCodigo("");
		registroN600.setDescricao("");
		registroN600.setValor("");
		blocoN.setRegistroN600(registroN600);

		RegistroN630 registroN630 = new RegistroN630();
		registroN630.setCodigo("1");
		registroN630.setDescricao("BASE DE CALCULO DO IRPJ");
		registroN630.setValor("-1842196,72");

		registroN600.getRegistroN630().add(registroN630);

		RegistroN650 registroN650 = new RegistroN650();
		registroN650.setCodigo("1");
		registroN650.setDescricao("Valor da Base de Calculo da CSLL");
		registroN650.setValor("-1842196,72");

		registroN600.getRegistroN650().add(registroN650);
		// registroN600.setRegistroN650(registroN650);
		
		
		RegistroN670 registroN670 = new RegistroN670();
		registroN670.setCodigo("1");
		registroN670.setDescricao("BASE DE CALCULO DA CSLL");
		registroN670.setValor("-1842196,72");

		registroN600.getRegistroN670().add(registroN670);



		return blocoN;
	}

	// ENCERRAMENTO DO BLOCO N - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoN preencheRegistroN990(BlocoN blocoN) {
		RegistroN990 registroN990 = new RegistroN990();
		blocoN.setRegistroN990(registroN990);
		return blocoN;
	}

	public static BlocoP preencheBlocoP() {
		BlocoP blocoP = new BlocoP();
		blocoP = preencheRegistroP001(blocoP);
		blocoP = preencheRegistroP990(blocoP);

		return blocoP;
	}

	public static BlocoP preencheRegistroP001(BlocoP blocoP) {
		RegistroP001 registroP001 = new RegistroP001();
		registroP001.setInd_dad("0");
		blocoP.setRegistroP001(registroP001);
		return blocoP;
	}

	// ENCERRAMENTO DO BLOCO P - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoP preencheRegistroP990(BlocoP blocoP) {
		RegistroP990 registroP990 = new RegistroP990();
		blocoP.setRegistroP990(registroP990);
		return blocoP;
	}

	public static BlocoQ preencheBlocoQ() {
		BlocoQ blocoQ = new BlocoQ();
		blocoQ = preencheRegistroQ001(blocoQ);
		blocoQ = preencheRegistroQ990(blocoQ);

		return blocoQ;
	}

	public static BlocoQ preencheRegistroQ001(BlocoQ blocoQ) {
		RegistroQ001 registroQ001 = new RegistroQ001();
		registroQ001.setInd_dad("0");
		blocoQ.setRegistroQ001(registroQ001);
		return blocoQ;
	}

	// ENCERRAMENTO DO BLOCO Q - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoQ preencheRegistroQ990(BlocoQ blocoQ) {
		RegistroQ990 registroQ990 = new RegistroQ990();
		blocoQ.setRegistroQ990(registroQ990);
		return blocoQ;
	}

	public static BlocoT preencheBlocoT() {
		BlocoT blocoT = new BlocoT();
		blocoT = preencheRegistroT001(blocoT);
		blocoT = preencheRegistroT990(blocoT);

		return blocoT;
	}

	public static BlocoT preencheRegistroT001(BlocoT blocoT) {
		RegistroT001 registroT001 = new RegistroT001();
		registroT001.setInd_dad("0");
		blocoT.setRegistroT001(registroT001);
		return blocoT;
	}

	// ENCERRAMENTO DO BLOCO T - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoT preencheRegistroT990(BlocoT blocoT) {
		RegistroT990 registroT990 = new RegistroT990();
		blocoT.setRegistroT990(registroT990);
		return blocoT;
	}

	public static BlocoU preencheBlocoU() {
		BlocoU blocoU = new BlocoU();
		blocoU = preencheRegistroU001(blocoU);
		blocoU = preencheRegistroU990(blocoU);

		return blocoU;
	}

	public static BlocoU preencheRegistroU001(BlocoU blocoU) {
		RegistroU001 registroU001 = new RegistroU001();
		registroU001.setInd_dad("0");
		blocoU.setRegistroU001(registroU001);
		return blocoU;
	}

// ENCERRAMENTO DO BLOCO U - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoU preencheRegistroU990(BlocoU blocoU) {
		RegistroU990 registroU990 = new RegistroU990();
		blocoU.setRegistroU990(registroU990);
		return blocoU;

	}

	public static BlocoV preencheBlocoV() {
		BlocoV blocoV = new BlocoV();
		blocoV = preencheRegistroV001(blocoV);
		blocoV = preencheRegistroV990(blocoV);

		return blocoV;
	}

	public static BlocoV preencheRegistroV001(BlocoV blocoV) {
		RegistroV001 registroV001 = new RegistroV001();
		registroV001.setInd_dad("0");
		blocoV.setRegistroV001(registroV001);
		return blocoV;
	}

	// ENCERRAMENTO DO BLOCO V - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoV preencheRegistroV990(BlocoV blocoV) {
		RegistroV990 registroV990 = new RegistroV990();
		blocoV.setRegistroV990(registroV990);
		return blocoV;
	}

	public static BlocoW preencheBlocoW() {
		BlocoW blocoW = new BlocoW();
		blocoW = preencheRegistroW001(blocoW);
		blocoW = preencheRegistroW990(blocoW);

		return blocoW;
	}

	public static BlocoW preencheRegistroW001(BlocoW blocoW) {
		RegistroW001 registroW001 = new RegistroW001();
		registroW001.setInd_dad("0");
		blocoW.setRegistroW001(registroW001);
		return blocoW;
	}

	// ENCERRAMENTO DO BLOCO W - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoW preencheRegistroW990(BlocoW blocoW) {
		RegistroW990 registroW990 = new RegistroW990();
		blocoW.setRegistroW990(registroW990);
		return blocoW;
	}

	public static BlocoX preencheBlocoX() {
		BlocoX blocoX = new BlocoX();
		blocoX = preencheRegistroX292(blocoX);
		blocoX = preencheRegistroX430(blocoX);
		blocoX = preencheRegistroX450(blocoX);
//		blocoX = preencheRegistroX200(blocoX);
//		blocoX = preencheRegistroX300(blocoX);
		blocoX = preencheRegistroX990(blocoX);

		return blocoX;
	}

	public static BlocoX preencheRegistroX292(BlocoX blocoX) {
		RegistroX292 registroX292 = new RegistroX292();
		registroX292.setCodigo("1");
		registroX292.setDescricao("EXPORTACOES/OPERACOES FINANCEIRAS");
		registroX292.setValor("1067704996,78");

		// blocoX.setRegistroX292(registroX292);
		blocoX.getRegistroX292().add(registroX292);
		return blocoX;
	}

	public static BlocoX preencheRegistroX430(BlocoX blocoX) {
		RegistroX430 registroX430 = new RegistroX430();
		registroX430.setPais("105");
		registroX430.setVl_serv_assist("");
		registroX430.setVl_serv_sem_assist("");
		registroX430.setVl_serv_sem_assist_ext("");
		registroX430.setVl_juro("");
		registroX430.setVl_demais_juros("7374,95");
		registroX430.setVl_divid("");

		blocoX.setRegistroX430(registroX430);
		// blocoX.getRegistroX430().add(registroX430);

		return blocoX;
	}

	public static BlocoX preencheRegistroX450(BlocoX blocoX) {
		RegistroX450 registroX450 = new RegistroX450();
		registroX450.setPais("105");
		registroX450.setVl_serv_assist("");
		registroX450.setVl_serv_sem_assist("");
		registroX450.setVl_serv_sem_assist_ext("");
		registroX450.setVl_juro_pf("");
		registroX450.setVl_juro_pj("");
		registroX450.setVl_demais_juros("6332668,43");
		registroX450.setVl_divid_pf("");
		registroX450.setVl_divid_pj("");

		// blocoX.getRegistroX100().add(registroX100);
		blocoX.setRegistroX450(registroX450);

		return blocoX;
	}

	// ENCERRAMENTO DO BLOCO 0 - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoX preencheRegistroX990(BlocoX blocoX) {
		RegistroX990 registroX990 = new RegistroX990();
		blocoX.setRegistroX990(registroX990);
		return blocoX;
	}

	public static BlocoY preencheBlocoY() {
		BlocoY blocoY = new BlocoY();
		blocoY = preencheRegistroY520(blocoY);
		blocoY = preencheRegistroY540(blocoY);
		blocoY = preencheRegistroY550(blocoY);
		blocoY = preencheRegistroY560(blocoY);
		blocoY = preencheRegistroY570(blocoY);
		blocoY = preencheRegistroY600(blocoY);
		blocoY = preencheRegistroY671(blocoY);
		blocoY = preencheRegistroY720(blocoY);
		blocoY = preencheRegistroY990(blocoY);

		return blocoY;
	}

	public static BlocoY preencheRegistroY520(BlocoY blocoY) {
		RegistroY520 registroY520 = new RegistroY520();
		registroY520.setTip_ext("R");
		registroY520.setPais("69");
		registroY520.setForma("1");
		registroY520.setNat_oper("12005");
		registroY520.setVl_periodo("625365758,56");

		blocoY.getRegistroY520().add(registroY520);
		// blocoY.setRegistroY520(registroY520);
		return blocoY;
	}

	public static BlocoY preencheRegistroY540(BlocoY blocoY) {
		RegistroY540 registroY540 = new RegistroY540();
		registroY540.setCnpj_estab("03209087000108");
		registroY540.setVl_rec_estab("169182190,77|");
		registroY540.setCnae("4632001");

		blocoY.getRegistroY540().add(registroY540);

		return blocoY;
	}

	public static BlocoY preencheRegistroY550(BlocoY blocoY) {
		RegistroY550 registroY550 = new RegistroY550();
		registroY550.setCnpj_exp("04485210001492");
		registroY550.setCod_ncm("23040090");
		registroY550.setVl_venda("786941,13");

		blocoY.getRegistroY550().add(registroY550);

		return blocoY;
	}

	public static BlocoY preencheRegistroY560(BlocoY blocoY) {
		RegistroY560 registroY560 = new RegistroY560();
		registroY560.setCnpj("03209087000108");
		registroY560.setCod_ncm("12019000");
		registroY560.setVl_compra("");
		registroY560.setVl_exp("");

		blocoY.getRegistroY560().add(registroY560);

		return blocoY;
	}

	public static BlocoY preencheRegistroY570(BlocoY blocoY) {
		RegistroY570 registroY570 = new RegistroY570();
		registroY570.setCnpj_fon("00360305000104");
		registroY570.setNome_emp("CAIXA ECONOMICA FEDERAL");
		registroY570.setInd_org_pub("N");
		registroY570.setCod_rec("6800");
		registroY570.setVl_rend("43613,74");
		registroY570.setIr_ret("6624,53");
		registroY570.setCsll_ret("");

		blocoY.getRegistroY570().add(registroY570);

		return blocoY;
	}

	public static BlocoY preencheRegistroY600(BlocoY blocoY) {
		RegistroY600 registroY600 = new RegistroY600();
		registroY600.setDt_alt_soc("07112011");
		registroY600.setDt_fim_soc("");
		registroY600.setPais("105");
		registroY600.setInd_qualif("PF");
		registroY600.setCpf_cnpj("0000000");
		registroY600.setNom_emp("CORINGA DA SILVA");
		registroY600.setQualif("01");
		registroY600.setPerc_cap_tot("80");
		registroY600.setPerc_cap_vot("80");
		registroY600.setCpf_rep_leg("");
		registroY600.setQualif_rep_leg("");
		registroY600.setVl_luc_div("");
		registroY600.setVl_jur_cap("");
		registroY600.setVl_dem_rend("");
		registroY600.setVl_ir_ret("");

		blocoY.getRegistroY600().add(registroY600);

		return blocoY;
	}

	public static BlocoY preencheRegistroY671(BlocoY blocoY) {
		RegistroY671 registroY671 = new RegistroY671();
		registroY671.setVl_aq_maq("0");
		registroY671.setVl_doa_crianca("0");
		registroY671.setVl_doa_idoso("0");
		registroY671.setVl_aq_imobilizado("0");
		registroY671.setVl_bx_imobilizado("0");
		registroY671.setVl_inc_ini("0");
		registroY671.setVl_inc_fin("0");
		registroY671.setVl_csll_deprec_ini("0");
		registroY671.setVl_oc_sem_iof("0");
		registroY671.setVl_folha_aliq_red("0");
		registroY671.setVl_aliq_red("0");
		registroY671.setInd_alter_capital("");
		registroY671.setInd_bcn_csll("");

		// blocoY.getRegistroY671().add(registroY671);

		blocoY.setRegistroY671(registroY671);

		return blocoY;
	}

	public static BlocoY preencheRegistroY720(BlocoY blocoY) {
		RegistroY720 registroY720 = new RegistroY720();
		registroY720.setLuc_liq("111156964,34");
		registroY720.setDt_luc_liq("31122017");
		registroY720.setRec_brut_ant("962714000,89");

		// blocoY.getRegistroY671().add(registroY671);

		blocoY.setRegistroY720(registroY720);

		return blocoY;
	}

	// ENCERRAMENTO DO BLOCO 0 - INFORMAR QUANTIDADE DE LINHAS
	public static BlocoY preencheRegistroY990(BlocoY blocoY) {
		RegistroY990 registroY990 = new RegistroY990();
		blocoY.setRegistroY990(registroY990);
		return blocoY;
	}

}
