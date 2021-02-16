package stepDefinition;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.login.LoginScreen;
import screens.onboarding.OnboardingScreen;


public class OnboardingSteps {

    OnboardingScreen onboardingScreen = new OnboardingScreen();
    LoginScreen loginScreen = new LoginScreen();

    @Dado("que estou na tela de Onboard")
    public void que_estou_na_tela_de_Onboard(){
        onboardingScreen.textViewOnboardDisplayed();
    }
    @Quando("sigo todos os passos corretamente")
    public void sigo_todos_os_passos_corretamente(){
        onboardingScreen.clickBtnOnboardNext();
        onboardingScreen.textSecondViewOnboardDisplayed();
        onboardingScreen.clickBtnOnboardNext();
        onboardingScreen.textThirdViewOnboardDisplayed();
        onboardingScreen.clickBtnOnboardNext();
    }
    @Então("vejo a tela de login")
    public void vejo_a_tela_de_login(){
        loginScreen.textViewInsertCpfDisplayed();
    }
}
