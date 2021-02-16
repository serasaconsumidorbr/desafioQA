package stepDefinition;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import enums.Browsers;
import pages.login.LoginPage;
import utils.ReadProperties;

import java.io.IOException;

public class LoginSteps {

    private final static LoginPage loginPage = new LoginPage();
    private final static ReadProperties readProperties = new ReadProperties();

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login(){
        loginPage.clickEnterButton();
    }
    @Quando("faço login com dados válidos")
    public void faco_login_com_dados_validos() {
        loginPage.fillCPF(ReadProperties.readValue("valid_cpf"));
        loginPage.clickConfirmButton();
        loginPage.fillPassword(ReadProperties.readValue("user_password"));
        loginPage.clickConfirmButton();
    }
    @Então("vejo a tela de início")
    public void vejo_a_tela_de_início(){
        loginPage.financialExploreDisplayed();
    }

    @Quando("faço login com CPF inválido")
    public void faco_login_com_CPF_invalido() {
        loginPage.fillCPF(ReadProperties.readValue("invalid_cpf"));
        loginPage.clickConfirmButton();
    }
    @Então("vejo mensagem de usuário inválido")
    public void vejo_mensagem_de_usuario_invalido(){
        loginPage.invalidCPFDisplayed();
    }

    @Dado("que estou logado na aplicação")
    public void que_estou_logado_na_aplicacao() {
        que_estou_na_tela_de_login();
        faco_login_com_dados_validos();
        vejo_a_tela_de_início();
    }
    @Quando("faço logout")
    public void faco_logout(){
        loginPage.clickProfileIcon();
        loginPage.logoutButton();
    }
    @Então("vejo a tela de login")
    public void vejo_a_tela_de_login(){
        loginPage.enterButtonDisplayed();
    }
}
