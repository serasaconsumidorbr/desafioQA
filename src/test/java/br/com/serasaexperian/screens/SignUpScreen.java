package br.com.serasaexperian.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpScreen extends BaseScreen {

	@AndroidFindBy(id = "button_confirm_action")
	private MobileElement signUpBtn;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	private MobileElement dataInput;

	@AndroidFindBy(id = "button_next")
	private MobileElement nextBtn;

	@AndroidFindBy(id = "textview_title")
	private MobileElement textviewTitle;
	
	@AndroidFindBy(id = "textinput_error")
	private MobileElement alertMessage;

	public SignUpScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public SignUpScreen fillForm(String name, String dateBirth, String email) {
		inputName(name);
		inputBirthday(dateBirth);
		inputEmail(email);	
		clickOn(nextBtn);
		return new SignUpScreen(driver);
	}

	public SignUpScreen inputName(String name) {
		clickOn(signUpBtn);
		sendValue(dataInput, name);
		return new SignUpScreen(driver);
	}
	
	public SignUpScreen inputBirthday(String dateBirth) {
		clickOn(nextBtn);
		sendValue(dataInput, dateBirth);
		return new SignUpScreen(driver);
	}
	
	private void inputEmail(String email) {
		clickOn(nextBtn);
		sendValue(dataInput, email);
	}

	public String getTextviewTitle() {
		return textviewTitle.getText();
	}
	
	public String getErrorMessage() {
		return alertMessage.getText();
	}
}
