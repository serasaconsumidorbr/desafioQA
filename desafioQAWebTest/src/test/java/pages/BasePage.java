package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.WebDriver;

public class BasePage extends WebDriver {

    public void clicarNoElemento (By element) {
        esperarPorElemento(element);
        webdriver().findElement(element).click();
    }

    public void inserirElemento ( By element, String valor) {
        esperarPorElemento(element);
        webdriver().findElement(element).sendKeys(valor);
    }

    public WebElement esperarPorElemento (By element) {
        return new WebDriverWait(webdriver(),10000).until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public boolean elementoVisivel (By element) {
        esperarPorElemento(element);
        boolean visivel = webdriver().findElement(element).isDisplayed();
        return visivel;

    }
}
