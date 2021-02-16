package utils;

import enums.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class BasePage {

    private static final long DEFAULT_TIME_WAIT = 10;

    public BasePage() {

    }

    public static WebDriver getDriver() {
        return Browsers.webDriver;
    }

//    protected void openUrl(String url) {
//        getDriver().get(url);
//    }
//
//    protected String getUrl() {
//        return getDriver().getCurrentUrl();
//    }

    protected WebElement waitElement(By locator) {
        return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    protected List<WebElement> waitElements(By locator) {
        return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected boolean isVisible(By locator) {
        new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.visibilityOf(getElement(locator)));
        return getElement(locator).isDisplayed();
    }

    protected boolean isClickable(By locator) {
        new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.elementToBeClickable(getElement(locator)));
        return getElement(locator).isDisplayed() && getElement(locator).isEnabled();
    }

    protected WebElement getElement(By locator) {
        return waitElement(locator);
    }

    protected List<WebElement> getElements(By locator) {
        return waitElements(locator);
    }


    protected void fillInput(String dados, By locator) {
        isVisible(locator);
        getElement(locator).clear();
        getElement(locator).sendKeys(dados);
    }

    protected void click(By locator) {
        isClickable(locator);
        getElement(locator).click();
    }

}