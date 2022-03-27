package tests;

import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends LoginPage {


    @Test
    public void realizarLoginValido() {
        clicarSignIn();
        digitarLogin();
        digitarPassword("123");
        clicarSignInForm();
        validarLogin();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    public void realizarLoginInvalido(){
        clicarSignIn();
        digitarLogin();
        digitarPassword("123");
        clicarSignInForm();
        validarToastLoginInvalido();
        gerarScreenshot();
        fecharNavegador();
    }

}
