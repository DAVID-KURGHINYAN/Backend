package modules.user.apis;

import com.google.gson.reflect.TypeToken;
import helpers.*;
import helpers.enums.Languages;
import helpers.enums.Roles;
import modules.user.models.request.ReqAdminCreateModel;
import modules.user.models.request.ReqLoginModel;
import modules.user.models.response.ResAdminDetails;
import modules.user.models.response.ResAdminList;
import modules.user.models.response.ResLoginModel;

import java.lang.reflect.Type;
import java.util.List;

public class UserApi extends BaseApi {

    public ResponseModel<List<ResAdminList>> GetAdminList(Roles role) {
        Response response = networkManager.Get("/api/Admin", "", Languages.hy, role);
        Type collectionType = new TypeToken<ResponseModel<List<ResAdminList>>>() {
        }.getType();
        ResponseModel<List<ResAdminList>> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResAdminDetails> GetAdminById(Roles roles, String id) {
        Response response = networkManager.Get("/api/Admin/", id, Languages.hy, roles);
        Type collectionType = new TypeToken<ResponseModel<ResAdminDetails>>() {
        }.getType();
        ResponseModel<ResAdminDetails> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResLoginModel> Login(ReqLoginModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Post(json, getUrl(role), "", Languages.hy, Roles.Default);
        Type collectionType = new TypeToken<ResponseModel<ResLoginModel>>() {}.getType();
        ResponseModel<ResLoginModel> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<Boolean> CreateAdmin(ReqAdminCreateModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Post(json, "/api/Admin/", "", Languages.hy, role);
        Type collectionType = new TypeToken<ResponseModel<Boolean>>() {}.getType();
        ResponseModel<Boolean> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<Boolean> EditAdmin(ReqAdminCreateModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Put(json, "/api/Admin/", "", Languages.hy, role);
        Type collectionType = new TypeToken<ResponseModel<Boolean>>() {}.getType();
        ResponseModel<Boolean> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;

    }
}
