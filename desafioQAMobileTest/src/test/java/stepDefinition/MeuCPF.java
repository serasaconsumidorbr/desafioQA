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
        login.que_estou_na_tela_de_login();
        login.insiro_dados_corretos();

    }

    @Quando("^clico na aba meu CPF e dividas negativas$")
    public void clico_na_aba_meu_CPF_e_dividas_negativas() {
        meuCPFPage.tocarNaAbaMeuCPF();
        meuCPFPage.tocarEmDividasNegativas();
    }

    @Então("^valido que nao possuo dividas negativas$")
    public void validoQueNaoPossuoDividasNegativas() {
        meuCPFPage.validoSeNaoTenhoDividasNegativas();
    }
}
