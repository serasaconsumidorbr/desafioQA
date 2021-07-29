package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public final By btnEntrar = By.xpath("//*[@data-gtm-name='Entrar']");

 //   @FindBy(xpath = "//*[@data-gtm-name='Entrar']")
 //   public WebElement btnEntrar;

    public void validoSite() {
        elementoVisivel(btnEntrar);
    }

    public void clicoEntrar() {
        clicarNoElemento(btnEntrar);
    }

}
