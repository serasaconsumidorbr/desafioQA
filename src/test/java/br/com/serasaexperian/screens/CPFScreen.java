package br.com.serasaexperian.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CPFScreen extends BaseScreen {

	@AndroidFindBy(id = "edittext_cpf_dialog")
	private MobileElement cpfInput;
	
	@AndroidFindBy(id = "button_confirm_action")
	private MobileElement confirmBtn;
	
	@AndroidFindBy(id = "textinput_error")
	private MobileElement alertMessage;

	public CPFScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public SignUpScreen loginToSystem(String cpf) {
		sendValue(cpfInput, cpf);
		clickOn(confirmBtn);
		return new SignUpScreen(driver);
	}
	
	public String getErrorMessage() {
		return alertMessage.getText();
	}
}
