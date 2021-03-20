package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver navegador) {
		super(navegador);
	}

	public ConsultarCpfGratisPage clicarConsultarCpf() {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[2]/button")).click();
		return new ConsultarCpfGratisPage(navegador);
	}
	
	public ConsultarCpfGratisPage clicarEntrar() {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/div[3]/button")).click();
		
		return new ConsultarCpfGratisPage(navegador);
		
	}

}
