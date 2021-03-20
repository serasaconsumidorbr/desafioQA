package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\89\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.get("https://www.serasa.com.br/");
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return navegador;
	}

}
