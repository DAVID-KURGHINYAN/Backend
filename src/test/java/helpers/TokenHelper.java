package helpers;


import helpers.enums.Roles;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TokenHelper {

    public static String getToken(Roles role, String baseUrl){
        if (role == Roles.Admin) {
            return adminToken(baseUrl);
        }
        return "";
    }

    private static String adminToken(String baseUrl) {

        String url = baseUrl + "/api/Auth/AdminLogin";

        Map<String, String> map = new HashMap<>();
        map.put("username", "admin@gmail.com");
        map.put("password", "Password1/");

        JSONObject json = new JSONObject(map);

        Response response = given()
                .contentType("application/json")
                .header("languageName", "hy")
                .body(json.toJSONString())
                .post(url)
                .then().extract().response();
        return response.jsonPath().get("data.accessToken").toString();
    }
}
