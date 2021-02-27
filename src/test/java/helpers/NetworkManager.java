package helpers;

import helpers.enums.Languages;
import helpers.enums.Roles;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class NetworkManager {

    private static final String baseUrl = "https://alfaback.abmdemo.me";

    public String Get(String uri, String param, Languages language, Roles role) {
        String url = baseUrl + uri + param;

        Response response = given()
                .contentType("application/json")
                .header("languageName", language.toString())
                .header("Authorization", "Bearer " + TokenHelper.getToken(role, baseUrl))
                .get(url)
                .then()
                .extract()
                .response();

      return response.getBody().asString();
    }

    public <T, R> T Post(R requestModel, String uri, String param) {
        return null;
    }

    public void Put() {

    }

    public void Delete() {

    }
}
