package tests;

import org.junit.Test;
import pages.BasePage;

public class LoginTest extends BasePage {


    @Test
    public void realizarLoginValido() {
        clicarSignIn();
        digitarLogin("k@k");
        digitarPassword("123");
        clicarSignInForm();
        validarLogin();
        gerarScreenshot();
        fecharNavegador();

    }

    @Test
    public void realizarLoginInvalido(){
        clicarSignIn();
        digitarLogin("");
        digitarPassword("123");
        clicarSignInForm();
        validarToastLoginInvalido();
        gerarScreenshot();
        fecharNavegador();
    }

}
