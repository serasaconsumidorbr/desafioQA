package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;
import utils.Dados;


public class Login {
    Dados dados = new Dados();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Dado("^que estou no site$")
    public void queEstouNoSite() {
    dados.loginUrl();
    homePage.validoSite();
    }

    // Cenário: Login usuario invalido

    @Quando("^faco o login com CPF valido$")
    public void facoOLoginComCPFValido() {
        homePage.clicoEntrar();
        loginPage.entrarComUsuario();
        loginPage.clicoContinuar();
        loginPage.entroComSenha();
        loginPage.clicoContinuar();
    }

    @Então("^valido a tela inicio$")
    public void validoATelaInicio() {
        loginPage.validoAcesso();
    }

    // Cenário: Login usuario invalido

    @Quando("^faco o login com CPF invalido$")
    public void facoOloginComCPFInvalido() {
        homePage.clicoEntrar();
        loginPage.entroComUsuarioInvalido();
        loginPage.clicoContinuar();
    }

    @Então("^valido a mensagem de CPF invalido$")
    public void validoAMensagemDeCPFInvalido() {
        loginPage.validoMensagemDeErro();
    }
}
