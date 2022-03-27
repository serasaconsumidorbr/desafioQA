package tests;

import org.junit.Test;
import pages.SignUpPage;

public class SignUpTest extends SignUpPage {

    @Test
    public void realizarInscricao(){
        clicarSignUp();
        digitarName("maria");
        digitarLoginNovo();
        digitarPassword("123");
        clicarEmSave();
        validarLogin();
        gerarScreenshot();
        fecharNavegador();
    }

    @Test
    public void realizarInscricaoComMesmoLogin(){
        clicarSignUp();
        digitarName("maria");
        digitarLoginJaExistente("k@k");
        digitarPassword("123");
        clicarEmSave();
        validarCadastroDuplicado();
        gerarScreenshot();
        fecharNavegador();

    }


}
