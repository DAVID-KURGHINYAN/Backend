package modules.user.apis;

import com.google.gson.reflect.TypeToken;
import helpers.*;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.user.models.request.ReqAdminCreateModel;
import modules.user.models.request.ReqLoginModel;
import modules.user.models.request.ReqUserList;
import modules.user.models.response.*;

import java.lang.reflect.Type;
import java.util.List;

public class UserApi extends BaseApi {

    public ResponseModel<ResAdminLoginModel> adminLogin(ReqLoginModel model) {
        String json = gson.toJson(model);
        Type type = new TypeToken<ResponseModel<ResAdminLoginModel>>() {
        }.getType();
        Response response = networkManager.PostAdmin(json, getUriAdminLogin(), "", Languages.hy, Urls.Back, Roles.Admin);
        ResponseModel<ResAdminLoginModel> responseModel = gson.fromJson(response.responseText, type);
        responseModel.statusCode = response.statusCode;

        return responseModel;
    }

    public ResponseModel<List<ResAdminList>> GetAdminList(Roles role) {
        Response response = networkManager.Get("/api/Admin", "", Languages.hy, Urls.Back, role);
        Type collectionType = new TypeToken<ResponseModel<List<ResAdminList>>>() {
        }.getType();
        ResponseModel<List<ResAdminList>> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResAdminDetails> GetAdminById(Roles roles, String id) {
        Response response = networkManager.Get("/api/Admin/", id, Languages.hy, Urls.Back, roles);
        Type collectionType = new TypeToken<ResponseModel<ResAdminDetails>>() {
        }.getType();
        ResponseModel<ResAdminDetails> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResLoginModel> Login(ReqLoginModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Post(json, getUri(role), "", Languages.hy, Urls.Back, role);
        Type collectionType = new TypeToken<ResponseModel<ResLoginModel>>() {
        }.getType();
        ResponseModel<ResLoginModel> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<Boolean> CreateAdmin(ReqAdminCreateModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.PostAdmin(json, getUriAdmin(role), "", Languages.hy, Urls.Back, role);
        Type collectionType = new TypeToken<ResponseModel<Boolean>>() {
        }.getType();
        ResponseModel<Boolean> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<Boolean> EditAdmin(ReqAdminCreateModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Put(json, "/api/Admin/", "", Languages.hy, Urls.Back, role);
        Type collectionType = new TypeToken<ResponseModel<Boolean>>() {
        }.getType();
        ResponseModel<Boolean> responseModel = gson.fromJson(response.responseText, collectionType);
        responseModel.statusCode = response.statusCode;
        return responseModel;

    }

    public ResponseModel<List<ResGetUserAddressModel>> getUserAddress(Roles role) {
        Response response = networkManager.Get("/api/UserAddress", "", Languages.hy, Urls.Back, role);
        Type type = new TypeToken<ResponseModel<List<ResGetUserAddressModel>>>() {
        }.getType();
        ResponseModel<List<ResGetUserAddressModel>> responseModel = gson.fromJson(response.responseText, type);
        responseModel.statusCode = response.statusCode;
        return responseModel;

    }

    public ResponseModel<ResGetUserAddressModel> getUserAddressById(Roles role, String id) {
        Response response = networkManager.Get("/api/UserAddress/", id, Languages.hy, Urls.Back, role);
        Type type = new TypeToken<ResponseModel<ResGetUserAddressModel>>() {
        }.getType();
        ResponseModel<ResGetUserAddressModel> responseModel = gson.fromJson(response.responseText, type);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResUserList> userList(ReqUserList model, Roles role) {
        String json = gson.toJson(model);
        Response  response = networkManager.Post(json,getUriUserList(role),"",Languages.hy,Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResUserList>>(){}.getType();
        ResponseModel<ResUserList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
