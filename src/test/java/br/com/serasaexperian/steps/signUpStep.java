package br.com.serasaexperian.steps;

import org.junit.Assert;

import br.com.serasaexperian.factory.DriverFactory;
import br.com.serasaexperian.screens.CPFScreen;
import br.com.serasaexperian.screens.OnboardingScreen;
import br.com.serasaexperian.screens.SignUpScreen;
import br.com.serasaexperian.utils.FakerData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUpStep {
	
	public static AppiumDriver<MobileElement> driver = DriverFactory.getDriver();
	
	FakerData faker = new FakerData();

	@Given("I navigate through the onboarding screens")
	public void i_navigate_through_the_onboarding_screens() {
		new OnboardingScreen(driver).navigateThroughOnboarding();
	}

	@When("I input the CPF {string}")
	public void i_input_the_cpf(String cpf) {
		new CPFScreen(driver).loginToSystem(cpf);
	}
	
	@When("I submit the form with valid data")
	public void i_submit_the_form_with_valid_data() {
		new SignUpScreen(driver).fillForm(FakerData.getFakeName(), FakerData.getBirthdayDate(), FakerData.getFakeEmail());
	}
	
	@Then("Should display the title {string}")
	public void should_display_the_title(String title) {
		Assert.assertEquals(title, new SignUpScreen(driver).getTextviewTitle());
	}
	
	@Then("Should display the input error message {string}")
	public void should_display_the_input_error_message(String inputError) {
		Assert.assertEquals(inputError, new CPFScreen(driver).getErrorMessage());
	}
	
	@When("I submit the form with the birthday {string}")
	public void i_submit_the_form_with_the_birthday(String birthday) {
		new SignUpScreen(driver).inputName(FakerData.getFakeName()).inputBirthday(birthday);
	}
	
	@Then("Should display the sign-up error {string}")
	public void should_display_the_signup_error(String signupError) {
		Assert.assertEquals(signupError, new SignUpScreen(driver).getErrorMessage());
	}
}
