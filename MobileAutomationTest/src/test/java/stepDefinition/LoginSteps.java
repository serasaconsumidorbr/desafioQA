package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.home.HomeScreen;
import screens.login.LoginScreen;


public class LoginSteps {

    OnboardingSteps onboardingSteps = new OnboardingSteps();
    LoginScreen loginScreen = new LoginScreen();
    HomeScreen homeScreen = new HomeScreen();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        onboardingSteps.que_estou_na_tela_de_Onboard();
        onboardingSteps.sigo_todos_os_passos_corretamente();
        onboardingSteps.vejo_a_tela_de_login();
    }

    @Quando("^insiro dados de login válidos$")
    public void insiro_dados_de_login_válidos() {
        loginScreen.fillCpf();
        loginScreen.clickButtonConfirmActon();
        loginScreen.clickButtonSignin();
        loginScreen.fillPassword();
        loginScreen.clickButtonDialogInputPasswordSecond();
    }

    @Então("^vejo a home$")
    public void vejo_a_home() {
        homeScreen.viewBackgroundIcProfileDisplayed();
    }

    @Quando("^insiro CPF de login inválido$")
    public void insiro_CPF_de_login_invalido() {
        loginScreen.fillWrongCpf();
        loginScreen.clickButtonConfirmActon();
    }

    @Então("^vejo mensagem de erro$")
    public void vejo_mensagem_de_erro() {
        loginScreen.textviewRegisterTitleDisplayed();
    }

}
