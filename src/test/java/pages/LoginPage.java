package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Driver;

import static org.junit.Assert.*;

public class LoginPage extends Driver {

    public WebDriver navegador = creatChrome();


    public void clicarSignIn() {
        navegador.findElement(By.linkText("Sign in")).click();
    }


    public void digitarLogin(String login) {
        navegador.findElement(By.xpath("(//input[@name='login'])[2]")).sendKeys(login);
    }
    public void digitarPassword(String senha) {
        navegador.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys(senha);
    }

    public void clicarSignInForm() {
        navegador.findElement(By.linkText("SIGN IN")).click();
    }

    public void validarLogin(){
        String esperada = "Now you are registered and can add tasks that you want to do in a far away future.";
        String recebida = navegador.findElement(By.xpath("//p[contains(.,'Now you are registered and can add tasks that you want to do in a far away future.')]")).getText();
        assertEquals(esperada,recebida);
    }

    public void validarToastLoginInvalido(){
        String esperada = "Maybe you brain dropped the password or login in some place!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Maybe you brain dropped the password or login in some place!')]")).getText();
        assertEquals(esperada,recebida);

    }
}
