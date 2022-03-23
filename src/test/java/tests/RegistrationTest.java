package tests;

import org.junit.Test;
import pages.RegistrationPage;

public class RegistrationTest extends RegistrationPage {

    @Test
    public void realizarCadastro(){
        clicarSignUp();
        digitarName();
        digitarLogin("m1@m");
        digitarPassword("123");
        clicarEmSave();
        validarLogin();
    }

    @Test
    public void realizarCadastroComMesmoLogin(){
        clicarSignUp();
        digitarName();
        digitarLogin("m1@m");
        digitarPassword("123");
        clicarEmSave();
        validarCadastroDuplicado();

    }


}
