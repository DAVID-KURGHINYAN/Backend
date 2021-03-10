package helpers;

import helpers.enums.Languages;
import helpers.enums.Roles;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class NetworkManager {

    private static final String baseUrl = "https://alfaback.abmdemo.me";

    public helpers.Response Get(String uri, String param, Languages language, Roles role) {
        String url = baseUrl + uri + param;
        RequestSpecification specification = given()
                .contentType("application/json")
                .header("languageName", language.toString());
        if (role != Roles.Default) {
            specification = specification.header("Authorization", "Bearer " + TokenHelper.getToken(role));
        }

        Response response = specification
                .get(url)
                .then()
                .extract()
                .response();

        return new helpers.Response(response.getBody().asString(), response.getStatusCode());
    }

    public helpers.Response Post(String body, String uri, String param, Languages language, Roles role) {
        String url = baseUrl + uri + param;
        RequestSpecification specification = given()
                .contentType("application/json")
                .header("languageName", language.toString());
        if (role != Roles.Default) {
            specification = specification.header("Authorization", "Bearer " + TokenHelper.getToken(role));
        }
        Response response = specification
                .body(body)
                .post(url)
                .then()
                .extract()
                .response();

        return new helpers.Response(response.getBody().asString(), response.getStatusCode());
    }

    public helpers.Response Put(String body, String uri, String param, Languages language, Roles role) {
        String url = baseUrl + uri + param;
        RequestSpecification specification = given()
                .contentType("application/json")
                .header("languageName", language.toString());
        if (role != Roles.Default && role != Roles.Guest) {
            specification = specification.header("Authorization","Bearer "+TokenHelper.getToken(role));
        }
        Response response = specification
                .body(body)
                .put(url)
                .then()
                .extract()
                .response();
        return new helpers.Response(response.getBody().asString(),response.getStatusCode());
    }

    public void Delete() {

    }
}
