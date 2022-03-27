package tests;

import org.junit.Test;
import pages.MePage;


public class MeTest extends MePage {


    @Test
    //Aba ABOUT YOU
    public void alterarNameComDadosValidos() {
        login();
        clicarMePage();
        editarName("ana");
        validarEdicaoDoNameValido("ana");
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba ABOUT YOU
    public void alterarNameComDadosInvalidos() {
        login();
        clicarMePage();
        editarName("");
        validarEdicaoDoNameInvalido();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba SECRET, SHHHH!
    public void editarSenhaComDadosValidos() {
        login();
        clicarMePage();
        clicarSecret();
        digitarPasswordPageMe("123");
        clicarSaveMyNewPassword();
        validarAlteracaoDePasswordValido();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba SECRET, SHHHH!
    public void editarSenhaComDadosInvalidos() {
        login();
        clicarMePage();
        clicarSecret();
        digitarPasswordPageMe("");
        clicarSaveMyNewPassword();
        validarAlteracaoDePasswordInvalido();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba MORE DATA ABOUT YOU
    public void adicionarEmailValido() {
        login();
        clicarMePage();
        clicarMoreDataAboutYou();
        clicarAddMoreData();
        adicionarContact("a@a");
        clicarEmSave();
        validarAdicaoDeEmail();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba MORE DATA ABOUT YOU
    public void adicionarEmailInvalido() {
        login();
        clicarMePage();
        clicarMoreDataAboutYou();
        clicarAddMoreData();
        adicionarContact("");
        clicarEmSave();
        validarContactInvalido();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba MORE DATA ABOUT YOU
    public void adicionarPhoneValido() {
        login();
        clicarMePage();
        clicarMoreDataAboutYou();
        clicarAddMoreData();
        selecionarPhone();
        adicionarContact("5199999999");
        clicarEmSave();
        validarAdicaoDePhone();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    //Aba MORE DATA ABOUT YOU
    public void adicionarPhoneInvalido() {
        login();
        clicarMePage();
        clicarMoreDataAboutYou();
        clicarAddMoreData();
        selecionarPhone();
        adicionarContact("");
        clicarEmSave();
        validarContactInvalido();
        gerarScreenshot();
        fecharNavegador();
    }

}
