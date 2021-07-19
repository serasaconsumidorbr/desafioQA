package br.com.serasaexperian.api.tests;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import br.com.serasaexperian.apis.Credentials;
import br.com.serasaexperian.apis.Helper;
import io.restassured.http.ContentType;

public class MovieTest extends BaseTest {
	
	private static final String POPULAR_MOVIE_SCHEMA = "schemas/popular_movie.json";
	private static final String MOVIE_SCHEMA = "schemas/movie_by_id.json";
	private static final int MOVIE_ID = 550;
	
  @Test
  public void should_return_all_popular_movies() {
	  
	 given()
	    .accept(ContentType.JSON)
	    .queryParam("language", "en-US")
	    .queryParam("page", 1)
		.auth()
		.oauth2(Credentials.BEAR.getValue())
	.when()
		.get(Helper.path("LIST_ALL_POPULAR_MOVIES"))
	.then()
		.log().status()
		.statusCode(HttpStatus.SC_OK)
		.body(matchesJsonSchemaInClasspath(POPULAR_MOVIE_SCHEMA));
  }
  
  @Test
  public void should_get_a_popular_movie_by_id() {
	  
	 given()
	    .accept(ContentType.JSON)
	    .pathParam("movie_id", MOVIE_ID)
		.auth()
		.oauth2(Credentials.BEAR.getValue())
	.when()
		.get(Helper.path("MOVIE_BY_ID"))
	.then()
		.log().status()
		.statusCode(HttpStatus.SC_OK)
		.body(matchesJsonSchemaInClasspath(MOVIE_SCHEMA))
		.body("id", equalTo(MOVIE_ID));
  }
  
  
  @Test
  public void should_register_movie_rating() {
	  
	 String requestBody = "{\"value\":8.5}";
	  
	 given()
	    .header("Content-type", "application/json")
	    .pathParam("movie_id", MOVIE_ID)
	    .queryParam("api_key", Credentials.API_KEY.getValue())
	    .queryParam("guest_session_id", guestSessionId)
		.body(requestBody)
	.when()
		.post(Helper.path("RATING_BY_ID"))
	.then()
		.log().status()
		.statusCode(HttpStatus.SC_CREATED)
		.body("status_message", equalTo("Success."));
  }
}
