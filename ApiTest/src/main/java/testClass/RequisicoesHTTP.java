package testClass;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import io.restassured.http.ContentType;

public class RequisicoesHTTP {

	@Test
	public void getIsApiUp() {
		given()
			.log().all().
		when()
			.get("https://api.themoviedb.org").then().statusCode(200)
				.contentType(ContentType.HTML)
				.contentType(containsString("utf-8"))
				.body(is(notNullValue()));
	}

	@Test
	public void authenticateNewToken() {
		given()
		.when()
			.get("https://api.themoviedb.org/3/authentication/token/new?api_key=ENTER_YOUR_API_KEY_HERE")
		.then()
			.log().all()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.contentType(containsString("utf-8"))
			.body("success", is(true))
			.body("request_token", is(notNullValue()));
	}

	@Test
	public void getValidateBodyMadMax() {
		given()
			.log().all()
		.when()
			.get("https://api.themoviedb.org/3/movie/76341?api_key=ENTER_YOUR_API_KEY_HERE")
		.then()
			.log().all()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.contentType(containsString("utf-8"))
			.body(is(notNullValue())).body("belongs_to_collection.id", is(8945))
			.body("belongs_to_collection.name", is("Mad Max Collection"))
			.body("genres.name[0]", is("Action"))
			.body("genres.name[1]", is("Adventure"))
			.body("genres.name[2]", is("Science Fiction"))
			.body("genres", hasSize(3))
			.body("production_companies[0].name", is("Kennedy Miller Productions"))
			.body("production_companies[1].name", containsString("Warner Bros. Pictures"))
			.body("production_companies", hasSize(4));
	}

	@Test
	public void validateLoginWithNewToken() {

		Map<String, String> request = new LinkedHashMap<>();

		request.put("username", "ENTER_YOUR_USERNAME_HERE");
		request.put("password", "ENTER_YOUR_PASSWORD_HERE");
		request.put("request_token", "ENTER_YOUR_REQUEST_TOKEN_HERE");

		given()
			.log().all()
			.contentType(ContentType.JSON)
			.body(request)
		.when()
			.post("https://api.themoviedb.org/3/authentication/token/validate_with_login?api_key=ENTER_YOUR_API_KEY_HERE")
		.then()
			.log().all()
			.statusCode(200);
	}

	@Test
	public void authenticationSessionId() {
		Map<String, String> request = new LinkedHashMap<>();
		request.put("request_token", "ENTER_YOUR_REQUEST_TOKEN_HERE");

		given()
			.log().all()
			.contentType(ContentType.JSON)
			.body(request)
		.when()
			.delete("https://api.themoviedb.org/3/authentication/session/new?api_key=ENTER_YOUR_API_KEY_HERE")
		.then()
			.log().all()
			.statusCode(200);
	}

	@Test
	public void deleteSession() {

		Map<String, String> request = new LinkedHashMap<>();
		request.put("session_id", "ENTER_YOUR_SESSION_ID_HERE");

		given()
			.log().all()
			.contentType(ContentType.JSON)
			.body(request)
		.when()
			.delete("https://api.themoviedb.org/3/authentication/session?api_key=ENTER_YOUR_API_KEY_HERE")
			.then()
			.log().all()
			.statusCode(200);
	}

}
