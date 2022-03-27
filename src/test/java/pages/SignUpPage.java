package pages;

import org.openqa.selenium.By;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SignUpPage extends LoginPage {

    public void clicarSignUp(){
        navegador.findElement(By.cssSelector("#signup")).click();
    }

    public void digitarName(String name){
        navegador.findElement(By.name("name")).sendKeys(name);
    }


    public void digitarLoginJaExistente(String login){
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
        assertEquals(esperada, recebida);
    }
}
