package stepDefinition;

import io.cucumber.java.pt.*;
import page.AreaClientePage;
import page.LoginPage;
import utils.Utils;

public class LoginStep {

    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();
    AreaClientePage areaClientePage = new AreaClientePage();

    @Dado("que estou no Site Serasa")
    public void que_estou_no_site_serasa() {
        utils.webdriver().get("https://www.serasa.com.br/");
    }

    @Quando("faço um login valido")
    public void faço_um_login_valido() {
        loginPage.entrarConta();
        loginPage.login();
    }

    @Então("vejo informações da minha  Conta")
    public void vejo_informações_da_minha_conta() {
        areaClientePage.verificarInformaçõesTela();
    }

}



