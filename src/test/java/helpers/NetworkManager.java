package helpers;

import helpers.enums.Languages;
import helpers.enums.Roles;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class NetworkManager {

    private static final String baseUrl = "https://alfaback.abmdemo.me";
    private static final String baseUrlAdmin = "https://abmdelivery.abmdemo.me";
    private static final String baseUrlBranchAdmin = "https://alfaadmin.abmdemo.me/";

    public helpers.Response PostBranchAdmin(String body, String uri, String param, Languages language, Roles role) {
        String url = baseUrlBranchAdmin + uri + param;
        RequestSpecification specification = given()
                .contentType("application/json")
                .header("languageName", language.toString());
        if (role == Roles.BranchAdmin) {
            specification = specification.header("Authorization", "Bearer " + TokenHelper.getToken(Roles.BranchAdmin));
        }
        Response response = specification
                .body(body)
                .post(url)
                .then()
                .extract().response();

        return new helpers.Response(response.getBody().asString(), response.getStatusCode());
    }

    public helpers.Response PostAdmin(String body, String uri, String param, Languages language, Roles role) {
        String url = baseUrl + uri + param;
        RequestSpecification specification = given()
                .contentType("application/json")
                .header("languageName", language.toString());
        if (role != Roles.Default) {
            specification = specification.header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2NjIyNDQxNS00YjljLTQyZjctYjU2MC1kNmViOWI5M2Y1MGQiLCJ1bmlxdWVfbmFtZSI6ImFkbWluQGdtYWlsLmNvbSIsImp0aSI6Ijc1YWJkODcxLTU1N2ItNGU3MC1hNWYxLWQ0NmMwZDlmZjAzNiIsImlhdCI6MTYxNzEwNTE5OCwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiU3VwZXJBZG1pbiIsIm5iZiI6MTYxNzEwNTE5OCwiZXhwIjoxNjQ4NjQxMTk4LCJpc3MiOiJ3ZWJBcGkiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjUwMDAvIn0.ZOCp-NvPNNlDhwzWVbGZgpSaj-4bMsz5N84_zY8slD0");
        }
        Response response = specification
                .body(body)
                .post(url)
                .then()
                .extract()
                .response();

        return new helpers.Response(response.getBody().asString(), response.getStatusCode());
    }

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
            specification = specification.header("Authorization", "Bearer " + TokenHelper.getToken(role));
        }
        Response response = specification
                .body(body)
                .put(url)
                .then()
                .extract()
                .response();
        return new helpers.Response(response.getBody().asString(), response.getStatusCode());
    }
}
