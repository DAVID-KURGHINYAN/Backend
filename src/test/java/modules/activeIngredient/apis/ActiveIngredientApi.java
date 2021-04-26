package modules.activeIngredient.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.activeIngredient.models.request.ReqActiveIngredient;
import modules.activeIngredient.models.response.ResActiveIngredient;

import java.lang.reflect.Type;

public class ActiveIngredientApi extends BaseApi {

    public ResponseModel<ResActiveIngredient> getActiveIngredient(ReqActiveIngredient model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUriActiveIngredient(role),"", Languages.hy, Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResActiveIngredient>>(){}.getType();
        ResponseModel<ResActiveIngredient> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
