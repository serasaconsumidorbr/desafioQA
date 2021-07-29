package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileDriver.AndroidAppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage extends MobileElement {

    private static final long DEFAULT_TIME_WAIT = 10;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppiumDriver.driver()), this);
    }

    protected WebElement esperarElemento(MobileElement mobileElement) {
        return new WebDriverWait(AndroidAppiumDriver.driver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.visibilityOf(mobileElement));
    }

    protected WebElement obtenhoElement(MobileElement mobileElement) {
        return esperarElemento(mobileElement);
    }

    protected boolean elementoVisivel(MobileElement mobileElement) {
        new WebDriverWait(AndroidAppiumDriver.driver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.visibilityOf(obtenhoElement(mobileElement)));
        return obtenhoElement(mobileElement).isDisplayed();
    }

    protected void inserirDados(String dados, MobileElement mobileElement) {
        elementoVisivel(mobileElement);
        obtenhoElement(mobileElement).sendKeys(dados);
    }

    protected boolean exibirClique(MobileElement mobileElement) {
        new WebDriverWait(AndroidAppiumDriver.driver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.elementToBeClickable(obtenhoElement(mobileElement)));
        return obtenhoElement(mobileElement).isDisplayed() && obtenhoElement(mobileElement).isEnabled();
    }

    protected void tocar(MobileElement mobileElement) {
        exibirClique(mobileElement);
        obtenhoElement(mobileElement).click();
    }

}