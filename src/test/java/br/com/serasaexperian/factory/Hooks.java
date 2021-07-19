package br.com.serasaexperian.factory;

import org.junit.AfterClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;

public class Hooks {

	public static AppiumDriver<MobileElement> driver;

	@Before
	public void setup() {
		driver = DriverFactory.getInstance(System.getProperty("platform"), System.getProperty("device"));
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
