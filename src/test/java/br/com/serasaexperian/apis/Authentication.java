package br.com.serasaexperian.apis;

import static io.restassured.RestAssured.given;
import org.apache.http.HttpStatus;
import io.restassured.http.ContentType;

public class Authentication {
	
	public static String getGuestSessionId() {
		
		String guestSessionId =
				given()
					.contentType(ContentType.JSON)
					.auth()
					.oauth2(Credentials.BEAR.getValue())
				.when()
					.get(Helper.path("GUEST_SESSION"))
				.then()
					.statusCode(HttpStatus.SC_OK)
					.extract()
					.path("guest_session_id");
		
		return guestSessionId;
	}
}
