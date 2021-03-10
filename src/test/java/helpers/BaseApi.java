package helpers;

import com.google.gson.Gson;
import helpers.enums.Roles;

public class BaseApi {
    protected final NetworkManager networkManager;
    protected final Gson gson;

    protected BaseApi() {
        this.networkManager = new NetworkManager();
        this.gson = new Gson();
    }

    protected String getUrl(Roles role) {
        if (role == Roles.User) {
            return "/api/Auth/Login";
        } else if (role == Roles.Default || role == Roles.Guest) {
            return "";
        }
        return "/api/Auth/AdminLogin";
    }

    protected String getUrlForProduct() {
        return "/api/Product/List";
    }

    protected String getUrlForDoctorList() {
        return "/api/Doctor/List";
    }

}
