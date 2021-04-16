package testes.contrato;

        import io.restassured.RestAssured;
        import org.apache.http.HttpStatus;
        import org.junit.Test;
        import utils.Constantes;

        import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

        public class v3_movie_ContractTest implements Constantes {

        @Test
        public void exemploContratoValidarFilme() {

        RestAssured.when()
        .get(APP_BASE_URL + API_V3_MOVIE + API_KEY)
        .then().statusCode(HttpStatus.SC_OK)
        .body(matchesJsonSchemaInClasspath("Schemas/v3_movie-Schema.json"));
        }
        }
