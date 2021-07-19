package br.com.serasaexperian.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;

public class OnboardingScreen extends BaseScreen {

    @AndroidFindAll({
    	@AndroidBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textStartsWith(\"PRÓXIMO\")"),
    	@AndroidBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textStartsWith(\"VAMOS LÁ\")"),
    	@AndroidBy(id = "onboarding_button_next")
    })
    private MobileElement nextBtn;
    
	public OnboardingScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public CPFScreen navigateThroughOnboarding() {
		while (waitElementVisible(nextBtn)) {
			clickOn(nextBtn);
		}
		return new CPFScreen(driver);
	}
}
