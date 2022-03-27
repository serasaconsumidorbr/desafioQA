package tests;

import org.junit.Test;
import pages.LogoutPage;

public class LogoutTest extends LogoutPage {

    @Test
    public void realizarLogout(){
        clicarLogout();
        validarLogout();
    }
}
