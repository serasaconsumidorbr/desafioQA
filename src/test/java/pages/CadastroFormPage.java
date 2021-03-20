package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroFormPage extends BasePage {

	public CadastroFormPage(WebDriver navegador) {
		super(navegador);
	}

	public CadastroFormPage preencherNomeSobrenome(String nomesobrenome) {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.id("name")).sendKeys(nomesobrenome);

		return this;
	}

	public CadastroFormPage preencherNascimento(String nascimento) {
		navegador.findElement(By.id("birthDate")).sendKeys(nascimento);
		return this;
	}

	public CadastroFormPage preencherEmail(String email) {
		navegador.findElement(By.id("email")).sendKeys(email);
		return this;
	}

	public CadastroFormPage preencherSenha(String senha) {
		navegador.findElement(By.id("password")).sendKeys(senha);
		return this;
	}

	public CadastroFormPage marcarTermo() {
		navegador.findElement(By.xpath("//*[@id=\"sign_up_form\"]/div[7]/label/span")).click();
		return this;
	}

	public CadastroFormPage clicarCriarConta() {
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"sign_up_form\"]/div[8]/input")).click();

		return this;
	}

	public String capturarTexto() {		

		return navegador.findElement(By.xpath("//*[@id=\"sign_up_form\"]/div[1]/p")).getText();
	}

	public CadastroFormPage preencherFormulario(String nomesobrenome, String nascimento, String email, String senha) {
		preencherNomeSobrenome(nomesobrenome);
		preencherNascimento(nascimento);
		preencherEmail(email);
		preencherSenha(senha);
		marcarTermo();
		clicarCriarConta();
		return this;
	}

}
