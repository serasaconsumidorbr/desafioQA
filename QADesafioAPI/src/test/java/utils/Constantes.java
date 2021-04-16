package utils;

import io.restassured.http.ContentType;

public interface Constantes {


    String Key ="$SUA_KEY";
    String APP_BASE_URL= "https://api.themoviedb.org/";
    //Integer APP_PORT = null;
    String API_V3_TV = "/3/tv/85271?";
    String API_V3_MOVIE = "/3/movie/85271?";
    String API_V3_PERSON = "/3/person/85271?";
    String API_KEY = "api_key=" + Key;
    String APP_BASE_PATH = "";

    ContentType APP_CONTENTE_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT= 5000L;
}
