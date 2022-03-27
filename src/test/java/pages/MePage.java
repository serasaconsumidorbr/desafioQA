package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MePage extends BasePage {

    public void clicarMePage() {
        WebElement mePage = (new WebDriverWait(navegador, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='me'])[1]")));
        mePage.click();
        //navegador.findElement(By.xpath("(//a[@class='me'])[1]")).click();
    }

    public void editarName(String name) {
        navegador.findElement(By.name("name")).clear();
        navegador.findElement(By.name("name")).sendKeys(name);
        navegador.findElement(By.id("changeAboutYou")).click();
    }

    public void validarEdicaoDoNameValido(String name) {
        String esperada = "Now you will be called " + name + "!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Now you will be called " + name + "!')]")).getText();
        assertEquals(esperada, recebida);
    }

    public void validarEdicaoDoNameInvalido() {
        String esperada = "Ask to change your name and do not tell it, does not make sense!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Ask to change your name and do not tell it, does not make sense!')]")).getText();
        assertEquals(esperada, recebida);
    }

    public void clicarSecret() {
        navegador.findElement(By.xpath("//a[@href='#secret'][contains(.,'Secret, shhhh!')]")).click();
    }

    public void digitarPasswordPageMe(String senha) {
        navegador.findElement(By.xpath("//input[@name='password']")).sendKeys(senha);
    }

    public void clicarSaveMyNewPassword() {
        navegador.findElement(By.id("changeMyPassword")).click();
    }

    public void clicarMoreDataAboutYou() {
        navegador.findElement(By.xpath("//a[contains(.,'More data about you')]")).click();
    }

    public void clicarAddMoreData() {
        navegador.findElement(By.xpath("//button[contains(.,'+ Add more data')]")).click();
    }

    public void adicionarContact(String contact) {
        navegador.findElement(By.name("contact")).sendKeys(contact);
    }

    public void clicarEmSave() {
        navegador.findElement(By.xpath("//a[contains(.,'Save')]")).click();
    }

    public void selecionarPhone(){
        navegador.findElement(By.xpath("//*[@id=\"addmoredata\"]/div[1]/div[2]/select/option[2]")).click();
    }

    public void validarAlteracaoDePasswordValido() {
        String esperada = "You have a new secret, please do not share it!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'You have a new secret, please do not share it!')]")).getText();
        assertEquals(esperada, recebida);
    }

    public void validarAlteracaoDePasswordInvalido() {
        String esperada = "Do not be afraid, we will not share your secret!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Do not be afraid, we will not share your secret!')]")).getText();
        assertEquals(esperada, recebida);
    }

    public void validarAdicaoDeEmail() {
        String esperada = "Your contact has been added!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Your contact has been added!')]")).getText();
        assertEquals(esperada, recebida);

    }

    public void validarAdicaoDePhone() {
        String esperada = "Your contact has been added!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'Your contact has been added!')]")).getText();
        assertEquals(esperada, recebida);

    }

    public void validarContactInvalido() {
        String esperada = "I think that you forget to tell me something!";
        String recebida = navegador.findElement(By.xpath("//div[@class='toast rounded'][contains(.,'I think that you forget to tell me something!')]")).getText();
        assertEquals(esperada, recebida);

    }



}
