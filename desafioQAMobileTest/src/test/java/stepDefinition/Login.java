package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;

public class Login {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.tocoEmProximo();
        loginPage.tocoEmProximo();
        loginPage.tocoEmProximo();
    }

    @Quando("^insiro dados corretos$")
    public void insiro_dados_corretos() {
        loginPage.colocoUsuario();
        loginPage.tocoEmContinuar();
        loginPage.tocoEntroComSenha();
        loginPage.colocoSenha();
        loginPage.tocoEmEntrar();
        loginPage.tocoEmMaisTarde();
    }

    @Então("^vejo a tela de login$")
    public void vejo_a_tela_de_login() {
        loginPage.validaTelaLogada();
    }

    @Quando ("insiro usuario incorreto")
    public void insiro_usuario_incorreto() {
        loginPage.colocoUsuarioIncorreto();
        loginPage.tocoEmContinuar();
    }
    @Então ("vejo a mensagem de usuario invalido")
    public void vejo_a_mensagem_de_usuario_invalido(){
        loginPage.validoUsuarioIncorreto();
    }
}
