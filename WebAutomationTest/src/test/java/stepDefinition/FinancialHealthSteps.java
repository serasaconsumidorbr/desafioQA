package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.financialHealth.FinancialHealthPage;

public class FinancialHealthSteps {

    private final static LoginSteps loginSteps = new LoginSteps();
    private final static FinancialHealthPage financialHealthPage = new FinancialHealthPage();

    @Dado("que estou na tela de início")
    public void que_estou_na_tela_de_inicio() {
        loginSteps.que_estou_na_tela_de_login();
        loginSteps.faco_login_com_dados_validos();
        loginSteps.vejo_a_tela_de_início();
    }

    @Quando("toco em Saúde financeira")
    public void toco_em_Saude_financeira() {
        financialHealthPage.clickFinancialHealthButton();
    }

    @Então("vejo meu Score e histórico de pagamentos")
    public void vejo_meu_Score_e_historico_de_pagamentos(){
        financialHealthPage.financialHealthDisplayed();
    }

    @Dado("que estou na tela de saúde financeira")
    public void que_estou_na_tela_de_saude_financeira() {
        que_estou_na_tela_de_inicio();
        financialHealthPage.clickFinancialHealthButton();
        financialHealthPage.financialHealthDisplayed();
    }

    @Quando("toco em Motivos que Aumentam")
    public void toco_em_Motivos_que_Aumentam(){
        financialHealthPage.clickRiseReason();
    }

    @Então("vejo os fatores que estão fazendo meu Score aumentar")
    public void vejo_os_fatores_que_estao_fazendo_meu_Score_aumentar(){
        financialHealthPage.goodReason();
    }

    @Quando("toco em Motivos que Diminuem")
    public void toco_em_Motivos_que_Diminuem(){
        financialHealthPage.clickFallenReason();
    }

    @Então("vejo os fatores que estão fazendo meu Score diminuir")
    public void vejo_os_fatores_que_estao_fazendo_meu_Score_diminuir(){
        financialHealthPage.badReason();
    }
}
