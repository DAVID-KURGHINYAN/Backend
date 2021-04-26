package modules.brand.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.brand.models.request.ReqBrandList;
import modules.brand.models.response.ResBrandList;

import java.lang.reflect.Type;

public class BrandApi extends BaseApi {

    public ResponseModel<ResBrandList> getBrandList(ReqBrandList model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json, getUriBrandList(role),"", Languages.hy, Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResBrandList>>(){}.getType();
        ResponseModel<ResBrandList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
