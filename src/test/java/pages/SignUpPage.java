package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Driver;

public class SignUpPage extends LoginPage {

    public void clicarSignUp(){
        navegador.findElement(By.cssSelector("#signup")).click();
    }

    public void digitarName(){
        navegador.findElement(By.name("name")).sendKeys("maria");
    }

    public void digitarLogin(String login){
        navegador.findElement(By.name("login")).sendKeys(login);
    }

    public void digitarPassword(String senha){
        navegador.findElement(By.name("password")).sendKeys(senha);
    }

    public void clicarEmSave(){
        navegador.findElement(By.xpath("//a[contains(.,'Save')]")).click();
    }

    public void validarCadastroDuplicado(){
        String esperada = "Someone choose this login before, please pick another!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Someone choose this login before, please pick another!')]")).getText();
        Assert.assertEquals(esperada, recebida);
    }
}
