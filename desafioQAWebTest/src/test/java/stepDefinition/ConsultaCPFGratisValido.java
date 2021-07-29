package stepDefinition;


import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.ConsultaCPFGratisPage;
import pages.LoginPage;

public class ConsultaCPFGratisValido {

    ConsultaCPFGratisPage consultaCpfPage = new  ConsultaCPFGratisPage();
    LoginPage loginPage = new LoginPage();

    @Quando("^clico no botao Consultar CPF gratis$")
    public void clicoNoBotaoConsultarCPFGratis() {
        consultaCpfPage.clicoEmConsultaCPFGratis();
    }

    @Quando("^faco o login com usuario valido$")
    public void facoOLoginComUsuarioValido() {
        loginPage.entrarComUsuario();
        loginPage.clicoContinuar();
        loginPage.entroComSenha();
        loginPage.clicoContinuar();
    }

    @Então("^valido meu Score$")
    public void validoMeuScore() {
        consultaCpfPage.validoMeuScoreTelaInicio();
    }

    @Quando("^faco o login com usuario invalido$")
    public void faco_o_login_com_usuario_invalido() {
        loginPage.entroComUsuarioInvalido();
        loginPage.clicoContinuar();
    }

    @Então("^valido a mensagem de dados invalido$")
    public void validoAMensagemDeDadosInvalido() {
        loginPage.validoMensagemDeErro();
    }
}
