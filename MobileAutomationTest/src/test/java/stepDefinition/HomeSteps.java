package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.home.HomeScreen;
import screens.services.ServicesScreen;

public class HomeSteps {

    LoginSteps loginSteps = new LoginSteps();
    HomeScreen homeScreen = new HomeScreen();
    ServicesScreen servicesScreen = new ServicesScreen();


    @Dado("^que estou na tela home$")
    public void que_estou_na_tela_home(){
        loginSteps.que_estou_na_tela_de_login();
        loginSteps.insiro_dados_de_login_válidos();
        loginSteps.vejo_a_home();
    }

    @Quando("^toco em Serviços$")
    public void toco_em_Servicos() {
        homeScreen.clickTextViewService();
    }
    @Então("^vejo a tela de serviços$")
    public void vejo_a_tela_de_servicos() {
        servicesScreen.textviewTitleCardMonitoringDisplayed();
    }
}
