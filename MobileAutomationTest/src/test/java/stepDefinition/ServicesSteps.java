package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.services.ServicesScreen;

public class ServicesSteps {

    HomeSteps homeSteps = new HomeSteps();
    ServicesScreen servicesScreen = new ServicesScreen();

    @Dado("^que estou na tela de Serviços$")
    public void que_estou_na_tela_de_Servicos(){
        homeSteps.que_estou_na_tela_home();
        homeSteps.toco_em_Servicos();
        homeSteps.vejo_a_tela_de_servicos();
    }

    @Quando("^toco em Monitoramento de CPF ativo$")
    public void toco_em_Monitoramento_de_CPF_ativo(){
        servicesScreen.clickTextviewTitleCardMonitoring();
    }
    @Então("^vejo a tela de monitoramento$")
    public void vejo_a_tela_de_monitoramento(){
        servicesScreen.reportDetailTitleDisplayed();
    }
}
