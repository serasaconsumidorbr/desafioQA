package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import tests.LoginTest;

public class MyTaskPage extends LoginTest {

    public void clicarMyTasks() {
        navegador.findElement(By.xpath("(//a[contains(.,'My tasks')])[1]")).click();
    }

    public void clicarAddATask() {
        navegador.findElement(By.xpath("//button[contains(.,'+ Add a task')]")).click();
    }

    public void adicionarTituloDaTask(String titulo) {
        navegador.findElement(By.xpath("//input[@name='title']")).sendKeys(titulo);
    }

    public void adicionarDateLimit() {
        navegador.findElement(By.xpath("(//input[@type='text'])[2]")).click();
        navegador.findElement(By.xpath("//button[contains(.,'Today')]")).click();
        navegador.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
    }

    public void adicionarTimeLimit() {
        WebElement element = navegador.findElement(By.xpath("(//input[@type='text'])[3]"));
        JavascriptExecutor executor = (JavascriptExecutor) navegador;
        executor.executeScript("arguments[0].click();", element);
        navegador.findElement(By.xpath("//button[contains(.,'OK')]")).click();
    }

    public void adicionarInformacoesDaTask(String text) {
        navegador.findElement(By.xpath("//textarea[@name='text']")).sendKeys(text);
    }

    public void selecionarEstadoDaTask() {
        navegador.findElement(By.xpath("//*[@id=\"addtask\"]/div[1]/div[5]/select/option[2]")).click();
    }

    public void clicarEmSave() {
        navegador.findElement(By.xpath("//a[contains(.,'Save')]")).click();
    }

    public void validarTaskAdicionada() {
        String esperada = "The task has been added, pretty simple!";
        String recebida = navegador.findElement(By.xpath("(//div[contains(.,'The task has been added, pretty simple!')])[2]")).getText();
        Assert.assertEquals(esperada,recebida);
    }
}
