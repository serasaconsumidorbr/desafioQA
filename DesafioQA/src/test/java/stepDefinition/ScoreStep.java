package stepDefinition;

import io.cucumber.java.pt.*;
import page.AreaClientePage;
import page.LoginPage;
import page.ScorePage;
import utils.Utils;

public class ScoreStep {

    Utils utils = new Utils();
    ScorePage scorePage = new ScorePage();
    LoginPage loginPage = new LoginPage();
    AreaClientePage areaCliente = new AreaClientePage();
    LoginStep loginStep =  new LoginStep();


    @Dado("que estou na tela da Area Cliente")
    public void que_estou_na_tela_da_area_cliente() {
        loginStep.que_estou_no_site_serasa();
        loginStep.faço_um_login_valido();

    }
    @Quando("clico em Entenda seu Serasas Score")
    public void clico_em_entenda_seu_serasas_score() {
        areaCliente.entendaSeuSerasaScore();
    }
    @Então("vejo informações do Score")
    public void vejo_informações_do_score() {
        scorePage.tituloEntendaSuaSaudeFinanceira();

    }
//-----------------------------------------------------------------


    @Dado("que estou na tela da Saude Financeira")
    public void que_estou_na_tela_da_saude_financeira() {
        loginStep.que_estou_no_site_serasa();
        loginStep.faço_um_login_valido();
        areaCliente.entendaSeuSerasaScore();
    }
    @Quando("clico em ver Historico")
    public void clico_em_ver_historico() {
        scorePage.verHistorico();

    }
    @Então("vejo informações do Historico Score")
    public void vejo_informações_do_historico_score() {
        scorePage.tituloHistoricoScore();
    }

//----------------------------------------------------------------

    @Quando("clico em ver todas as faixas")
    public void clico_em_ver_todas_as_faixas() {
        scorePage.clicarFaixaScore();
}
    @Então("vejo informações do Faixa de Score")
    public void vejo_informações_do_faixa_de_score() {
        scorePage.tituloFaixaScore();
    }

//-----------------------------------------------------------------

    @Quando("clico no botao compromisso com crédito")
    public void clico_no_botao_compromisso_com_crédito() {
        scorePage.clicarCompromissoCredito();
    }
    @Então("vejo informações compromisso com credito")
    public void vejo_informações_compromisso_com_credito() {
        scorePage.tituloCompromissoCredito();
    }

// -----------------------------------------------------------------
}