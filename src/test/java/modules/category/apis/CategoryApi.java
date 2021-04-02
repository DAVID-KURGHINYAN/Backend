package modules.category.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import modules.category.models.response.ResGetCategoryModel;

import java.lang.reflect.Type;
import java.util.List;

public class CategoryApi extends BaseApi {
    public ResponseModel<List<ResGetCategoryModel>> getCategory() {
        Response response = networkManager.Get(getUriCategory(), "", Languages.hy, Roles.Guest);
        Type type = new TypeToken<ResponseModel<List<ResGetCategoryModel>>>() {
        }.getType();
        ResponseModel<List<ResGetCategoryModel>> responseModel = gson.fromJson(response.responseText, type);
        responseModel.statusCode = response.statusCode;
        return responseModel;

    }
}
