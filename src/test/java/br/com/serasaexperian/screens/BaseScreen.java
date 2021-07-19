package br.com.serasaexperian.screens;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BaseScreen {

	private static final int POLLING_TIMEOUT = 250;
	private static final int MAX_SECONDS_TIMEOUT = 8;
	protected AppiumDriver<MobileElement> driver;
	private Wait<WebDriver> wait;

	public BaseScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(MAX_SECONDS_TIMEOUT))
				.pollingEvery(Duration.ofMillis(POLLING_TIMEOUT))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(IndexOutOfBoundsException.class);
	}

	protected void sendValue(MobileElement element, CharSequence value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	}

	protected void clickOn(MobileElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	protected boolean waitElementVisible(MobileElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
	   } catch (TimeoutException e) {
		   return false;	   
	   }
	}
}
