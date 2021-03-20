package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SenhaPage extends BasePage {

	public SenhaPage(WebDriver navegador) {
		super(navegador);
	}

	public SenhaPage preencherSenha(String senha) {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.id("password")).sendKeys(senha);

		return this;
	}

	public UsuarioPage clicarConfirmar() {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//form/button")).click();

		return new UsuarioPage(navegador);
	}

	public UsuarioPage InformarSenha(String senha) {
		preencherSenha(senha);
		clicarConfirmar();
		return new UsuarioPage(navegador);
	}

}
