package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage extends BasePage {

    public void clicarLogout(){
        navegador.findElement(By.xpath("(//a[contains(.,'Logout')])[1]")).click();
    }

    public void validarLogout(){
        WebElement signIn = (new WebDriverWait(navegador, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(.,'Sign in')])[1]")));
    signIn.isDisplayed();
    }
}
