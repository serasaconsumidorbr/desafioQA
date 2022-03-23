package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Driver;

public class LoginPage extends Driver {

    public WebDriver navegador = creatChrome();

    public void clicarSignIn() {
        navegador.findElement(By.linkText("Sign in")).click();
    }
}
