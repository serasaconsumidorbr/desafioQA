package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import page.AreaClientePage;
import page.HomePage;
import page.LoginPage;
import utils.Utils;


public class ConsultaCpfStep {

      Utils utils = new Utils();
      HomePage homePage = new HomePage();
      AreaClientePage areaCliente = new AreaClientePage() ;
      LoginPage loginPage = new LoginPage();
      LoginStep loginStep = new LoginStep();


    @Dado("que estou no site Serasa")
    public void que_estou_no_site_serasa() throws InterruptedException {
        loginStep.que_estou_no_site_serasa();
        homePage.tituloSerasa();


    }
    @Dado("clico no botão Consultar seu cpf gratis")
    public void clico_no_botão_consultar_seu_cpf_gratis() {
         homePage.botaoConsultarCPFGratis();

    }
    @Quando("faço login valido")
    public void faço_login_valido(){
        loginPage.login();
    }

    @Então("vejo informações da minha conta")
    public void vejo_informações_da_minha_conta() {
        areaCliente.verificarInformaçõesTela();
    }

}
