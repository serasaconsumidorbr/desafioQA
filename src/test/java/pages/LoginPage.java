package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import suport.Driver;

public class LoginPage extends Driver {

    public WebDriver navegador = creatChrome();


    public void clicarSignIn() {
        navegador.findElement(By.linkText("Sign in")).click();
    }

    WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

    public void digitarLogin(String login) {
        formularioSignInBox.findElement(By.name("login")).sendKeys(login);
    }
    public void digitarPassword(String senha) {
        formularioSignInBox.findElement(By.name("password")).sendKeys(senha);
    }

    public void clicarSignInForm() {
        navegador.findElement(By.linkText("SIGN IN")).click();
    }

    public void validarLogin(){
        String esperado = "Now you are registered and can add tasks that you want to do in a far away future.";
        String recebido = navegador.findElement(By.xpath("//p[contains(.,'Now you are registered and can add tasks that you want to do in a far away future.')]")).getText();
        Assert.assertEquals(esperado,recebido);
    }

    public void validarToastLoginInvalido(){
        String esperado = "Maybe you brain dropped the password or login in some place!";
        String recebido = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Maybe you brain dropped the password or login in some place!')]")).getText();
        Assert.assertEquals(esperado,recebido);

    }
}
