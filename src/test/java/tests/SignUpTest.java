package tests;

import org.junit.Test;
import pages.SignUpPage;

public class SignUpTest extends SignUpPage {

    @Test
    public void realizarInscricao(){
        clicarSignUp();
        digitarName("maria");
        digitarLogin("m1@m");
        digitarPassword("123");
        clicarEmSave();
        validarLogin();
    }

    @Test
    public void realizarInscricaoComMesmoLogin(){
        clicarSignUp();
        digitarName("maria");
        digitarLogin("m1@m");
        digitarPassword("123");
        clicarEmSave();
        validarCadastroDuplicado();

    }


}
