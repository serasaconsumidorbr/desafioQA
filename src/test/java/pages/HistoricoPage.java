package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistoricoPage extends BasePage {

	public HistoricoPage(WebDriver navegador) {
		super(navegador);
	}
	
	public String capturarTextoHistorico() {		

		return navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/p")).getText();
	}

}
