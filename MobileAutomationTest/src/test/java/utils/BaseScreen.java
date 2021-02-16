package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BaseScreen extends MobileElement {

    private static final long DEFAULT_TIME_WAIT = 10;

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumManager.getDriver()), this);
    }

    protected WebElement waitElement(MobileElement mobileElement) {
        return new WebDriverWait(AppiumManager.getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.visibilityOf(mobileElement));
    }

    protected WebElement getElement(MobileElement mobileElement) {
        return waitElement(mobileElement);
    }

    protected boolean isVisible(MobileElement mobileElement) {
        new WebDriverWait(AppiumManager.getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.visibilityOf(getElement(mobileElement)));
        return getElement(mobileElement).isDisplayed();
    }

    protected boolean isClickable(MobileElement mobileElement) {
        new WebDriverWait(AppiumManager.getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.elementToBeClickable(getElement(mobileElement)));
        return getElement(mobileElement).isDisplayed() && getElement(mobileElement).isEnabled();
    }
    protected void fillInput(String dados, MobileElement mobileElement) {
        isVisible(mobileElement);
        getElement(mobileElement).sendKeys(dados);
    }

    protected void click(MobileElement mobileElement) {
        isClickable(mobileElement);
        getElement(mobileElement).click();
    }



}