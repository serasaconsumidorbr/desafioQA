package tests;

import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends LoginPage {


    @Test
    public void realizarLogin() {
        clicarSignIn();
        digitarLogin("k@k");
        digitarPassword("123");
        clicarSignInForm();
        validarLogin();
    }

    @Test
    public void realizarLoginInvalido(){
        clicarSignIn();
        digitarLogin("");
        digitarPassword("123");
        clicarSignInForm();
        validarToastLoginInvalido();
    }

}
