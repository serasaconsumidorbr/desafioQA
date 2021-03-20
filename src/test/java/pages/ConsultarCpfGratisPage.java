package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsultarCpfGratisPage extends BasePage {

	public ConsultarCpfGratisPage(WebDriver navegador) {
		super(navegador);
	}

	public ConsultarCpfGratisPage preencherCpf(String cpf) {
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.findElement(By.id("cpf")).sendKeys(cpf);

		return this;
	}

	public CadastroFormPage clicarConfirmar() {
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//form/button")).click();

		return new CadastroFormPage(navegador);
	}

	public CadastroFormPage informarCpf(String cpf) {
		preencherCpf(cpf);
		clicarConfirmar();

		return new CadastroFormPage(navegador);
	}
	
	public SenhaPage informarCpfValido(String cpf) {
		preencherCpf(cpf);
		clicarConfirmar();
		

		return new SenhaPage(navegador);
	}

}
