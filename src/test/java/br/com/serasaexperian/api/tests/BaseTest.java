package br.com.serasaexperian.api.tests;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;
import org.testng.annotations.BeforeClass;

import br.com.serasaexperian.apis.Authentication;
import br.com.serasaexperian.apis.Helper;
import io.restassured.RestAssured;

public class BaseTest {
	
	public String guestSessionId = "";
	
	@BeforeClass
	public void setup() {
		
		RestAssured.baseURI = Helper.path("BASE_URI");
		
		enableLoggingOfRequestAndResponseIfValidationFails();
		
		guestSessionId = Authentication.getGuestSessionId();
	}
}
