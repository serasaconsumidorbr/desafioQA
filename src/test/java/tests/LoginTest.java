package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Driver;

public class LoginTest extends Driver {

    public WebDriver navegador = creatChrome();

    @Test
    public void clicarBotaoSignIn() {
        navegador.findElement(By.linkText("Sign in")).click();
    }
}
