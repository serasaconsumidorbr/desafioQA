package testes.contrato;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Test;
import utils.Constantes;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class v3_person_ContractTest implements Constantes {

    @Test
    public void exemploContratoValidarPessoa() {

        RestAssured.when()
                .get(APP_BASE_URL + API_V3_PERSON + API_KEY)
                .then().statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath("Schemas/v3_person-Schema.json"));
    }
}


