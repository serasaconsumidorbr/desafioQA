package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaudeFinancPage extends BasePage {

	public SaudeFinancPage(WebDriver navegador) {
		super(navegador);
	}
	
	public HistoricoPage clicarHistorico() {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/a[1]/span/div")).click();

		return new HistoricoPage(navegador);
	}
}
