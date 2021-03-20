package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsuarioPage extends BasePage{
	
	public UsuarioPage(WebDriver navegador) {
		super(navegador);
	}
	
	public UsuarioPage clicarProfile() {
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/button")).click();
		
		return this;
	}
	
	public String capturarTextoUsuario() {		

		return navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/ul/li[1]/button/div/p[1]")).getText();
	}
	
	public SaudeFinancPage clicarSaude() {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"__next\"]/div/nav/ul/li[2]/a")).click();

		return new SaudeFinancPage(navegador);
	}

}
