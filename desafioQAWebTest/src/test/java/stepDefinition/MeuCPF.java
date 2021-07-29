package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.MeuCPFPage;

public class MeuCPF {

    Login login = new Login();
    MeuCPFPage meuCPFPage = new MeuCPFPage();

    @Dado("^que estou logado$")
    public void queEstouLogado() {
        login.queEstouNoSite();
        login.facoOLoginComCPFValido();

    }

    @Quando("^clico na aba meu CPF e dividas negativas$")
    public void clicoNaAbaMeuCPFEDividasNegativas() {
        meuCPFPage.clicoNaAbaMeuCPF();
        meuCPFPage.clicoEmDividasNegativas();
    }

    @Então("^valido que nao possuo dividas negativas$")
    public void validoQueNaoPossuoDividasNegativas() {
        meuCPFPage.validoSeNaoTenhoDividasNegativas();
    }
}
