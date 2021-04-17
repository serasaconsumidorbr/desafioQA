package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;

public class BasePage extends Utils {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void clickElement (By element) {
        waitForElement(element);
        webdriver().findElement(element).click();
    }

    public void insertElement (By element, String valor) {
        waitForElement(element);
        webdriver().findElement(element).sendKeys(valor);
    }

    public WebElement waitForElement (By element) {
       return new WebDriverWait(webdriver(),10000).until(ExpectedConditions.presenceOfElementLocated(element));
    }


    public void scrollPage(){
        js.executeScript("window.scrollBy(0,1000)");
    }
}
