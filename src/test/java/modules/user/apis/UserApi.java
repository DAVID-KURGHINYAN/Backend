package modules.user.apis;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import helpers.NetworkManager;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import modules.user.models.response.ResAdminDetails;
import modules.user.models.response.ResAdminList;
import modules.user.models.response.ResRegisterUser;

import java.lang.reflect.Type;
import java.util.List;

public class UserApi {
    private final NetworkManager networkManager;

    public UserApi() {
        networkManager = new NetworkManager();
    }

//    public ResponseModel<ResRegisterUser> RegisterUser(ResRegisterUser model) {
//        return networkManager.Get("/api/Admin","", Languages.hy, Roles.Admin);
//    }

    public ResponseModel<List<ResAdminList>> GetAdminList() {
        String response = networkManager.Get("/api/Admin", "", Languages.hy, Roles.Admin);

        Gson gson = new Gson();
        Type collectionType = new TypeToken<ResponseModel<List<ResAdminList>>>() {
        }.getType();
        return gson.fromJson(response, collectionType);
    }

    public ResponseModel<ResAdminDetails> GetAdminById(String id) {
        String response = networkManager.Get("/api/Admin/", id, Languages.hy, Roles.Admin);

        Gson gson = new Gson();
        Type collectionType = new TypeToken<ResponseModel<ResAdminDetails>>() {
        }.getType();
        return gson.fromJson(response, collectionType);
    }
}
