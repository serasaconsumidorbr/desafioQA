package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver navegador;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}

}
